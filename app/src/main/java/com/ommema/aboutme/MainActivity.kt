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
import androidx.databinding.DataBindingUtil
import com.ommema.aboutme.databinding.ActivityMainBinding
import com.ommema.aboutme.model.MyName

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    val myName : MyName = MyName("David Jones")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.myName = myName

        binding.doneButton.setOnClickListener {
//            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            showNickname()
        }
    }

    private fun showNickname() {

        binding.apply {
            myName?.nickname = enterNickname.text.toString()


            showName.visibility = View.VISIBLE
//            nicknameText.visibility = View.GONE
            enterNickname.visibility = View.GONE
            invalidateAll()
        }

    }
}