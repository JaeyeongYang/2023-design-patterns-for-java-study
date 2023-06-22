package part6

import part6.framework.Product

class MessageBox(private val decochar: Char) : Product {
    override fun use(s: String) {
        val len: Int = 1 + s.length + 1;
        repeat(len) {
            print(decochar)
        }
        println()
        println(decochar + s + decochar)
        repeat(len) {
            print(decochar)
        }
        println()
    }

    override fun createCopy(): Product = MessageBox(decochar)
}
