package part8.listfactory

import part8.factory.Link

class ListLink(caption: String, url: String) : Link(caption, url) {
    override fun makeHTML(): String =
        """
        <li><a href="$url">$caption</a></li>
        """.trimIndent()
}
