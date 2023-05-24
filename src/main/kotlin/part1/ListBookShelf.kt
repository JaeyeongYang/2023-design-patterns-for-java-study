package part1

class ListBookShelf : Iterable<Book> {
    private var books: MutableList<Book> = mutableListOf()

    val length: Int
        get() = books.size

    fun getBookAt(index: Int): Book = books[index]

    fun appendBook(book: Book) = books.add(book)

    override fun iterator(): Iterator<Book> = ListBookShelfIterator(this)
}
