package com.firstapp.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollDice()
        rollButton.setOnClickListener {
            rollDice()
        }
        }

    private fun rollDice() {
        val dice = Dice(6)
        val DiceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        when (DiceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice1)
            2 -> diceImage.setImageResource(R.drawable.dice2)
            3 -> diceImage.setImageResource(R.drawable.dice3)
            4 -> diceImage.setImageResource(R.drawable.dice4)
            5 -> diceImage.setImageResource(R.drawable.dice5)
            6 -> diceImage.setImageResource(R.drawable.dice6)
        }
    }
}
class Dice(val numSides: Int)   {

    fun roll(): Int {
        return (1..numSides).random()


    }


}
