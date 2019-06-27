package de.projects.readingplanner

import androidx.lifecycle.ViewModel

class BookListViewModel(val books: BookDAO = InMemoryBookDAO()) : ViewModel() {
	fun addBook(book: Book): Boolean {
		return books.addBook(book)
	}
}