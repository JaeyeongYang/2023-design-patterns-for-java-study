package part8.divfactory

import part8.factory.Page

class DivPage(title: String, author: String) : Page(title, author) {
    override fun makeHTML(): String =
        """
        <!DOCTYPE html>
        <html>
        <head>
            <title>$title</title>
            <style>
                div.tray {
                    padding: 0.5em;
                    margin-left: 5em;
                    border: 1px solid black;
                }
                
                div.link {
                    padding: 0.5em;
                    background-color: lightgray;
                }
            </style>
        </head>
        <body>
            <h1>$title</h1>
            ${content.joinToString(separator = "\n") { item -> item.makeHTML() }}
            <hr>
            <address>$author</address>
        </body>
        </html>
        """.trimIndent()
}
