package part1

class BookShelf(maxSize: Int) : Iterable<Book> {
    private var books: Array<Book?> = Array(maxSize) { null }
    private var last: Int = 0;

    val length: Int
        get() = last

    fun getBookAt(index: Int): Book {
        if (index < length)
            return books[index]!!;
        else
            throw IndexOutOfBoundsException();
    }

    fun appendBook(book: Book) {
        books[last] = book;
        last++
    }

    override fun iterator(): Iterator<Book> = BookShelfIterator(this)
}
