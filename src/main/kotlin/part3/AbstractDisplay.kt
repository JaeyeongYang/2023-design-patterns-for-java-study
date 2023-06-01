package part3

interface AbstractDisplay {
    fun open()
    fun print()
    fun close()

    // 기본적으로 final
    fun display() {
        open()
        repeat(5) {
            print()
        }
        close()
    }
}
