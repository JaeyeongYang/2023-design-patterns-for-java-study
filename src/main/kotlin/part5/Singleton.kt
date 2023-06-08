package part5

class Singleton {
    init {
        println("인스턴스가 생성되었습니다.")
    }

    companion object {
        @JvmStatic
        private val singleton: Singleton = Singleton()

        fun getInstance(): Singleton = singleton
    }
}

fun main() {
    println("Start.")

    val obj1 = Singleton.getInstance()
    val obj2 = Singleton.getInstance()

    if (obj1 === obj2) {
        println("obj1과 obj2는 같은 인스턴스입니다.")
    } else {
        println("obj1과 obj2는 같은 인스턴스가 아닙니다.")
    }
    println("End.")
}
