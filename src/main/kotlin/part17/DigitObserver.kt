package part17

class DigitObserver : Observer {
    override fun update(generator: NumberGenerator) {
        println("DigitObserver: ${generator.getNumber()}")
        Thread.sleep(100)
    }
}
