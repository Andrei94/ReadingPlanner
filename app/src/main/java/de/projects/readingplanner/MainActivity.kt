package de.projects.readingplanner

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showPopup.setOnClickListener {
            val beginTransaction = supportFragmentManager.beginTransaction()
            beginTransaction.replace(viewGroup.id, AddBookFragment.newInstance())
            beginTransaction.commit()
            showPopup.visibility = View.GONE
        }
    }
}
