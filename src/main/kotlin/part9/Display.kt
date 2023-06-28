package part9

open class Display(private val impl: DisplayImpl) {
    open fun open() {
        impl.rawOpen()
    }

    open fun print() {
        impl.rawPrint()
    }

    open fun close() {
        impl.rawClose()
    }

    // in Kotlin, final for default
    fun display() {
        open()
        print()
        close()
    }
}
