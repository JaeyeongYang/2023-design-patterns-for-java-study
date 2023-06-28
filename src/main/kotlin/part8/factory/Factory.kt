package part8.factory

abstract class Factory {
    abstract fun createLink(caption: String, url: String): Link

    abstract fun createTray(caption: String): Tray

    abstract fun createPage(title: String, author: String): Page

    fun createNaverPage(): Page = createPage("Naver", "Naver").apply {
        add(createLink("Naver", "https://naver.com"))
    }

    companion object {
        @JvmStatic
        fun getFactory(className: String): Factory? {
            var factory: Factory? = null
            try {
                factory = Class.forName(className).getDeclaredConstructor().newInstance() as Factory
            } catch (ex: ClassNotFoundException) {
                println("${className} 클래스가 발견되지 않았습니다.")
            } catch (ex: Exception) {
                ex.printStackTrace()
            }
            return factory
        }
    }
}
