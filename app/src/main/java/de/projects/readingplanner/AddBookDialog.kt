package de.projects.readingplanner
import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class AddBookDialog : DialogFragment() {
        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage("This is a message")
                .setPositiveButton("Ok") { _, _ ->
                    Toast.makeText(
                        this.context,
                        "OK",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                .setNegativeButton("Nope") { _, _ ->
                    Toast.makeText(
                        this.context,
                        "Nope",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}