package com.example.lawnotes10v.screens.criminal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lawnotes10v.databinding.ActivityCriminalChaptersSelectionBinding
import com.example.lawnotes10v.screens.criminal.actusreus.ActusReusScreenActivity
import com.example.lawnotes10v.screens.criminal.causation.CausationScreenActivity
import com.example.lawnotes10v.screens.criminal.homicide.HomicideScreenActivity
import com.example.lawnotes10v.screens.criminal.mensrea.MensReaScreenActivity
import com.example.lawnotes10v.screens.criminal.omission.OmissionScreenActivity


class CriminalChaptersSelectionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCriminalChaptersSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCriminalChaptersSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnChapter1.setOnClickListener {
            startActivity(Intent(this, ActusReusScreenActivity::class.java).apply {
            })
        }

        binding.btnChapter2.setOnClickListener {
            startActivity(Intent(this, OmissionScreenActivity::class.java).apply {
            })
        }

        binding.btnChapter3.setOnClickListener {
            startActivity(Intent(this, CausationScreenActivity::class.java).apply {
            })
        }

        binding.btnChapter4.setOnClickListener {
            startActivity(Intent(this, MensReaScreenActivity::class.java).apply {
            })
        }

        binding.btnChapter5.setOnClickListener {
            startActivity(Intent(this, HomicideScreenActivity::class.java).apply {
            })
        }

    }
}