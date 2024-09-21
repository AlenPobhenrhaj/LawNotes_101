package com.example.lawnotes10v.screens.criminal.causation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lawnotes10v.data.criminal.causation.FlashCardChapter3
import com.example.lawnotes10v.databinding.ActivityCriminalFlashCardChapter3Binding

class CriminalFlashCardChapter3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityCriminalFlashCardChapter3Binding
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCriminalFlashCardChapter3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        updateFlashCard() // Initial call to update the flashcard

        // Next Card button
        binding.btnNextCard.setOnClickListener {
            currentIndex = (currentIndex + 1) % FlashCardChapter3.flashCardsChapter3Data.size
            updateFlashCard()
        }

        // Back Card button
        binding.btnBackCard.setOnClickListener {
            currentIndex = if (currentIndex > 0) currentIndex - 1 else FlashCardChapter3.flashCardsChapter3Data.size - 1
            updateFlashCard()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateFlashCard() {
        val flashCard = FlashCardChapter3.flashCardsChapter3Data[currentIndex]
        binding.tvFlashCardText.text = "${flashCard.title}\n\n${flashCard.content}"
    }
}