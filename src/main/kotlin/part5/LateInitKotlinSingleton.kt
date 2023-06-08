package part5

class LateInitKotlinSingleton {
    init {
        println("인스턴스가 생성되었습니다.")
    }

    companion object {
        @JvmStatic
        private val INSTANCE: LateInitKotlinSingleton by lazy() { LateInitKotlinSingleton() }

        fun getInstance(): LateInitKotlinSingleton = INSTANCE
    }
}

fun main() {
    println("Start.")

    val obj1 = LateInitKotlinSingleton.getInstance()
    val obj2 = LateInitKotlinSingleton.getInstance()

    if (obj1 === obj2) {
        println("obj1과 obj2는 같은 인스턴스입니다.")
    } else {
        println("obj1과 obj2는 같은 인스턴스가 아닙니다.")
    }
    println("End.")
}
