package part1

class ListBookShelfIterator(private val listBookShelf: ListBookShelf) : Iterator<Book> {
    private var index: Int = 0

    override fun hasNext(): Boolean = index < listBookShelf.length

    override fun next(): Book {
        if (!hasNext()) {
            throw NoSuchElementException();
        }
        return listBookShelf.getBookAt(index++)
    }
}
