package com.braiscalotodev.colorquotes

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        randomQuote(mainLayout)
    }
    fun randomQuote(view: View){

        val quote = QuoteGenerator.getQuote()

        quoteTextView.text = quote.text
        authorTextView.text = quote.author
        mainLayout.background = getRandomColor()
        button_next.background = mainLayout.background

    }

    fun getRandomColor(): ColorDrawable{

        val rainbow = resources.getIntArray(R.array.rainbow)
        return ColorDrawable(rainbow.random())

    }
}
