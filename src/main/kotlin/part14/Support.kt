package part14

import sun.font.GlyphLayout.done

abstract class Support(val name: String, var next: Support? = null) {

    fun setNext(next: Support?): Support? {
        this.next = next
        return next
    }

    private val supportList: List<Support>
        get() = if (next != null) {
            listOf(listOf(this), next!!.supportList).flatten()
        } else {
            listOf(this)
        }

    fun support(trouble: Trouble) {
        if (resolve(trouble)) {
            done(trouble)
        } else if (next != null) {
            next?.support(trouble)
        } else {
            fail(trouble)
        }
    }

    fun supportLoop(trouble: Trouble) {
        for (support in supportList) {
            if (support.resolve(trouble)) {
                support.done(trouble)
                return
            }
        }
        fail(trouble)
    }

    override fun toString(): String = "[$name]"

    protected abstract fun resolve(trouble: Trouble): Boolean

    protected fun done(trouble: Trouble) {
        println("$trouble is resolved by $this")
    }

    protected fun fail(trouble: Trouble) {
        println("$trouble cannot be resolved")
    }
}
