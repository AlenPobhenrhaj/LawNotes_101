package com.example.lawnotes10v.screens.criminal.homicide

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lawnotes10v.data.criminal.homicide.FlashCardChapter5
import com.example.lawnotes10v.databinding.ActivityCriminalFlashCardChapter5Binding


class CriminalFlashCardChapter5Activity : AppCompatActivity() {
    private lateinit var binding: ActivityCriminalFlashCardChapter5Binding
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCriminalFlashCardChapter5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        updateFlashCard() // Initial call to update the flashcard

        // Next Card button
        binding.btnNextCard.setOnClickListener {
            currentIndex = (currentIndex + 1) % FlashCardChapter5.flashCardsChapter5Data.size
            updateFlashCard()
        }

        // Back Card button
        binding.btnBackCard.setOnClickListener {
            currentIndex = if (currentIndex > 0) currentIndex - 1 else FlashCardChapter5.flashCardsChapter5Data.size - 1
            updateFlashCard()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateFlashCard() {
        val flashCard = FlashCardChapter5.flashCardsChapter5Data[currentIndex]
        binding.tvFlashCardText.text = "${flashCard.title}\n\n${flashCard.content}"
    }
}