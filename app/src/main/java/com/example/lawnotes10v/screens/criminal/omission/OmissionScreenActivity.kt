package com.example.lawnotes10v.screens.criminal.omission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lawnotes10v.databinding.ActivityOmissionScreenBinding

class OmissionScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOmissionScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOmissionScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFlashCards.setOnClickListener {
            startActivity(Intent(this, CriminalFlashCardChapter2Activity::class.java).apply {
            })
        }

        binding.btnQuiz.setOnClickListener {
            startActivity(Intent(this, CriminalQuizChapter2Activity::class.java).apply {
            })
        }

        binding.btnCases.setOnClickListener {
            startActivity(Intent(this, CriminalCasesChapter2Activity::class.java).apply {
            })
        }

    }
}