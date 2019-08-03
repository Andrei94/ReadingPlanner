package de.projects.readingplanner.endDateCalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.projects.readingplanner.R
import de.projects.readingplanner.addBook.Book
import kotlinx.android.synthetic.main.activity_book_details.*

class BookDetailsActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_book_details)
		val selectedBook: Book? = intent.getSerializableExtra("book") as Book?
		selectedBook?.let {
			book.text = selectedBook.title
			no_pages.text = "${selectedBook.noPages} pages"
		}
	}
}
