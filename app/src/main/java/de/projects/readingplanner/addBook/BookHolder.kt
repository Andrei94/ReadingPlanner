package de.projects.readingplanner.addBook

import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.projects.readingplanner.R
import de.projects.readingplanner.endDateCalculator.BookDetailsActivity

class BookHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
	lateinit var book: Book
	val textView: TextView = itemView.findViewById(R.id.my_text_view)

	init {
		itemView.setOnClickListener {
			itemView.context.startActivity(
				Intent(
					itemView.context,
					BookDetailsActivity::class.java
				).apply {
					putExtra("book", book)
				})
		}
	}
}