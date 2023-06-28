package part9

import java.io.FileReader

class FileDisplayImpl(filename: String) : DisplayImpl() {
    private val lines: List<String>
    val width: Int

    init {
        FileReader(javaClass.classLoader.getResource(filename)!!.file).use {
            lines = it.readLines()
        }
        width = lines.maxOfOrNull { it.length } ?: 0
    }

    private fun printLine() {
        print("+")
        repeat(width) {
            print("-")
        }
        println("+")
    }

    override fun rawOpen() {
        printLine()
    }

    override fun rawPrint() {
        lines.forEach {
            println("|${it.padEnd(width)}|")
        }
    }

    override fun rawClose() {
        printLine()
    }
}
