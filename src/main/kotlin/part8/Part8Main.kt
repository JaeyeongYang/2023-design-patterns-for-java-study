package part8

import part8.factory.Factory
import part8.factory.Page
import part8.factory.Tray

fun main() {
    val filename = "part8.html"
//    val className: String = "part8.listfactory.ListFactory"
    val className = "part8.divfactory.DivFactory"

    val factory = Factory.getFactory(className) ?: throw RuntimeException("factory is not initialized.")

    // Blog
    val blogTray: Tray = factory.createTray("Blog Site").apply {
        add(factory.createLink("Blog 1", "https://example.com/blog1"))
        add(factory.createLink("Blog 2", "https://example.com/blog2"))
        add(factory.createLink("Blog 3", "https://example.com/blog3"))
    }

    // News
    val newsTray: Tray = factory.createTray("News Site").apply {
        add(factory.createLink("News 1", "https://example.com/news1"))
        add(factory.createLink("News 2", "https://example.com/news2"))
        add(factory.createTray("News 3").apply {
            add(factory.createLink("News 3 (US)", "https://example.com/news3/us"))
            add(factory.createLink("News 3 (KR)", "https://example.com/news3/kr"))
        })
    }

    // Page
    val page: Page = factory.createPage("Blog and News", "jaeyeong.com").apply {
        add(blogTray)
        add(newsTray)
    }

    page.output(filename)
}
