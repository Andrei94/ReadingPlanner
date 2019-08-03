package de.projects.readingplanner

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
	private val bookList: BookListFragment = BookListFragment.newInstance()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		supportFragmentManager.beginTransaction()
			.add(R.id.allBooks, bookList)
			.commit()

		fab.setOnClickListener {
			when {
				menu.isVisible -> fadeOutMenu()
				else -> fadeInMenu()
			}
		}
	}

	private fun fadeInMenu() {
		menu.alpha = 0f
		menu.animate().alpha(1f)
			.setDuration(1000)
			.setListener(object : AnimatorListenerAdapter() {
				override fun onAnimationStart(animation: Animator) {
					menu.isVisible = true
				}
			})
	}

	fun saveBook(view: View) {
		fadeOutMenu()
		if (bookList.addBook(Book.create(book_title.text.toString(), book_pages.text.toString().toIntOrNull() ?: 0))) {
			book_title.text.clear()
			book_pages.text.clear()
			Toast.makeText(this, "Saved successfully", Toast.LENGTH_SHORT).show()
		} else {
			book_title.text.clear()
			book_pages.text.clear()
			Toast.makeText(this, "Failed to save", Toast.LENGTH_SHORT).show()
		}
	}

	private fun fadeOutMenu() {
		menu.animate().alpha(0f)
			.setDuration(1000)
			.setListener(object : AnimatorListenerAdapter() {
				override fun onAnimationEnd(animation: Animator) {
					menu.isVisible = false
				}
			})
	}
}