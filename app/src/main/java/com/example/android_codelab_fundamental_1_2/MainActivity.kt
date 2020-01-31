package com.example.android_codelab_fundamental_1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val randomInt = (1..6).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countupButton: Button = findViewById(R.id.countup_button)
        rollButton.setOnClickListener {
            rollDice()
        }
        countupButton.setOnClickListener {
            countUp()
        }
    }

    private fun rollDice() {

        val resultText: TextView = findViewById(R.id.textView)
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.textView)

        var resultInt = resultText.text.toString().toInt()

        if(resultInt < 6) {

            resultInt++
            resultText.text = resultInt.toString()
        }
    }
}
