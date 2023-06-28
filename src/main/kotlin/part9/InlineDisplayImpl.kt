package part9

class InlineDisplayImpl(
    private val left: String,
    private val mid: String,
    private val right: String,
): DisplayImpl() {
    override fun rawOpen() {
        print(left)
    }

    override fun rawPrint() {
        print(mid)
    }

    override fun rawClose() {
        println(right)
    }
}
