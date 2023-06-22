package part7

class MarkdownBuilder : Builder{
    private val sb = StringBuilder()

    override fun makeTitle(title: String) {
        sb.append("# ${title}\n\n")
    }

    override fun makeString(str: String) {
        sb.append("## ${str}\n\n")
    }

    override fun makeItems(items: Array<String>) {
        items.forEach { sb.append("- ${it}\n") }
        sb.append("\n")
    }

    override fun close() {
    }

    fun getMarkdownResult(): String = sb.toString()
}
