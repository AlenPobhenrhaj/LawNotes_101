package com.example.lawnotes10v.screens.criminal

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.data.FlashCardCasesChapter1
import com.example.lawnotes10v.data.FlashCardChapter1
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
            currentIndex = (currentIndex + 1) % FlashCardChapter1.flashCardsChapter1Data.size
            updateFlashCard()
        }

        // Back Card button
        binding.btnBackCard.setOnClickListener {
            currentIndex =
                if (currentIndex > 0) currentIndex - 1 else FlashCardChapter1.flashCardsChapter1Data.size - 1
            updateFlashCard()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateFlashCard() {
        val flashCard = FlashCardCasesChapter1.flashCardsChapter1Data[currentIndex]
        binding.tvFlashCardText.text = "${flashCard.title}\n\n${flashCard.content}"
    }
}