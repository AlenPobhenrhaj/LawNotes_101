package com.example.lawnotes10v.screens.lms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lawnotes10v.databinding.ActivityLsmChaptersSelectionBinding

class LsmChaptersSelectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLsmChaptersSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLsmChaptersSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnChapter1.setOnClickListener {
            startActivity(Intent(this, LsmScreenActivity::class.java).apply {
            })
        }
    }
}