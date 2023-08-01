package part13

abstract class Visitor {
    abstract fun visit(file: File)

    abstract fun visit(directory: Directory)
}
