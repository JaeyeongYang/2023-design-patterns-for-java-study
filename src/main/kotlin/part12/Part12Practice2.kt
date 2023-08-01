package part12

fun main() {
    val md = MultiStringDisplay().apply {
        add("Hi!")
        add("Good morning.")
        add("Good night!")
        show()
    }

    val d1 = SideBorder(md, '#')
    d1.show()

    val d2 = FullBorder(md)
    d2.show()
}
