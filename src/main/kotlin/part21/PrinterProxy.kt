package part21

class PrinterProxy(var name: String? = "No Name", private val initializePrintable: (String?) -> Printable) : Printable {
    private var real: Printable? = null

    override fun setPrinterName(name: String?) {
        real?.setPrinterName(name)
        this.name = name
    }

    override fun getPrinterName(): String? = name

    override fun print(string: String) {
        realize()
        real!!.print(string)
    }

    @Synchronized
    private fun realize() {
        if (real == null) {
            real = initializePrintable(name)
        }
    }
}
