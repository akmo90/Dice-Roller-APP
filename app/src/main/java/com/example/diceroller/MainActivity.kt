package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.setOnClickListener{
                diceRoll()
        }
    }
    private fun diceRoll(){
        var randomNo = (1..6).random()
        var imageDice:Int
        when (randomNo) {
            1 -> {
                imageDice=R.drawable.dice_1
            }
            2 -> {
                imageDice=R.drawable.dice_2
            }
            3 -> {
                imageDice=R.drawable.dice_3
            }
            4 -> {
                imageDice=R.drawable.dice_4
            }
            5 -> {
                imageDice=R.drawable.dice_5
            }
            else -> {
                imageDice=R.drawable.dice_6
            }
        }
        dice_image.setImageResource(imageDice)

        Toast.makeText(this,"Dise is Rolled", Toast.LENGTH_SHORT).show()

    }
}