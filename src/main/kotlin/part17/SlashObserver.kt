package part17

class SlashObserver: Observer {
    override fun update(generator: NumberGenerator) {
        print("SlashObserver:")
        val number = generator.getNumber()
        repeat(number / 5) {
            print("///// ")
        }
        repeat(number % 5) {
            print("/")
        }
        println()
    }
}
