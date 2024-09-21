package com.example.lawnotes10v.screens.criminal.causation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.databinding.ActivityActusReusScreenBinding
import com.example.lawnotes10v.databinding.ActivityCausationScreenBinding
import com.example.lawnotes10v.screens.criminal.actusreus.CriminalCasesChapter1Activity
import com.example.lawnotes10v.screens.criminal.actusreus.CriminalFlashCardChapter1Activity
import com.example.lawnotes10v.screens.criminal.actusreus.CriminalQuizChapter1Activity

class CausationScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCausationScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCausationScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFlashCards.setOnClickListener {
            startActivity(Intent(this, CriminalFlashCardChapter3Activity::class.java).apply {
            })
        }

        binding.btnQuiz.setOnClickListener {
            startActivity(Intent(this, CriminalQuizChapter3Activity::class.java).apply {
            })
        }

        binding.btnCases.setOnClickListener {
            startActivity(Intent(this, CriminalCasesChapter3Activity::class.java).apply {
            })
        }

    }
}