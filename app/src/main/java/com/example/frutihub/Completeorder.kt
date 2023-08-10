package com.example.frutihub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.frutihub.databinding.ActivityCompleteorderBinding

class Completeorder : AppCompatActivity() {
    lateinit var binding:ActivityCompleteorderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCompleteorderBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}