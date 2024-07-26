package com.example.quizapp

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuestionActivity : AppCompatActivity() {
    private lateinit var questions: List<Question>
    private var currentQuestionIndex = 0
    private var score = 0
    private var isContinuing = false

    // List of background images corresponding to each category
    private val backgroundImages = mapOf(
        "Political" to R.drawable.politician,
        "On the Road" to R.drawable.roads
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

        val backgroundImages = mapOf(
            "Political" to R.drawable.bg_p,
            "On the Road" to R.drawable.bg_r
        )

        val popup = findViewById<RelativeLayout>(R.id.did_you_know_popup)
        popup.translationY = popup.height.toFloat()

        showQuestion()
    }
    // if the categories have more than 15 questions the user will be prompted with a dialogue whether they wish to continue or quit
    private fun showQuestion() {
        if (currentQuestionIndex < questions.size) {
            if (!isContinuing && currentQuestionIndex > 0 && currentQuestionIndex % 15 == 0) {
                showIntermediateScoreDialog()
            } else {
                isContinuing = false // Reset the flag
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
                // Add more options if needed
            }
        } else {
            showResult()
        }
    }

    private fun checkAnswer(selectedOptionIndex: Int) {
        val question = questions[currentQuestionIndex]
        if (question.correctAnswer == selectedOptionIndex) {
            score++
        }
        currentQuestionIndex++
        showRandomFact()
        showQuestion()
    }

    private fun showIntermediateScoreDialog() {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_intermediate_score, null)
        val dialogBuilder = AlertDialog.Builder(this)
            .setView(dialogView)
            .setCancelable(false)

        val dialog = dialogBuilder.create()
        dialog.show()

        val dialogMessage = dialogView.findViewById<TextView>(R.id.dialog_message)
        dialogMessage.text = "You have answered $currentQuestionIndex questions. Your current score is $score. Do you wish to continue?"

        dialogView.findViewById<Button>(R.id.dialog_continue_button).setOnClickListener {
            isContinuing = true
            dialog.dismiss()
            showQuestion()
        }
        dialogView.findViewById<Button>(R.id.dialog_quit_button).setOnClickListener {
            dialog.dismiss()
            showResult()
        }
    }


// this will randomly show a fact while the user is playing the game
    private fun showRandomFact() {
    val category = intent.getStringExtra("category")
    val facts = DidYouKnowRepository.facts[category] ?: listOf()
    if (facts.isNotEmpty()) {
        val randomFact = facts.random()
        val popup = findViewById<RelativeLayout>(R.id.did_you_know_popup)
        val factText = findViewById<TextView>(R.id.did_you_know_text)
        factText.text = randomFact

        popup.visibility = View.VISIBLE
        popup.animate().translationY(0f).setDuration(500).start()

        findViewById<Button>(R.id.dismiss_button).setOnClickListener {
            popup.animate().translationY(popup.height.toFloat()).setDuration(500).withEndAction {
                popup.visibility = View.GONE
            }.start()
        }
    }
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