package part9

class StringDisplayImpl(val string: String) : DisplayImpl() {
    val width: Int = string.length

    private fun printLine() {
        print("+")
        repeat(width) {
            print("-")
        }
        println("+")
    }

    override fun rawOpen() {
        printLine()
    }

    override fun rawPrint() {
        println("|$string|")
    }

    override fun rawClose() {
        printLine()
    }
}
