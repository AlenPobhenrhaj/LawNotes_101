package com.example.lawnotes10v.screens.contract

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.data.FlashCardChapter1
import com.example.lawnotes10v.data.FlashCardChapter1Contract
import com.example.lawnotes10v.databinding.ActivityContractFlashCardChapter1Binding

class ContractFlashCardChapter1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityContractFlashCardChapter1Binding
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContractFlashCardChapter1Binding.inflate(layoutInflater)
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
        val flashCard = FlashCardChapter1Contract.flashCardsChapter1Data[currentIndex]
        binding.tvFlashCardText.text = "${flashCard.title}\n\n${flashCard.content}"
    }
}