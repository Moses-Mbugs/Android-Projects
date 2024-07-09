package com.example.quizapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private val categories = listOf(
        Category("Trivia_1", R.drawable.bg1),
        Category("Trivia_2", R.drawable.bg2)
        // Add more categories as needed
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.view_pager)
        viewPager.adapter = ViewPagerAdapter(this, categories)
    }
}
