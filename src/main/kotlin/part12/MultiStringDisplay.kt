package part12

class MultiStringDisplay(list: List<String> = listOf()) : Display() {
    private val lines: MutableList<String> = list.toMutableList()
    private val length: Int
        get() = lines.maxOfOrNull { it.length } ?: 0

    override fun getColumns(): Int = length

    override fun getRows(): Int = lines.size

    override fun getRowText(row: Int): String = lines[row].padEnd(length, ' ')

    fun add(string: String) {
        lines.add(string)
    }
}
