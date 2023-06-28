package part8.divfactory

import part8.factory.Factory
import part8.factory.Link
import part8.factory.Page
import part8.factory.Tray

class DivFactory : Factory() {
    override fun createLink(caption: String, url: String): Link = DivLink(caption, url)

    override fun createTray(caption: String): Tray = DivTray(caption)

    override fun createPage(title: String, author: String): Page = DivPage(title, author)
}
