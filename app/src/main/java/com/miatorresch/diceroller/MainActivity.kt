package com.miatorresch.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

        var countUpButton: Button = findViewById(R.id.countup_button)
        countUpButton.setOnClickListener{countUp()}

    }

    private fun rollDice() {

        var randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()


        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }

    private fun countUp() {

        val resultText: TextView = findViewById(R.id.result_text)
        if(resultText.text.toString() == "Hello World!"){
            resultText.text = 1.toString()
        }else if(resultText.text.toString().toInt() < 6){
            resultText.text = (resultText.text.toString().toInt() + 1).toString()
        }
    }
}