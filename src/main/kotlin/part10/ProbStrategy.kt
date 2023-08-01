package part10

import kotlin.random.Random

class ProbStrategy(seed: Int) : Strategy {
    private val random: Random = Random(seed)

    private var prevHandValue: Int = 0
    private var currentHandValue: Int = 0

    private var history = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(1, 1, 1),
        intArrayOf(1, 1, 1),
    )

    override fun nextHand(): Hand {
        val bet: Int = random.nextInt(getSum(currentHandValue))
        val handValue: Int = if (bet < history[currentHandValue][0]) {
            0
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            1
        } else {
            2
        }

        prevHandValue = currentHandValue
        currentHandValue = handValue
        return Hand.getHand(handValue)!!
    }

    override fun study(win: Boolean) {
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }

    private fun getSum(handValue: Int): Int = history[handValue].sum()
}
