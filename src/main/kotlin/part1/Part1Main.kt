package part1

fun main() {
    val bookShelf = BookShelf(4)
    bookShelf.appendBook(Book("Around the World in 80 Days"))
    bookShelf.appendBook(Book("Bible"))
    bookShelf.appendBook(Book("Cinderella"))
    bookShelf.appendBook(Book("Daddy-Long-Legs"))

    val iterator: Iterator<Book> = bookShelf.iterator()

    while (iterator.hasNext()) {
        val book: Book = iterator.next()
        println("Book - name: ${book.name}")
    }
    println()

    for (book: Book in bookShelf) {
        println("Book - name: ${book.name}")
    }
    println()
}
