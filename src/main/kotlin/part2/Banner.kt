package part2

open class Banner(val string: String) {
    fun showWithParen() = println("(${string})")

    fun showWithAster() = println("*${string}*")
}
