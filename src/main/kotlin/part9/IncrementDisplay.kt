package part9

class IncrementDisplay(impl: DisplayImpl) : Display(impl) {
    fun incrementDisplay(lineNumber: Int) {
        for (i in 0 until lineNumber) {
            open()
            repeat(i) { print() }
            close()
        }
    }
}
