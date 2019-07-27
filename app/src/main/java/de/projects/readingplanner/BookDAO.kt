package de.projects.readingplanner

interface BookDAO {
	fun addBook(book: Book): Boolean
	fun content(): List<String>
	fun getBook(title: String): Book
}

class InMemoryBookDAO(private val books: MutableList<Book> = ArrayList()) : BookDAO {
	override fun getBook(title: String): Book {
		return books.find { it.getKey() == title }!!
	}

	override fun content(): List<String> {
		return books.map { it.toString() }
	}

	override fun addBook(book: Book): Boolean {
		if (book.isValid())
			return books.add(book)
		return false
	}
}