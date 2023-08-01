package part13

import java.io.IOException
import java.nio.file.FileVisitResult
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.SimpleFileVisitor
import java.nio.file.attribute.BasicFileAttributes

class MyFileVisitor : SimpleFileVisitor<Path>() {
    override fun preVisitDirectory(dir: Path?, attrs: BasicFileAttributes?): FileVisitResult {
        println("dir: $dir")
        return FileVisitResult.CONTINUE;
    }

    override fun visitFile(file: Path?, attrs: BasicFileAttributes?): FileVisitResult {
        println("file: $file")
        return FileVisitResult.CONTINUE;
    }
}

fun main() {
    val dirName = "/Users/jaeyeongyang/cenacle/cenacle-works"

    try {
        val visitor = MyFileVisitor()
        val root = Path.of(dirName)
        Files.walkFileTree(root, visitor)
    } catch (ex: IOException) {
        ex.printStackTrace()
    }
}
