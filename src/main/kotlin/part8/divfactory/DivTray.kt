package part8.divfactory

import part8.factory.Tray

class DivTray(caption: String) : Tray(caption) {
    override fun makeHTML(): String =
        """
        <p><b>$caption</b></p>
        <div class="tray">
            ${tray.joinToString(separator = "\n") { item -> item.makeHTML() }}
        </div>
        """.trimIndent()
}
