package com.example.lawnotes10v.screens.criminal.homicide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lawnotes10v.R
import com.example.lawnotes10v.databinding.ActivityCriminalQuizScoreChapter5Binding


class CriminalQuizScoreChapter5Activity : AppCompatActivity() {
    private lateinit var binding: ActivityCriminalQuizScoreChapter5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCriminalQuizScoreChapter5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val score = intent.getIntExtra("SCORE", 0)
        val totalQuestions =
            intent.getIntExtra("TOTAL_QUESTIONS", 1) // Make sure to pass this along with the score

        binding.scoreTextView.text = getString(R.string.score_format, score, totalQuestions)

        // Optionally handle retake quiz button
        binding.retakeQuizButton.setOnClickListener {
            val intent = Intent(this, CriminalQuizChapter5Activity::class.java)
            startActivity(intent)
            finish() // Close the current activity
        }
    }
}