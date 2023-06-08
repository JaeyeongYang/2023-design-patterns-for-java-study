package part5

class TicketMaker {
    val nextTicketNumber: Int
        get() = ticket++

    companion object {
        var ticket: Int = 1000;
    }
}

fun main() {
    val ticketMaker = TicketMaker()

    println("1st ticket number: ${ticketMaker.nextTicketNumber}")
    println("2nd ticket number: ${ticketMaker.nextTicketNumber}")
    println("3nd ticket number: ${ticketMaker.nextTicketNumber}")
}
