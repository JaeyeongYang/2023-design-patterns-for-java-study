package part1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test

internal class ListBookShelfTest {
    private val listBookShelf = ListBookShelf()

    @Test
    @Order(1)
    fun `1 - 책장에 책을 많이 넣어도 오류 미발생`() {
        Assertions.assertDoesNotThrow() {
            repeat(100) {
                bookNames.take(bookNames.size).forEach {
                    listBookShelf.appendBook(Book(it))
                }
            }
        }
    }

    @Test
    @Order(2)
    fun `2 - Iterator를 명시적으로 사용하여 순회`() {
        val iterator: Iterator<Book> = listBookShelf.iterator()
        var count = 0
        while (iterator.hasNext()) {
            iterator.next()
            count += 1
        }
        Assertions.assertEquals(listBookShelf.length, count)
    }

    @Test
    @Order(3)
    fun `3 - for 문을 사용하여 순회`() {
        var count = 0
        for (book: Book in listBookShelf) {
            count += 1
        }
        Assertions.assertEquals(listBookShelf.length, count)
    }

    companion object {
        val bookNames = listOf(
            "Around the World in 80 Days",
            "Bible",
            "Cinderella",
            "Daddy-Long-Legs",
            "Elastic Search",
        )
    }
}

