package com.example.frutihub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.frutihub.databinding.ActivityBasketBinding
import com.example.frutihub.databinding.CompleteOrderBootomBinding
import com.example.frutihub.databinding.DatosPersonalesBootomBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class Basket : AppCompatActivity() {
    lateinit var binding: ActivityBasketBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBasketBinding.inflate(layoutInflater)
        setContentView(binding.root)
        botoomSheep()
    }

    fun botoomSheep() {
        binding.back.setOnClickListener {
            finish()
        }
        binding.btn.setOnClickListener {
            var vista = CompleteOrderBootomBinding.inflate(layoutInflater)
            var alerta = BottomSheetDialog(this@Basket)
            alerta.setCancelable(true)
            alerta.setContentView(vista.root)
            alerta.show()

            vista.apply {
                btnDelivery.setOnClickListener {
                    startActivity(Intent(this@Basket, OrderComplete::class.java))
                }
                btnCarPay.setOnClickListener {
                    var vista2 = DatosPersonalesBootomBinding.inflate(layoutInflater)
                    alerta.setContentView(vista2.root)
                    alerta.setCancelable(true)
                    alerta.show()
                    vista2.apply {
                        btnCompleteOrder.setOnClickListener {
                            startActivity(Intent(this@Basket, OrderComplete::class.java))
                        }
                    }
                }
            }

        }
    }
}