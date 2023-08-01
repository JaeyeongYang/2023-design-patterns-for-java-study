package part21

fun main() {
    val p: Printable = PrinterProxy("Alice") { name -> Printer(name) }
    println("이름은 현재 ${p.getPrinterName()}입니다.")
    p.setPrinterName("Bob")
    println("이름은 현재 ${p.getPrinterName()}입니다.")
    p.print("Hello, world.")
}
