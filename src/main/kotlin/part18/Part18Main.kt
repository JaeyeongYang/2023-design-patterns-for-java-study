package part18

fun main() {
    val gamer = Gamer(100)
    var memento = gamer.createMemento()

    repeat(10) { i ->
        println("==== $i")
        println("상태: $gamer")

        gamer.bet()

        println("소지금은 ${gamer.money}원이 되었습니다.")

        if (gamer.money > memento.money) {
            println("많이 늘었으니 현재 상태를 저장하자!")
            memento = gamer.createMemento()
        } else if (gamer.money < memento.money) {
            println("많이 줄었으니 이전 상태를 복원하자!")
            gamer.restoreMemento(memento)
        }

        Thread.sleep(1000)
        println()
    }

    Memento.saveToFile("a.txt", memento)
    val memento2 = Memento.loadFromFile("a.txt")
    println(memento2)
}
