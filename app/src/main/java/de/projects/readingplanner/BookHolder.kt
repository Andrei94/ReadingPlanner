package de.projects.readingplanner

import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
	lateinit var book: Book
	val textView: TextView = itemView.findViewById(R.id.my_text_view)

	init {
		itemView.setOnClickListener {
			itemView.context.startActivity(
				Intent(
					itemView.context,
					MainActivity::class.java
				).apply {
					putExtra("book", book)
				})
		}
	}
}