package part4.idcard

import part4.framework.Factory
import part4.framework.Product
import java.util.*

class IDCardFactory : Factory() {
    val idCardMap: MutableMap<UUID, String> = mutableMapOf()

    override fun createProduct(owner: String): Product {
        val idCard = IDCard(UUID.randomUUID(), owner)
        idCardMap.put(idCard.id, owner)
        return idCard
    }

    override fun registerProduct(product: Product) = println("${product}를 등록했습니다.")
}
