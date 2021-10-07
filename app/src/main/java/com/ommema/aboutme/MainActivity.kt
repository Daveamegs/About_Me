package com.ommema.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val showName : TextView = findViewById(R.id.show_name)
//        showName.visibility = View.VISIBLE

        val doneButton : Button = findViewById(R.id.done_button)
        doneButton.setOnClickListener {
//            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            showNickname()
        }
    }

    private fun showNickname() {
        val nicknameText : EditText = findViewById(R.id.enter_nickname)
        val showName : TextView = findViewById(R.id.show_name)
        val userNickname = nicknameText.text

        showName.text = userNickname.toString()
        showName.visibility = View.VISIBLE
        nicknameText.visibility = View.GONE

    }
}