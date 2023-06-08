package part4

import part4.idcard.IDCardFactory

fun main() {
    val factory: IDCardFactory = IDCardFactory()

    val card1 = factory.create("김영진")
    val card2 = factory.create("권다영")
    val card3 = factory.create("이창준")

    println()

    card1.use()
    card2.use()
    card3.use()

    println()

    factory.idCardMap.forEach { id, idCard -> println("${id} -> ${idCard}") }
}
