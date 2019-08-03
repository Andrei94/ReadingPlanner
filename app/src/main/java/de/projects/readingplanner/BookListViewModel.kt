package de.projects.readingplanner

import androidx.lifecycle.ViewModel

class BookListViewModel(val books: BookDAO = object : BookDAO {
	override fun addBook(book: Book): Boolean {
		return true
	}

	override fun content(): List<String> {
		return listOf("The Intelligent Investor")
	}

	override fun getBook(title: String): Book {
		return Book.create("The Intelligent Investor", 40)
	}
}) : ViewModel() {
	fun addBook(book: Book): Boolean {
		return books.addBook(book)
	}
}