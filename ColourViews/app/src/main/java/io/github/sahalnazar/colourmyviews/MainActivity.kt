package io.github.sahalnazar.colourmyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(box_one_text, bow_two_texts,
                box_three_text, box_four_text,
                box_five_text, constraint_layout,
            blue_button, red_button, green_button)

        for (item in clickableViews){
            item.setOnClickListener { makeColoured(it) }
        }
    }

    private fun makeColoured(view: View) {
        when(view.id){
            R.id.box_one_text ->  view.setBackgroundColor(Color.BLACK)

            R.id.bow_two_texts ->  view.setBackgroundColor(Color.GREEN)
            R.id.box_three_text ->  view.setBackgroundColor(Color.RED)
            R.id.box_four_text ->  view.setBackgroundColor(Color.YELLOW)
            R.id.box_five_text ->  view.setBackgroundColor(Color.BLUE)

            R.id.blue_button -> view.setBackgroundColor(Color.BLUE)
            R.id.green_button -> view.setBackgroundColor(Color.GREEN)
            R.id.red_button -> view.setBackgroundColor(Color.RED)


            else ->  view.setBackgroundColor(Color.BLACK)

        }

    }
}