package part12

fun main() {
    val b1 = StringDisplay("Hello, world.")
    val b2 = UpDownBorder(b1, '-')
    val b3 = SideBorder(b2, '*')

    b1.show()
    b2.show()
    b3.show()

    val b4 = StringDisplay("Hello, world.")
        .let { SideBorder(it, '*') }
        .let { UpDownBorder(it, '=')}
        .let { SideBorder(it, '|') }
        .let { UpDownBorder(it, '/')}
        .let { FullBorder(it) }
    b4.show()
}
