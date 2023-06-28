package part8.divfactory

import part8.factory.Link

class DivLink(caption: String, url: String): Link(caption, url) {
    override fun makeHTML(): String =
        """
        <div class="link"><a href="$url">$caption</a></div>
        """.trimIndent()
}
