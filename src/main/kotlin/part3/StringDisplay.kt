package part3

class StringDisplay(private val string: String) : AbstractDisplay {
    private val width: Int
        get() = string.length

    override fun open() = printLine()

    override fun print() = println("|${string}|")

    override fun close() = printLine()

    private fun printLine() {
        print("+")
        repeat(width) {
            print("-")
        }
        println("+")
    }
}
