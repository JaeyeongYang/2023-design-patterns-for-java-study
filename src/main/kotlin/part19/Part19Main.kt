package part19

fun main() {
    val frame = SafeFrame("State Sample")
    while (true) {
        repeat(24) { hour ->
            frame.setClock(hour)
            Thread.sleep(1000)
        }
    }
}
