package de.projects.readingplanner.addBook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import de.projects.readingplanner.R

class BookListFragment : Fragment() {
	private lateinit var recyclerView: RecyclerView
	private lateinit var viewModel: BookListViewModel

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		val view = inflater.inflate(R.layout.fragment_book_list, container, false)
		recyclerView = view.findViewById(R.id.recyclerView)
		return view
	}

	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)
		viewModel = ViewModelProviders.of(this).get(BookListViewModel::class.java)
		recyclerView.layoutManager = LinearLayoutManager(context)
		recyclerView.adapter = BookListAdapter(viewModel.books)
	}

	fun addBook(book: Book): Boolean {
		if(viewModel.addBook(book)) {
			recyclerView.adapter!!.notifyDataSetChanged()
			return true
		}
		return false
	}

	companion object {
		fun newInstance(): BookListFragment =
			BookListFragment()
	}
}