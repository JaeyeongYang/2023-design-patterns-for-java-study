package part13

class ListVisitor : Visitor() {
    private var currentDir: String = ""

    override fun visit(file: File) {
        println("${currentDir}/${file}")
    }

    override fun visit(directory: Directory) {
        println("${currentDir}/${directory}")
        val saveDir = currentDir
        currentDir = "${currentDir}/${directory.getName()}"
        directory.forEach { it.accept(this) }
        currentDir = saveDir
    }
}
