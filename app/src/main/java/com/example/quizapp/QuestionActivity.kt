package com.example.quizapp

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuestionActivity : AppCompatActivity() {
    private lateinit var questions: List<Question>
    private var currentQuestionIndex = 0
    private var score = 0

    // List of background images corresponding to each category
    private val backgroundImages = mapOf(
        "Trivia_1" to R.drawable.bg1,
        "Trivia_2" to R.drawable.bg2
        // Add more mappings as needed for each category
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val category = intent.getStringExtra("category")
        questions = QuestionRepository.categories[category] ?: listOf()

        // Set background image based on category
//        val backgroundImage = backgroundImages[category] ?: R.drawable.default_bg
//        findViewById<ImageView>(R.id.background_image).setImageResource(backgroundImage)

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
        val question = questions[currentQuestionIndex]
        if (question.correctAnswer == selectedOptionIndex) {
            score++
            currentQuestionIndex++
            showQuestion()
        } else {
            showExplanationDialog(question.explanation)
        }
    }

    private fun showExplanationDialog(explanation: String) {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val dialogLayout = inflater.inflate(R.layout.dialog_explanation, null)
        val explanationText: TextView = dialogLayout.findViewById(R.id.explanation_text)

        explanationText.text = explanation

        builder.setView(dialogLayout)
        builder.setPositiveButton("Continue") { dialog, _ ->
            dialog.dismiss()
            currentQuestionIndex++
            showQuestion()
        }
        builder.show()
    }

    private fun showResult() {
        val resultIntent = Intent(this, ResultActivity::class.java)
        resultIntent.putExtra("score", score)
        resultIntent.putExtra("total", questions.size)
        val percentage = (score.toDouble() / questions.size) * 100
        resultIntent.putExtra("percentage", percentage)
        startActivity(resultIntent)
        finish()
    }
}
