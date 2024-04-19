package com.example.lawnotes10v.screens.contract

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.databinding.ActivityContractChapterSelectionBinding
import com.example.lawnotes10v.screens.criminal.CriminalScreenActivity

class ContractChapterSelectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContractChapterSelectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContractChapterSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnChapter1.setOnClickListener {
            startActivity(Intent(this, ContractScreenActivity::class.java).apply {
            })
        }
    }
}