package com.example.lawnotes10v.screens.criminal.homicide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lawnotes10v.databinding.ActivityHomicideScreenBinding


class HomicideScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomicideScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomicideScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFlashCards.setOnClickListener {
            startActivity(Intent(this, CriminalFlashCardChapter5Activity::class.java).apply {
            })
        }

        binding.btnQuiz.setOnClickListener {
            startActivity(Intent(this, CriminalQuizChapter5Activity::class.java).apply {
            })
        }

        binding.btnCases.setOnClickListener {
            startActivity(Intent(this, CriminalCasesChapter5Activity::class.java).apply {
            })
        }

    }
}