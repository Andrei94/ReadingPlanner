package de.projects.readingplanner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.add_book_fragment.*


class AddBookFragment : Fragment() {

    companion object {
        fun newInstance() = AddBookFragment()
    }

    private lateinit var viewModel: AddBookViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_book_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        customButton.setOnClickListener {
            fragmentManager?.let { it1 -> AddBookDialog().show(it1, "addBook") }
        }
        viewModel = ViewModelProviders.of(this).get(AddBookViewModel::class.java)
        // TODO: Use the ViewModel
    }
}
