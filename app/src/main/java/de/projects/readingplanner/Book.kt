package de.projects.readingplanner

import java.io.Serializable

class Book private constructor(val title: String, val noPages: Int) : Serializable {
	fun isValid(): Boolean = title.isNotEmpty() && noPages > 0

	fun getKey(): String {
		return title
	}

	override fun toString(): String {
		return title
	}

	companion object {
		fun create(title: String, noPages: Int): Book {
			return Book(title, noPages)
		}
	}
}