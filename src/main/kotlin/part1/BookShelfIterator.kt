package part1

class BookShelfIterator(private val bookShelf: BookShelf) : Iterator<Book> {
    private var index: Int = 0

    override fun hasNext(): Boolean = index < bookShelf.length

    override fun next(): Book {
        if (!hasNext()) {
            throw NoSuchElementException();
        }
        return bookShelf.getBookAt(index++)
    }
}
