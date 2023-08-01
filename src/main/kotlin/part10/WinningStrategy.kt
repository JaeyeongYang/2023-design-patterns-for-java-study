package part10

import kotlin.random.Random

class WinningStrategy(val seed: Int) : Strategy {
    private val random: Random = Random(seed)
    private var won: Boolean = false
    private var prevHand: Hand = Hand.ROCK

    override fun nextHand(): Hand {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3))!!
        }
        return prevHand
    }

    override fun study(win: Boolean) {
        won = win
    }
}
