package com.braiscalotodev.colorquotes

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

//Icons made by Freepick from www.flaticon.com
class MainActivity : AppCompatActivity() {

    private var quoteAuthor: String? = null
    private var quoteText: String? = null
    private var color: Int? = null

    companion object{
        private const val QUOTE_AUTHOR = "QUOTE_AUTHOR"
        private const val QUOTE_TEXT = "QUOTE_TEXT"
        private const val QUOTE_COLOR = "QUOTE_COLOR"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        randomQuote(mainLayout)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        quoteAuthor = savedInstanceState.getString(QUOTE_AUTHOR)
        quoteText = savedInstanceState.getString(QUOTE_TEXT)
        color = savedInstanceState.getInt(QUOTE_COLOR)
        updateUI()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("QUOTE_AUTHOR", quoteAuthor)
        outState.putString("QUOTE_TEXT", quoteText)
        color?.let{
            outState.putInt("QUOTE_COLOR", it)
        }

    }

    fun randomQuote(view: View){
        val quote = QuoteGenerator.getQuote()
        quoteAuthor = quote.author
        quoteText = quote.text
        color = getRandomColor()
        updateUI()
    }

    private fun updateUI(){
        quoteTextView.text = quoteText
        authorTextView.text = quoteAuthor
        color?.let {
            mainLayout.setBackgroundColor(it)
            button_next.setBackgroundColor(it)
        }

    }

    fun getRandomColor(): Int{
        val rainbow = resources.getIntArray(R.array.rainbow)
        return rainbow.random()
    }
}
