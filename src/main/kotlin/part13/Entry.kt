package part13

abstract class Entry: Element {
    abstract fun getName(): String

    abstract fun getSize(): Int

    override fun toString(): String = "${getName()} (${getSize()})"
}
