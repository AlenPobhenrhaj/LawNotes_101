package com.example.lawnotes10v.screens.criminal.actusreus

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.data.criminal.actus_reus.FlashCardCasesChapter1
import com.example.lawnotes10v.databinding.ActivityCriminalCasesChapter1Binding

class CriminalCasesChapter1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityCriminalCasesChapter1Binding
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCriminalCasesChapter1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        updateFlashCard() // Initial call to update the flashcard

        // Next Card button
        binding.btnNextCard.setOnClickListener {
            currentIndex += 1
            adjustIndexBounds()  // Adjust index dynamically
            updateFlashCard()     // Update the flashcard view
        }

        // Back Card button
        binding.btnBackCard.setOnClickListener {
            currentIndex -= 1
            adjustIndexBounds()  // Adjust index dynamically
            updateFlashCard()     // Update the flashcard view
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateFlashCard() {
        val flashCard = FlashCardCasesChapter1.flashCardsChapter1Data[currentIndex]
        binding.tvFlashCardText.text = "${flashCard.title}\n\n${flashCard.content}"
    }

    // Dynamic method to adjust index bounds
    private fun adjustIndexBounds() {
        val totalCards = FlashCardCasesChapter1.flashCardsChapter1Data.size

        // If currentIndex exceeds the maximum index, wrap it to 0 (circular behavior)
        if (currentIndex >= totalCards) {
            currentIndex = 0
        }

        // If currentIndex goes below 0, wrap it to the last index
        if (currentIndex < 0) {
            currentIndex = totalCards - 1
        }
    }
}
