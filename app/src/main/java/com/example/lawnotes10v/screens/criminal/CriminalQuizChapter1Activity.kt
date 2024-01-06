package com.example.lawnotes10v.screens.criminal

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.data.QuizQuestion
import com.example.lawnotes10v.data.QuizRepository.quizQuestions
import com.example.lawnotes10v.databinding.ActivityCriminalQuizChapter1Binding

class CriminalQuizChapter1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityCriminalQuizChapter1Binding
    private var currentIndex = 0
    private var isExplanationVisible = false
    private var score = 0 // A global variable to track the score


    companion object {
        const val CURRENT_QUESTION_INDEX = "current_question_index"
        const val IS_EXPLANATION_VISIBLE = "is_explanation_visible"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCriminalQuizChapter1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initially disable the submit button
        binding.submitAnswerButton.isEnabled = false

        // Only shuffle the questions if savedInstanceState is null, indicating a fresh start
        if (savedInstanceState == null) {
            quizQuestions.shuffle()  // Shuffle the questions
            currentIndex = 0 // Reset the index to start at the first question
        } else {
            // Restore the state
            currentIndex = savedInstanceState.getInt(CURRENT_QUESTION_INDEX, 0)
            isExplanationVisible = savedInstanceState.getBoolean(IS_EXPLANATION_VISIBLE, false)
        }
        setupInitialState()
        loadQuestion(quizQuestions[currentIndex])
        handleSubmissionAnswer()
    }
    private fun setupInitialState() {
        // Listener for RadioGroup to enable the submit button when an option is selected
        binding.answersRadioGroup.setOnCheckedChangeListener { _, checkedId ->
            if (checkedId != -1) {
                // Enable the submit button
                binding.submitAnswerButton.isEnabled = true
            }
        }
    }
    private fun handleSubmissionAnswer() {
        binding.submitAnswerButton.setOnClickListener {
            if (!isExplanationVisible) {
                // If the explanation isn't visible, show the answer and explanation
                showAnswer()
                // After showing the answer, prepare the button for the next action, which is "Next Question"
                binding.submitAnswerButton.isEnabled = true // Enable it for the next action
                binding.submitAnswerButton.text =
                    "Next Question" // Change text to indicate the next action
            } else {
                // If the explanation is visible, move to the next question
                nextQuestion()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(CURRENT_QUESTION_INDEX, currentIndex)
        outState.putBoolean(IS_EXPLANATION_VISIBLE, isExplanationVisible)
    }
    private fun loadQuestion(question: QuizQuestion) {

        // Clear previous selection and reset button states
        binding.answersRadioGroup.clearCheck()
        binding.submitAnswerButton.isEnabled = false // Disable submit button initially

        binding.questionTextView.text = question.question
        question.options.shuffle() // Randomize options

        binding.answersRadioGroup.clearCheck() // Clear any previous selection
        binding.answersRadioGroup.removeAllViews() // Clear previous options

        question.options.forEachIndexed { _, answer ->
            val radioButton = RadioButton(this)
            radioButton.id = View.generateViewId() // Generate a unique ID for the radio button
            radioButton.text = answer
            binding.answersRadioGroup.addView(radioButton)
        }

        // Set the explanation text but hide the view until an answer is submitted
        binding.explanationTextView.text = question.explanation // Set explanation for later
        binding.explanationTextView.visibility = View.GONE // Hide explanation initially

        // Reset the submit button state when a new question is loaded
        binding.submitAnswerButton.isEnabled = false // Disable until an option is selected
        binding.submitAnswerButton.text = "Submit" // Set text to "Submit"
    }

    private fun showAnswer() {
        val selectedOptionIndex =
            binding.answersRadioGroup.indexOfChild(findViewById(binding.answersRadioGroup.checkedRadioButtonId))
        val correctOptionIndex =
            quizQuestions[currentIndex].options.indexOf(quizQuestions[currentIndex].correctAnswer)

        // Highlight correct and wrong answers and disable further selection
        for (i in 0 until binding.answersRadioGroup.childCount) {
            val radioButton = binding.answersRadioGroup.getChildAt(i) as RadioButton
            radioButton.isEnabled = false // Disable all options
            if (i == selectedOptionIndex && selectedOptionIndex != correctOptionIndex) {
                radioButton.setTextColor(Color.RED) // Wrong answer
            } else if (i == correctOptionIndex) {
                radioButton.setTextColor(Color.GREEN) // Correct answer
            }
        }

        // Show explanation
        showExplanation()

        // Update the score if the selected answer is correct
        if (selectedOptionIndex == correctOptionIndex) {
            score++ // Assume 'score' is a global variable tracking the user's score
        }

        // Disable the submit button after an answer is submitted
        binding.submitAnswerButton.isEnabled = false

        // After showing the answer, set the isExplanationVisible to true as we're now showing the explanation
        isExplanationVisible = true
    }
    private fun showExplanation() {
        binding.explanationTextView.text = quizQuestions[currentIndex].explanation
        binding.explanationTextView.visibility = View.VISIBLE
        isExplanationVisible = true

    }
    private fun nextQuestion() {
        if (currentIndex < quizQuestions.size - 1) {
            currentIndex++
            isExplanationVisible = false
            loadQuestion(quizQuestions[currentIndex])

        } else {
            // Handle end of quiz, navigate to a results screen or show a summary
            navigateToScoreScreen()
        }

        // Once the next question is loaded, ensure the submit button is set back to its initial state
        binding.submitAnswerButton.isEnabled = false // Disable until an option is selected
        binding.submitAnswerButton.text = "Submit" // Change text back to "Submit"
        isExplanationVisible = false // Set explanation flag back to false
    }
    private fun navigateToScoreScreen() {
        val intent = Intent(this, CriminalQuizScoreChapter1Activity::class.java)
        intent.putExtra("SCORE", score)
        intent.putExtra("TOTAL_QUESTIONS", quizQuestions.size)
        startActivity(intent)
        finish() // Close the current activity
    }
}
