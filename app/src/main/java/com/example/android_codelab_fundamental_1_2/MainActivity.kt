package com.example.android_codelab_fundamental_1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.textView)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {

        val randomInt = (1..6).random()
        textView.text = randomInt.toString()
    }
}
