package com.Evg.hellokitty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var HelloTextView: TextView
    private lateinit var editText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        HelloTextView = findViewById(R.id.textView)
        editText = findViewById(R.id.editText)

        val imageButton : ImageButton = findViewById(R.id.imageButton)
        val imageButton2 : ImageButton = findViewById(R.id.imageButton2)
        val aboutButton : Button = findViewById(R.id.button_about)

        imageButton.setOnClickListener {
            if (editText.text.isEmpty()){
                HelloTextView.text = "Hello Kitty"
            } else {
                HelloTextView.text = "Привет " + editText.text
            }
        }

        imageButton2.setOnClickListener {
            if (editText.text.isEmpty()){
                HelloTextView.text = "Bye Kitty"
            } else {
                HelloTextView.text = "Пока " + editText.text
            }
        }

        aboutButton.setOnClickListener{
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }

    }
}