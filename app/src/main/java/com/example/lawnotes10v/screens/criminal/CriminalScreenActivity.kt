package com.example.lawnotes10v.screens.criminal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.databinding.ActivityCriminalScreenBinding

class CriminalScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCriminalScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCriminalScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFlashCards.setOnClickListener {
            startActivity(Intent(this, CriminalFlashCardChapter1Activity::class.java).apply {
            })
        }

        binding.btnQuiz.setOnClickListener {
            startActivity(Intent(this, CriminalQuizChapter1Activity::class.java).apply {
            })
        }

        binding.btnCases.setOnClickListener {
            startActivity(Intent(this, CriminalQuizChapter1Activity::class.java).apply {
            })
        }

    }

}