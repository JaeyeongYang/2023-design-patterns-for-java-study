package part12

class UpDownBorder(display: Display, private val borderChar: Char) : Border(display){
    override fun getColumns(): Int = display.getColumns()

    override fun getRows(): Int = display.getRows() + 2

    override fun getRowText(row: Int): String =
        if (row == 0 || row == display.getRows() + 1) {
            borderChar.toString().repeat(display.getColumns())
        } else {
            display.getRowText(row - 1)
        }
}
