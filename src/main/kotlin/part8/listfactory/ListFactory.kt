package part8.listfactory

import part8.factory.Factory
import part8.factory.Link
import part8.factory.Page
import part8.factory.Tray

class ListFactory : Factory() {
    override fun createLink(caption: String, url: String): Link = ListLink(caption, url)

    override fun createTray(caption: String): Tray = ListTray(caption)

    override fun createPage(title: String, author: String): Page = ListPage(title, author)
}
