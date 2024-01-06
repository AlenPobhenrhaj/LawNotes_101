package com.example.lawnotes10v.screens.criminal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.databinding.ActivityCriminalChaptersSelectionBinding


class CriminalChaptersSelectionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCriminalChaptersSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCriminalChaptersSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnChapter1.setOnClickListener {
            startActivity(Intent(this, CriminalScreenActivity::class.java).apply {
            })
        }

    }
}