package com.example.lawnotes10v.screens.criminal.omission

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lawnotes10v.data.criminal.omission.FlashCardChapter2
import com.example.lawnotes10v.databinding.ActivityCriminalFlashCardChapter2Binding

class CriminalFlashCardChapter2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityCriminalFlashCardChapter2Binding
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCriminalFlashCardChapter2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        updateFlashCard() // Initial call to update the flashcard

        // Next Card button
        binding.btnNextCard.setOnClickListener {
            currentIndex = (currentIndex + 1) % FlashCardChapter2.flashCardsChapter2Data.size
            updateFlashCard()
        }

        // Back Card button
        binding.btnBackCard.setOnClickListener {
            currentIndex = if (currentIndex > 0) currentIndex - 1 else FlashCardChapter2.flashCardsChapter2Data.size - 1
            updateFlashCard()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateFlashCard() {
        val flashCard = FlashCardChapter2.flashCardsChapter2Data[currentIndex]
        binding.tvFlashCardText.text = "${flashCard.title}\n\n${flashCard.content}"
    }
}