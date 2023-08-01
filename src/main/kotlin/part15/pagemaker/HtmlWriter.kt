package part15.pagemaker

import java.io.Writer

internal class HtmlWriter(val writer: Writer) {

    fun title(title: String) {
        writer.apply {
            write("<!DOCTYPE html>")
            write("<html>")
            write("<head>")
            write("<title>$title</title>")
            write("</head>")
            write("<body>")
            write("\n")
            write("<h1>$title</h1>")
            write("\n")
        }
    }

    fun paragraph(msg: String) {
        writer.write("<p>$msg<p>\n")
    }

    fun link(href: String, caption: String) {
        paragraph("""<a href="$href">$caption</a>""")
    }

    fun mailto(mailaddr: String, username: String) {
        link("mailto:$mailaddr", username)
    }

    fun close() {
        writer.apply {
            write("</body>")
            write("</html>")
            close()
        }
    }
}
