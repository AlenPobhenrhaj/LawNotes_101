package com.example.lawnotes10v.screens.contract

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.databinding.ActivityContractScreenBinding
import com.example.lawnotes10v.screens.criminal.CriminalCasesChapter1Activity
import com.example.lawnotes10v.screens.criminal.CriminalFlashCardChapter1Activity
import com.example.lawnotes10v.screens.criminal.CriminalQuizChapter1Activity

class ContractScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContractScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContractScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFlashCards.setOnClickListener {
            startActivity(Intent(this, ContractFlashCardChapter1Activity::class.java).apply {
            })
        }

        binding.btnQuiz.setOnClickListener {
            startActivity(Intent(this, CriminalQuizChapter1Activity::class.java).apply {
            })
        }

        binding.btnCases.setOnClickListener {
            startActivity(Intent(this, CriminalCasesChapter1Activity::class.java).apply {
            })
        }
    }
}