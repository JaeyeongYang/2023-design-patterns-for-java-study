package part13

class FileFindVisitor(private val pattern: String) : Visitor() {
    private val foundFiles: MutableList<File> = mutableListOf()

    override fun visit(file: File) {
        if (file.getName().contains(pattern)) {
            foundFiles.add(file)
        }
    }

    override fun visit(directory: Directory) {
        directory.forEach { it.accept(this) }
    }

    fun getFoundFiles(): List<File> = foundFiles.toList()
}
