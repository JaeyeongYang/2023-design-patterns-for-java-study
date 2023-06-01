package part2

import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.*

class FileProperties : Properties(), FileIO {
    override fun readFromFile(filename: String) {
        val fileInputStream = FileInputStream(filename)
        load(fileInputStream)
    }

    override fun writeToFile(filename: String) {
        val fileOutputStream = FileOutputStream(filename)
        store(fileOutputStream, "written by FileProperties")
    }

    override fun setValue(key: String, value: String) {
        put(key, value)
    }

    override fun getValue(key: String): String = get(key) as String
}
