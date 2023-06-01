package part2

fun main() {
    val f: FileIO = FileProperties()

    f.readFromFile("file.txt")
    f.setValue("width", "1024")
    f.setValue("height", "512")
    f.setValue("depth", "32")
    f.writeToFile("newFile.txt")
}
