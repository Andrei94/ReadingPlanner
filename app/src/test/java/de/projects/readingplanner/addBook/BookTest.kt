package de.projects.readingplanner.addBook

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class BookTest {
	@Test
	fun `non empty title and strictly positive number of pages is valid`() =
		assertTrue(Book.create("test", 10).isValid())

	@Test
	fun `empty title is invalid`() = assertFalse(Book.create("", 10).isValid())

	@Test
	fun `negative number of pages is invalid`() = assertFalse(Book.create("test", -2).isValid())

	@Test
	fun `0 number of pages is invalid`() = assertFalse(Book.create("test", 0).isValid())
}