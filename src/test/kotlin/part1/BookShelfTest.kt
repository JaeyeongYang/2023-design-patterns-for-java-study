package part1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test

internal class BookShelfTest {
    private val bookShelf = BookShelf(bookShelfSize)

    @Test
    @Order(1)
    fun `1 - 책장 크기 이상으로 책을 넣을 경우 오류 반환`() {
        bookNames.take(bookNames.size - 1).forEach {
            bookShelf.appendBook(Book(it))
        }

        Assertions.assertThrows(IndexOutOfBoundsException::class.java) {
            bookShelf.appendBook(Book(bookNames.last()))
        }
    }

    @Test
    @Order(2)
    fun `2 - Iterator를 명시적으로 사용하여 순회`() {
        val iterator: Iterator<Book> = bookShelf.iterator()
        var count: Int = 0
        while (iterator.hasNext()) {
            iterator.next()
            count += 1
        }
        Assertions.assertEquals(bookShelf.length, count)
    }

    @Test
    @Order(3)
    fun `3 - for 문을 사용하여 순회`() {
        var count = 0
        for (book: Book in bookShelf) {
            count += 1
        }
        Assertions.assertEquals(bookShelf.length, count)
    }

    companion object {
        val bookNames = listOf(
            "Around the World in 80 Days",
            "Bible",
            "Cinderella",
            "Daddy-Long-Legs",
            "Elastic Search",
        )

        val bookShelfSize = bookNames.size - 1
    }
}

