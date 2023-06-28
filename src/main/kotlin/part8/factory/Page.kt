package part8.factory

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption

abstract class Page(
    protected val title: String,
    protected val author: String
) {
    protected val content: MutableList<Item> = mutableListOf()

    fun add(item: Item) {
        content.add(item)
    }

    fun output(filename: String) {
        try {
            Files.writeString(
                Path.of(filename),
                makeHTML(),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE
            )
            println("${filename} 파일을 작성하였습니다.")
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
    }

    abstract fun makeHTML(): String
}
