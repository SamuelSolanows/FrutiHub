package com.example.frutihub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.frutihub.databinding.ActivityOrderCompleteBinding
import com.example.frutihub.databinding.CompleteOrderBootomBinding

class OrderComplete : AppCompatActivity() {
    lateinit var binding: ActivityOrderCompleteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderCompleteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnTrack.setOnClickListener {
                startActivity(Intent(this@OrderComplete, Track::class.java))
            }

            btnContinueShopping.setOnClickListener {
                startActivity(Intent(this@OrderComplete, Home_screen_one::class.java))

            }
        }

    }
}