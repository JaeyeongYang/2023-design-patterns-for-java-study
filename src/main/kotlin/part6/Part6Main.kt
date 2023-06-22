package part6

import part6.framework.Manager

fun main() {
    val upen = UnderlinePen('-')
    val mbox = MessageBox('*')
    val sbox = MessageBox('/')

    val manager = Manager().apply {
        register("strong message", upen)
        register("warning box", mbox)
        register("slash box", sbox)
    }

    val p1 = manager.create("strong message")
    p1?.use("Hello, world.")

    val p2 = manager.create("warning box")
    p2?.use("Hello, world.")

    val p3 = manager.create("slash box")
    p3?.use("Hello, world.")
}
