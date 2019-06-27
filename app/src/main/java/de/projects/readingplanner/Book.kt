package de.projects.readingplanner

class Book private constructor(private val title: String, private val noPages: Int) {
	fun isValid(): Boolean = title.isNotEmpty() && noPages > 0

	override fun toString(): String {
		return "Book(title='$title', noPages=$noPages)"
	}

	companion object {
		fun create(title: String, noPages: Int): Book {
			return Book(title, noPages)
		}
	}
}