package part12

class FullBorder(display: Display) : Border(display) {
    override fun getColumns(): Int = display.getColumns() + 2

    override fun getRows(): Int = display.getRows() + 2

    override fun getRowText(row: Int): String =
        if (row == 0 || row == display.getRows() + 1) {
            "+" + "-".repeat(display.getColumns()) + "+"
        } else {
            "|" + display.getRowText(row - 1) + "|"
        }
}
