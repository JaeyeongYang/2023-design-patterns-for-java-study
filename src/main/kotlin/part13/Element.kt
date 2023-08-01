package part13

interface Element {
    fun accept(visitor: Visitor)
}
