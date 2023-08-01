package part17

import kotlin.random.Random

class RandomNumberGenerator: NumberGenerator() {
    private var number: Int = Random.nextInt(50)

    override fun getNumber(): Int {
        return number
    }

    override fun execute() {
        repeat(20) {
            number = Random.nextInt(50)
            notifyObservers()
        }
    }
}
