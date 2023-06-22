package part7

class Director(private val builder: Builder) {
    fun construct() {
        builder.apply {
            makeTitle("Greeting")
            makeString("일반적인 인사")
            makeItems(
                arrayOf(
                    "How are you?",
                    "Hello.",
                    "Hi.",
                )
            )
            makeString("시간대별 인사")
            makeItems(
                arrayOf(
                    "Good morning.",
                    "Good afternoon.",
                    "Good evening.",
                )
            )
            close()
        }
    }
}
