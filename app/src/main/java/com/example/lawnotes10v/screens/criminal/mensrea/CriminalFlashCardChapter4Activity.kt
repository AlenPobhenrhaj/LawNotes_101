package com.example.lawnotes10v.screens.criminal.mensrea

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lawnotes10v.data.criminal.mensrea.FlashCardChapter4
import com.example.lawnotes10v.databinding.ActivityCriminalFlashCardChapter4Binding


class CriminalFlashCardChapter4Activity : AppCompatActivity() {
    private lateinit var binding: ActivityCriminalFlashCardChapter4Binding
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCriminalFlashCardChapter4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        updateFlashCard() // Initial call to update the flashcard

        // Next Card button
        binding.btnNextCard.setOnClickListener {
            currentIndex = (currentIndex + 1) % FlashCardChapter4.flashCardsChapter4Data.size
            updateFlashCard()
        }

        // Back Card button
        binding.btnBackCard.setOnClickListener {
            currentIndex = if (currentIndex > 0) currentIndex - 1 else FlashCardChapter4.flashCardsChapter4Data.size - 1
            updateFlashCard()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateFlashCard() {
        val flashCard = FlashCardChapter4.flashCardsChapter4Data[currentIndex]
        binding.tvFlashCardText.text = "${flashCard.title}\n\n${flashCard.content}"
    }
}