package de.projects.readingplanner

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BookListAdapter(private val myDataset: BookDAO) : RecyclerView.Adapter<BookHolder>() {
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookHolder {
		return BookHolder(
			LayoutInflater.from(parent.context)
				.inflate(R.layout.book_item_view, parent, false)
		)
	}

	override fun onBindViewHolder(holder: BookHolder, position: Int) {
		val bookTitle = myDataset.content()[position]
		holder.textView.text = bookTitle
		holder.book = myDataset.getBook(bookTitle)
	}

	override fun getItemCount() = myDataset.content().size
}