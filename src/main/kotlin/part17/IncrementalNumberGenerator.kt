package part17

class IncrementalNumberGenerator(
    private val startInclusive: Int,
    private val endExclusive: Int,
    private val step: Int,
) : NumberGenerator() {
    private var number = startInclusive

    override fun getNumber(): Int = number

    override fun execute() {
        for (i in startInclusive until endExclusive step step) {
            number = i
            notifyObservers()
        }
    }
}
