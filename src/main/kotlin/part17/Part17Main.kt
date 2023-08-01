package part17

fun main() {
    val generator1 = RandomNumberGenerator()
    DigitObserver().also { generator1.addObserver(it) }
    GraphObserver().also { generator1.addObserver(it) }
    SlashObserver().also { generator1.addObserver(it) }
    generator1.execute()

    val generator2 = IncrementalNumberGenerator(10, 50, 5)
    DigitObserver().also { generator2.addObserver(it) }
    GraphObserver().also { generator2.addObserver(it) }
    SlashObserver().also { generator2.addObserver(it) }
    generator2.execute()
}
