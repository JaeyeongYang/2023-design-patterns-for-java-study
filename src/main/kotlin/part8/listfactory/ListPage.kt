package part8.listfactory

import part8.factory.Page

class ListPage(title: String, author: String) : Page(title, author) {
    override fun makeHTML(): String =
        """
        <!DOCTYPE html>
        <html>
        <head>
            <title>$title</title>
        </head>
        <body>
            <h1>$title</h1>
            <ul>
                ${content.joinToString(separator = "\n") { item -> item.makeHTML() }}
            </ul>
            <hr>
            <address>$author</address>
        </body>
        </html>
        """.trimIndent()
}
