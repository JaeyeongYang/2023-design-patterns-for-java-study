package part11

class Directory(private val name: String) : Entry() {
    private var prefix: String = ""
    val directory: MutableList<Entry> = mutableListOf()

    override fun getPrefix(): String = prefix

    override fun setPrefix(prefix: String) {
        this.prefix = prefix
    }

    override fun getName(): String = name

    override fun getSize(): Int = directory.sumOf { it.getSize() }

    override fun printList(prefix: String) {
        println("${prefix}/${this}")
        directory.forEach { it.printList("${prefix}/${name}") }
    }

    override fun printFullPathList() {
        println(toFullPathString())
        directory.forEach { it.printFullPathList() }
    }

    fun add(entry: Entry): Directory {
        directory.add(entry)
        entry.setPrefix("${prefix}/${name}")
        return this
    }
}
