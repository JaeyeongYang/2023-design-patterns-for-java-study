package part10

enum class Hand(val description: String, val handValue: Int) {
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    fun isStrongerThan(other: Hand): Boolean = fight(other) == ResultType.WIN

    fun isWeakerThan(other: Hand): Boolean = fight(other) == ResultType.LOSE

    private fun fight(other: Hand): ResultType =
        if (this == other) {
            ResultType.DRAW
        } else if ((this.handValue + 1) % 3 == other.handValue) {
            ResultType.WIN
        } else {
            ResultType.LOSE
        }

    override fun toString(): String = "Hand(description='$description')"

    companion object {
        @JvmStatic
        fun getHand(handValue: Int): Hand? = entries.find { it.handValue == handValue }
    }
}
