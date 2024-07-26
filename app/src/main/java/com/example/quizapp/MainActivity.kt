package com.example.quizapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private val categories = listOf(
        Category("Political", R.drawable.politician),
        Category("On the Road", R.drawable.roads)
        // Add more categories as needed
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.view_pager)
        viewPager.adapter = ViewPagerAdapter(this, categories)
    }
}
