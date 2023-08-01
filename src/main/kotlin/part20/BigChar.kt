package part20

import java.io.FileReader
import java.io.IOException

class BigChar(val charname: Char) {
    var fontdata: String
        private set

    init {
        fontdata = try {
            val filename = "big${charname}.txt"
            val file = javaClass.classLoader.getResource("part20/$filename")!!.file
            val lines: List<String> = FileReader(file).use {
                it.readLines()
            }

            lines.joinToString(separator = "\n", postfix = "\n")
        } catch (e: IOException) {
            "$charname?"
        }
    }

    fun print() {
        print(fontdata)
    }
}
