package part4.idcard

import part4.framework.Product
import java.util.*

class IDCard(val id: UUID, val owner: String) : Product() {
    init {
        println("[id=${id}] ${owner}의 카드를 만듭니다.")
    }

    override fun use() = println("${this}를 사용합니다.")

    override fun toString(): String = "IDCard(id=${id}, owner='$owner')"
}
