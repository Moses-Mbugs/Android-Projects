package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private val categories = listOf(
        Category("Trivia_1", R.drawable.gq),
        Category("Trivia_2", R.drawable.random)
        // Add more categories as needed
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridLayout: GridLayout = findViewById(R.id.category_grid)

        for (category in categories) {
            val button = ImageButton(this).apply {
                layoutParams = GridLayout.LayoutParams().apply {
                    width = 0
                    height = GridLayout.LayoutParams.WRAP_CONTENT
                    columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f)
                    setMargins(8, 8, 8, 8)
                }
                setImageResource(category.drawableResId)
                background = ContextCompat.getDrawable(context, android.R.color.transparent)
                contentDescription = category.name
                setOnClickListener {
                    val intent = Intent(this@MainActivity, QuestionActivity::class.java)
                    intent.putExtra("category", category.name)
                    startActivity(intent)
                }
            }
            gridLayout.addView(button)
        }
    }
}
