package part5

class Triple(val name: String) {
    init {
        println("${name} 인스턴스를 생성합니다.")
    }

    companion object {
        @JvmStatic
        private val ALPHA = Triple("ALPHA")

        @JvmStatic
        private val BETA = Triple("BETA")

        @JvmStatic
        private val GAMMA = Triple("GAMMA")

        fun getInstance(name: String): Triple =
            when (name) {
                "ALPHA" -> ALPHA;
                "BETA" -> BETA;
                "GAMMA" -> GAMMA;
                else -> throw RuntimeException("Undefined instance name")
            }
    }
}

fun main() {
    val alpha = Triple.getInstance("ALPHA")
    val beta = Triple.getInstance("BETA")
    val gamma = Triple.getInstance("GAMMA")

    println("alpha.name: ${alpha.name}")
    println("beta.name: ${beta.name}")
    println("gamma.name: ${gamma.name}")
}
