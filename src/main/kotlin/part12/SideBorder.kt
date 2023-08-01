package part12

class SideBorder(display: Display, private val borderChar: Char): Border(display) {
    override fun getColumns(): Int = display.getColumns() + 2

    override fun getRows(): Int = display.getRows()

    override fun getRowText(row: Int): String = borderChar + display.getRowText(row) + borderChar
}
