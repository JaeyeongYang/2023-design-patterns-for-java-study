package part18

import kotlin.random.Random

class Gamer(money: Int) {
    var money: Int = money
        private set
    var fruits: MutableList<String> = mutableListOf()
        private set

    fun bet() {
        val dice = Random.nextInt(6) + 1
        when (dice) {
            1 -> {
                money += 100
                println("소지금이 증가했습니다.")
            }

            2 -> {
                money /= 2
                println("소지금이 절반으로 줄었습니다.")
            }

            6 -> {
                val f = getFruit()
                println("과일($f)를 받았습니다.")
                fruits.add(f)
            }

            else -> {
                println("변동 사항이 없습니다.")
            }
        }
    }

    fun createMemento(): Memento {
        val memento = Memento(money)
        fruits.filter { it.startsWith("맛있는 ") }
            .forEach { memento.addFruit(it) }
        return memento
    }

    fun restoreMemento(memento: Memento) {
        money = memento.money
        fruits = memento.fruits
    }

    override fun toString(): String {
        return "[money=$money, fruits=$fruits]"
    }

    private fun getFruit(): String {
        val fruit = fruitsName[Random.nextInt(fruitsName.size)]
        return if (Random.nextBoolean()) {
            "맛있는 $fruit"
        } else {
            fruit
        }
    }

    companion object {
        val fruitsName = arrayOf("사과", "포도", "바나나", "오렌지")
    }
}
