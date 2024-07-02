package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val score = intent.getIntExtra("score", 0)
        val total = intent.getIntExtra("total", 0)
        val percentage = intent.getDoubleExtra("percentage", 0.0)

        findViewById<TextView>(R.id.result_text).text = " Are you even Kenyan \n You got $score out of $total correct! (${String.format("%.2f", percentage)}%)"

        val retryButton: Button = findViewById(R.id.retry_button)
        retryButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()

            // Optionally change the background image dynamically
//            val resultBackgroundImage = R.drawable.result_bg // Replace with your drawable resource
//            findViewById<ImageView>(R.id.result_background_image).setImageResource(resultBackgroundImage)

        }
    }
}