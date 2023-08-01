package part17

class GraphObserver : Observer {
    override fun update(generator: NumberGenerator) {
        print("GraphObserver:")
        val count = generator.getNumber()
        repeat(count) {
            print("*")
        }
        println()
        Thread.sleep(100)
    }
}
