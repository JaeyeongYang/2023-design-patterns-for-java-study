package part23

import java.nio.file.Files
import java.nio.file.Path

fun main() {
    try {
        val lines = Files.readAllLines(Path.of("program.txt"))
        lines.forEach { text ->
            println("text = \"$text\"")
            val node = ProgramNode()
            node.parse(Context(text))
            println("node = $node")
        }
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
}
