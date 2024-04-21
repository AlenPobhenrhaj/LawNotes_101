package com.example.lawnotes10v.screens.lms

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.data.FlashCardChapter1Lsm
import com.example.lawnotes10v.databinding.ActivityLsmFlashCardChapter1Binding

class LsmFlashCardChapter1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityLsmFlashCardChapter1Binding
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLsmFlashCardChapter1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        updateFlashCard() // Initial call to update the flashcard

        // Next Card button
        binding.btnNextCard.setOnClickListener {
            currentIndex = (currentIndex + 1) % FlashCardChapter1Lsm.flashCardsChapter1Data.size
            updateFlashCard()
        }

        // Back Card button
        binding.btnBackCard.setOnClickListener {
            currentIndex =
                if (currentIndex > 0) currentIndex - 1 else FlashCardChapter1Lsm.flashCardsChapter1Data.size - 1
            updateFlashCard()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateFlashCard() {
        val flashCard = FlashCardChapter1Lsm.flashCardsChapter1Data[currentIndex]
        binding.tvFlashCardText.text = "${flashCard.title}\n\n${flashCard.content}"
    }
}