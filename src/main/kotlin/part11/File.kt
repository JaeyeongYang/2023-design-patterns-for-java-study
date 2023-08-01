package part11

class File(private val name: String, private val size: Int) : Entry() {
    private var prefix: String = ""

    override fun getPrefix(): String = prefix

    override fun setPrefix(prefix: String) {
        this.prefix = prefix
    }

    override fun getName(): String = name

    override fun getSize(): Int = size

    override fun printList(prefix: String) {
        println("${prefix}/${this}")
    }

    override fun printFullPathList() {
        println(toFullPathString())
    }
}
