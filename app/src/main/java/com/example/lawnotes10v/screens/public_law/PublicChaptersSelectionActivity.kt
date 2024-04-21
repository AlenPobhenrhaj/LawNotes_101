package com.example.lawnotes10v.screens.public_law

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.databinding.ActivityPublicChaptersSelectionBinding

class PublicChaptersSelectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPublicChaptersSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPublicChaptersSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnChapter1.setOnClickListener {
            startActivity(Intent(this, PublicScreenActivity::class.java).apply {
            })
        }
    }
}