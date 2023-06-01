package part2

class PrintBanner2(string: String) : Print {
    val banner: Banner = Banner(string)

    override fun printWeak() = banner.showWithParen()

    override fun printStrong() = banner.showWithAster()

}
