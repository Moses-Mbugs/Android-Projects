package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuestionActivity : AppCompatActivity() {
    private lateinit var questions: List<Question>
    private var currentQuestionIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val category = intent.getStringExtra("category")
        questions = QuestionRepository.categories[category] ?: listOf()

        showQuestion()
    }

    private fun showQuestion() {
        if (currentQuestionIndex < questions.size) {
            val question = questions[currentQuestionIndex]

            findViewById<TextView>(R.id.question_text).text = question.text
            val options = question.options

            findViewById<Button>(R.id.option1).apply {
                text = options[0]
                setOnClickListener { checkAnswer(0) }
            }
            findViewById<Button>(R.id.option2).apply {
                text = options[1]
                setOnClickListener { checkAnswer(1) }
            }

        } else {
            showResult()
        }
    }

    private fun checkAnswer(selectedOptionIndex: Int) {
        if (questions[currentQuestionIndex].correctAnswer == selectedOptionIndex) {
            score++
        }
        currentQuestionIndex++
        showQuestion()
    }

    private fun showResult() {
        val resultIntent = Intent(this, ResultActivity::class.java)
        resultIntent.putExtra("score", score)
        resultIntent.putExtra("total", questions.size)
        startActivity(resultIntent)
        finish()
    }
}
