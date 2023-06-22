package part7

import java.io.FileWriter
import java.io.IOException

class HtmlBuilder : Builder {
    private var filename: String = "untitled.html"
    private val sb = StringBuilder()

    override fun makeTitle(title: String) {
        filename = "${title}.html"

        sb.append(
            """
            <!DOCTYPE html>
            <html lang="ko">
            <head>
                <title>${title}</title>
                <meta charset="utf-8">
            </head>
            <body>
                <h1>${title}</h1>
            """.trimIndent()
        )
    }

    override fun makeString(str: String) {
        sb.append("<p>${str}</p>\n\n")
    }

    override fun makeItems(items: Array<String>) {
        sb.append("<ul>\n")
        items.forEach { sb.append("<li>${it}</li>\n") }
        sb.append("</ul>\n\n")
    }

    override fun close() {
        sb.append(
            """
            </body>
            </html>
            """.trimIndent()
        )

        try {
            FileWriter(filename).use { it.write(sb.toString()) }
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
    }

    fun getHTMLResult(): String = filename
}
