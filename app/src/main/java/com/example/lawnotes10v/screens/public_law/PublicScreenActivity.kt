package com.example.lawnotes10v.screens.public_law

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.databinding.ActivityPublicScreenBinding
import com.example.lawnotes10v.screens.criminal.CriminalCasesChapter1Activity
import com.example.lawnotes10v.screens.criminal.CriminalQuizChapter1Activity

class PublicScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPublicScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPublicScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFlashCards.setOnClickListener {
            startActivity(Intent(this, PublicFlashCardChapter1Activity::class.java).apply {
            })
        }

        binding.btnQuiz.setOnClickListener {
            //Public Quiz
            startActivity(Intent(this, CriminalQuizChapter1Activity::class.java).apply {
            })
        }

        binding.btnCases.setOnClickListener {
            //PublicCases_Statutes
            startActivity(Intent(this, CriminalCasesChapter1Activity::class.java).apply {
            })
        }
    }
}