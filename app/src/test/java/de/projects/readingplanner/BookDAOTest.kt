package de.projects.readingplanner

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class BookDAOTest {
	@Test
	fun addOneBookToDAO() {
		val dao: BookDAO = InMemoryBookDAO()
		assertTrue(dao.addBook(Book.create("test", 10)))
	}

	@Test
	fun addInvalidBookToDAO() {
		val dao: BookDAO = InMemoryBookDAO()
		assertFalse(dao.addBook(Book.create("", -1)))
	}
}