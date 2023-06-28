package part9

import kotlin.random.Random

class RandomDisplay(impl: DisplayImpl) : Display(impl) {
    fun randomDisplay(times: Int) {
        open()
        repeat(Random.nextInt(0, times)) {
            print()
        }
        close()
    }
}
