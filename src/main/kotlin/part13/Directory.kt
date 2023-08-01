package part13

class Directory(private val name: String) : Entry(), Iterable<Entry> {
    val directory: MutableList<Entry> = mutableListOf()

    override fun getName(): String = name

    // override fun getSize(): Int = directory.sumOf { it.getSize() }

    override fun getSize(): Int {
        val sizeVisitor = SizeVisitor()
        accept(sizeVisitor)
        return sizeVisitor.getSize()
    }

    fun add(entry: Entry): Directory {
        directory.add(entry)
        return this
    }

    override fun iterator(): Iterator<Entry> = directory.iterator()

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}
