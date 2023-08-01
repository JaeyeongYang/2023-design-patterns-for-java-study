package part11

abstract class Entry {
    abstract fun getPrefix(): String

    abstract fun setPrefix(prefix: String)

    abstract fun getName(): String

    abstract fun getSize(): Int

    fun printList() {
        printList("")
    }

    abstract fun printList(prefix: String)

    abstract fun printFullPathList()

    override fun toString(): String = "${getName()} (${getSize()})"

    fun toFullPathString(): String = "${getPrefix()}/${getName()} (${getSize()})"
}
