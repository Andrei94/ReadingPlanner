package de.projects.readingplanner.addBook

interface BookDAO {
	fun addBook(book: Book): Boolean
	fun content(): List<String>
	fun getBook(title: String): Book
}