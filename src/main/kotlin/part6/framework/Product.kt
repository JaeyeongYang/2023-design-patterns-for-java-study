package part6.framework

interface Product : Cloneable {
    fun use(s: String)

    fun createCopy(): Product? {
        var product: Product? = null
        try {
            product = this.clone() as Product
        } catch (ex: CloneNotSupportedException) {
            ex.printStackTrace()
        }
        return product
    }
}
