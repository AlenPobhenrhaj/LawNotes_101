package com.example.lawnotes10v

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.databinding.ActivityMainBinding
import com.example.lawnotes10v.screens.contract.ContractChapterSelectionActivity
import com.example.lawnotes10v.screens.criminal.CriminalChaptersSelectionActivity
import com.example.lawnotes10v.screens.lms.LsmChaptersSelectionActivity
import com.example.lawnotes10v.screens.public_law.PublicChaptersSelectionActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setting up listeners or any other logic
        binding.btnCriminal.setOnClickListener {
            // start your activity by passing the intent
            startActivity(Intent(this, CriminalChaptersSelectionActivity::class.java).apply {
            })
        }
        binding.btnContract.setOnClickListener {
            // Handle Contract button click
            startActivity(Intent(this, ContractChapterSelectionActivity::class.java).apply {
            })
        }
        binding.btnPublic.setOnClickListener {
            // Handle Public button click
            startActivity(Intent(this, PublicChaptersSelectionActivity::class.java).apply {
            })
        }
        binding.btnLSM.setOnClickListener {
            // Handle LSM button click
            startActivity(Intent(this, LsmChaptersSelectionActivity::class.java).apply {
            })
        }
    }
}