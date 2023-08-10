package com.example.frutihub

import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowInsetsController
import android.view.animation.LinearInterpolator
import androidx.core.os.postDelayed
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.frutihub.databinding.ActivityMainBinding
import java.lang.reflect.Type

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        PantallaCompleta()
        Invisible()
        Animaciones()
        CambiarActivity()
    }

    fun Invisible() {
        binding.apply {
            logo1.alpha = 0f
            logo2.alpha = 0f
            logo3.alpha = 0f
            hoja2.alpha = 0f
            hoja1.alpha = 0f
            btn.alpha = 0f
        }
    }

    fun Animaciones() {
        binding.apply {
            //logo1

            var aparecelogo1 = ValueAnimator.ofFloat(0f, 1f)
            aparecelogo1.duration = 1000
            aparecelogo1.interpolator = LinearInterpolator()
            aparecelogo1.addUpdateListener { ValueAnimator ->
                var animatio = ValueAnimator.animatedValue as Float
                logo1.alpha = animatio
                logo1.scaleY = animatio
                logo1.scaleX = animatio
            }
            aparecelogo1.start()


            var inicio1 = logo1.y
            var fin1 = logo1.y + 150
            logo1.y = fin1
            var traslacionlogo1 = ValueAnimator.ofFloat(fin1, inicio1)
            traslacionlogo1.duration = 1000
            traslacionlogo1.interpolator = LinearInterpolator()
            traslacionlogo1.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                logo1.translationY = animation
            }
            traslacionlogo1.start()


            //logo2

            var aparecelogo2 = ValueAnimator.ofFloat(0f, 1f)
            aparecelogo2.duration = 1000
            aparecelogo2.interpolator = LinearInterpolator()
            aparecelogo2.addUpdateListener { ValueAnimator ->
                var animatio = ValueAnimator.animatedValue as Float
                logo2.alpha = animatio
                logo2.scaleY = animatio
                logo2.scaleX = animatio
            }
            aparecelogo2.startDelay = 1000
            aparecelogo2.start()


            var inicio2 = logo2.x
            var fin2 = logo2.x - 150
            logo2.x = fin2
            var traslacionlogo2 = ValueAnimator.ofFloat(fin2, inicio2)
            traslacionlogo2.duration = 1000
            traslacionlogo2.interpolator = LinearInterpolator()
            traslacionlogo2.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                logo2.translationX = animation
            }
            traslacionlogo2.startDelay = 1000
            traslacionlogo2.start()


            //logo3

            var aparecelogo3 = ValueAnimator.ofFloat(0f, 1f)
            aparecelogo3.duration = 1000
            aparecelogo3.interpolator = LinearInterpolator()
            aparecelogo3.addUpdateListener { ValueAnimator ->
                var animatio = ValueAnimator.animatedValue as Float
                logo3.alpha = animatio
                logo3.scaleY = animatio
                logo3.scaleX = animatio
            }
            aparecelogo3.startDelay = 1000
            aparecelogo3.start()


            var inicio3 = logo3.x
            var fin3 = logo3.x + 150
            logo3.x = fin3
            var traslacionlogo3 = ValueAnimator.ofFloat(fin3, inicio3)
            traslacionlogo3.duration = 1000
            traslacionlogo3.interpolator = LinearInterpolator()
            traslacionlogo3.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                logo3.translationX = animation
            }
            traslacionlogo3.startDelay = 1000
            traslacionlogo3.start()


            //hojas

            var aparecehojas = ValueAnimator.ofFloat(0f, 1f)
            aparecehojas.duration = 1000
            aparecehojas.interpolator = LinearInterpolator()
            aparecehojas.addUpdateListener { ValueAnimator ->
                var animatio = ValueAnimator.animatedValue as Float
                hoja1.alpha = animatio
                hoja2.alpha = animatio
                hoja1.scaleY = animatio
                hoja2.scaleY = animatio
                hoja1.scaleX = animatio
                hoja2.scaleX = animatio
            }
            aparecehojas.startDelay = 2000
            aparecehojas.start()


            var inicio4 = hoja1.y
            var fin4 = hoja1.y - 350
            hoja1.y = fin4
            var traslacionhojas = ValueAnimator.ofFloat(fin4, inicio4)
            traslacionhojas.duration = 1000
            traslacionhojas.interpolator = LinearInterpolator()
            traslacionhojas.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                hoja1.translationY = animation
                hoja2.translationY = animation
            }
            traslacionhojas.startDelay = 2000
            traslacionhojas.start()


            //boton

            var aparecebtn = ValueAnimator.ofFloat(0f, 1f)
            aparecebtn.duration = 1000
            aparecebtn.interpolator = LinearInterpolator()
            aparecebtn.addUpdateListener { ValueAnimator ->
                var animatio = ValueAnimator.animatedValue as Float
                btn.alpha = animatio
                btn.scaleY = animatio
                btn.scaleX = animatio
            }
            aparecebtn.startDelay = 2000
            aparecebtn.start()


            var inicio5 = btn.y
            var fin5 = btn.y + 350
            btn.y = fin5
            var traslacionbtn = ValueAnimator.ofFloat(fin5, inicio5)
            traslacionbtn.duration = 1000
            traslacionbtn.interpolator = LinearInterpolator()
            traslacionbtn.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                btn.translationY = animation
                btn.translationY = animation
            }
            traslacionbtn.startDelay = 2000
            traslacionbtn.start()

        }


    }

    fun PantallaCompleta() {
        WindowInsetsControllerCompat(
            window,
            window.decorView
        ).hide(WindowInsetsCompat.Type.systemBars())
    }

    fun CambiarActivity() {
        Handler(Looper.myLooper()!!).postDelayed(2000) {
            startActivity(Intent(this@MainActivity, Welcome::class.java))
            finish()
        }
    }
}