package part13

class File(private val name: String, private val size: Int) : Entry() {

    override fun getName(): String = name

    override fun getSize(): Int = size

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}
