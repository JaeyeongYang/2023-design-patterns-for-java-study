package part8.listfactory

import part8.factory.Tray

class ListTray(caption: String) : Tray(caption) {
    override fun makeHTML(): String =
        """
        <li>
            $caption
            <ul>
                ${tray.joinToString(separator = "\n") { item -> item.makeHTML() }}
            </ul>
        </li>
        """.trimIndent()
}
