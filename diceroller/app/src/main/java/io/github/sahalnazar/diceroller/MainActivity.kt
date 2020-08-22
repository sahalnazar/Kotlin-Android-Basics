package io.github.sahalnazar.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random



class MainActivity : AppCompatActivity() {

    lateinit var rolledResult: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rolledResult = findViewById(R.id.roll_image)



        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        var randomNumber: Int = 1
        randomNumber = Random.nextInt(1, 7)

        val drawableResource = when (randomNumber){

            1 -> R.drawable.dice_1

            2 -> R.drawable.dice_2

            3 -> R.drawable.dice_3

            4 -> R.drawable.dice_4

            5 -> R.drawable.dice_5

            else -> R.drawable.dice_6

        }

        rolledResult.setImageResource(drawableResource)

    }
}


