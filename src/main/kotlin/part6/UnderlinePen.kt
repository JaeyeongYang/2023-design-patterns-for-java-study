package part6

import part6.framework.Product

class UnderlinePen(private val ulchar: Char) : Product {
    override fun use(s: String) {
        println(s)
        repeat(s.length) {
            print(ulchar)
        }
        println()
    }

    override fun createCopy(): Product = UnderlinePen(ulchar)
}
