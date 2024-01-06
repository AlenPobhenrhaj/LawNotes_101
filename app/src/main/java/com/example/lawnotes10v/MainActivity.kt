package com.example.lawnotes10v

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.databinding.ActivityMainBinding
import com.example.lawnotes10v.screens.criminal.CriminalChaptersSelectionActivity

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
        }
        binding.btnPublic.setOnClickListener {
            // Handle Public button click
        }
        binding.btnLSM.setOnClickListener {
            // Handle LSM button click
        }
    }
}