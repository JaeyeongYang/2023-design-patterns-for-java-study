package part13

class SizeVisitor : Visitor() {
    private var size = 0

    override fun visit(file: File) {
        size += file.getSize()
    }

    override fun visit(directory: Directory) {
        directory.forEach { it.accept(this) }
    }

    fun getSize(): Int = size
}
