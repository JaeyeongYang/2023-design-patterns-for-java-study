package part10

import kotlin.random.Random

class RandomStrategy(seed: Int): Strategy {
    private var random = Random(seed)

    override fun nextHand(): Hand = Hand.getHand(random.nextInt(3))!!

    override fun study(win: Boolean) {
        // TO NOTHING
    }
}
