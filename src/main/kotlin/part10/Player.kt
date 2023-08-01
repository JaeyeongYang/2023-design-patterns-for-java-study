package part10

class Player(
    val name: String,
    val strategy: Strategy,
) {
    var winCount = 0
    var loseCount = 0
    var gameCount = 0

    fun nextHand(): Hand = strategy.nextHand()

    fun win() {
        strategy.study(true)
        winCount++
        gameCount++
    }

    fun lose() {
        strategy.study(false)
        loseCount++
        gameCount++
    }

    fun even() {
        gameCount++
    }

    override fun toString(): String {
        return "Player(name='$name', winCount=$winCount, loseCount=$loseCount, gameCount=$gameCount)"
    }
}
