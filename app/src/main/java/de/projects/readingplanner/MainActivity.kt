package de.projects.readingplanner

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fab.setOnClickListener {
            if (menu.isVisible) {
                menu.animate().alpha(0f)
                    .setDuration(1000)
                    .setListener(object : AnimatorListenerAdapter() {
                        override fun onAnimationEnd(animation: Animator) {
                            menu.isVisible = false
                        }
                    })
            } else {
                menu.alpha = 0f
                menu.animate().alpha(1f)
                    .setDuration(1000)
                    .setListener(object : AnimatorListenerAdapter() {
                        override fun onAnimationStart(animation: Animator) {
                            menu.isVisible = true
                        }
                    })
            }
        }
    }
}
