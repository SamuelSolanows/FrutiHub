package com.example.frutihub

import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import com.example.frutihub.databinding.ActivityOrderCompleteBinding

class OrderComplete : AppCompatActivity() {
    lateinit var binding: ActivityOrderCompleteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderCompleteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Invisible()
        Pasar()
        Animation()
    }

    fun Invisible() {
        binding.apply {
            cheked.alpha = 0f
            textos.alpha = 0f
            btnTrack.alpha = 0f
            btnContinueShopping.alpha = 0f
        }
    }

    fun Animation() {
        binding.apply {
            //cheked
            var apareceCheked = ValueAnimator.ofFloat(0f, 1f)
            apareceCheked.duration = 1000
            apareceCheked.interpolator = DecelerateInterpolator()
            apareceCheked.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                cheked.alpha = animation
                cheked.scaleY = animation
                cheked.scaleX = animation
            }

            apareceCheked.startDelay = 1500
            apareceCheked.start()


            //textos
            var apareceTextos = ValueAnimator.ofFloat(0f, 1f)
            apareceTextos.duration = 1000
            apareceTextos.interpolator = DecelerateInterpolator()
            apareceTextos.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                textos.alpha = animation
                textos.scaleY = animation
                textos.scaleX = animation
            }

            var inicioTxt = textos.y
            var finTxt = textos.y + 300
            textos.y = finTxt
            var transladarTexto = ValueAnimator.ofFloat(finTxt, inicioTxt)
            transladarTexto.duration = 500
            transladarTexto.interpolator = LinearInterpolator()
            transladarTexto.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                textos.translationY = animation
            }

            transladarTexto.startDelay = 2000
            transladarTexto.start()
            apareceTextos.startDelay = 2000
            apareceTextos.start()

        }
    }


    fun Pasar() {
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