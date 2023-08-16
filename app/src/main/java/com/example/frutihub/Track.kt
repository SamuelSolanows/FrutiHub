package com.example.frutihub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.frutihub.databinding.ActivityTrackBinding

class Track : AppCompatActivity() {
    lateinit var binding: ActivityTrackBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrackBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            finish()
        }
    }
}