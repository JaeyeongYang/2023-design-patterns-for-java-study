package part21

class Printer(var name: String? = null) : Printable {
    init {
        heavyJob("Printer 인스턴스($name) 생성 중")
    }

    override fun setPrinterName(name: String?) {
        this.name = name
    }

    override fun getPrinterName(): String? = name

    override fun print(string: String) {
        println("=== $name ===")
        println(string)
    }

    private fun heavyJob(msg: String) {
        kotlin.io.print(msg)
        repeat(5) {
            Thread.sleep(1000)
            kotlin.io.print(".")
        }
        println("완료")
    }
}
