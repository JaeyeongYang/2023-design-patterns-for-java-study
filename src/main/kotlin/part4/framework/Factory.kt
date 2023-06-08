package part4.framework

abstract class Factory {
    abstract fun createProduct(owner: String): Product

    abstract fun registerProduct(product: Product)

    fun create(owner: String): Product {
        val product = createProduct(owner)
        registerProduct(product)
        return product
    }
}
