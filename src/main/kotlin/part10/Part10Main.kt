package part10

import kotlin.random.Random

fun main() {
    val currnetTimeMillis = System.currentTimeMillis()
    val random = Random(currnetTimeMillis)

    val seed1 = random.nextInt()
    val seed2 = random.nextInt()
    println("currentTimeMillis = $currnetTimeMillis, seed1 = $seed1, seed2 = $seed2")

    val player1 = Player("KIM", RandomStrategy(seed1))
    val player2 = Player("LEE", RandomStrategy(seed2))

    repeat(10000) {
        val hand1 = player1.nextHand()
        val hand2 = player2.nextHand()

        if (hand1.isStrongerThan(hand2)) {
            println("Trial ${it + 1} - Player 1 win")
            player1.win()
            player2.lose()
        } else if (hand2.isStrongerThan(hand1)) {
            println("Trial ${it + 1} - Player 2 win")
            player1.lose()
            player2.win()
        } else {
            println("Trial ${it + 1} - Draw")
            player1.even()
            player2.even()
        }
    }

    println()
    println("Total result:\n- $player1\n- $player2")
}
