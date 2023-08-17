package com.example.frutihub

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.BounceInterpolator
import android.view.animation.LinearInterpolator
import com.example.frutihub.databinding.ActivityTrackBinding

class Track : AppCompatActivity() {
    lateinit var binding: ActivityTrackBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrackBinding.inflate(layoutInflater)
        setContentView(binding.root)
        invisible()
        animation()
        binding.back.setOnClickListener {
            finish()
        }
    }


    fun invisible() {
        binding.apply {
            orden.alpha = 0f
            linea1.alpha = 0f
            prepared.alpha = 0f
            linea2.alpha = 0f
            delivery.alpha = 0f
            linea3.alpha = 0f
            mapa.alpha = 0f
            linea4.alpha = 0f
            received.alpha = 0f
        }
    }

    fun animation() {
        binding.apply {
            //Contenedor
            var inicioCont = contenedor.y
            var finCont = contenedor.y + 2000
            contenedor.y = finCont
            var transtationCont = ValueAnimator.ofFloat(finCont, inicioCont)
            transtationCont.duration = 500
            transtationCont.interpolator = LinearInterpolator()
            transtationCont.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                contenedor.translationY = animation
            }
            transtationCont.startDelay = 700
            transtationCont.start()

            //cart1
            var apareceCart1 = ValueAnimator.ofFloat(0f, 1f)
            apareceCart1.duration = 300
            apareceCart1.interpolator = LinearInterpolator()
            apareceCart1.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                orden.alpha = animation
                linea1.alpha = animation
            }


            var inicioCart1 = orden.y
            var finCart1 = orden.y + 2000
            orden.y = finCart1
            var translationCart1 = ValueAnimator.ofFloat(finCart1, inicioCart1)
            translationCart1.duration = 500
            translationCart1.interpolator = LinearInterpolator()
            translationCart1.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                orden.translationY = animation
            }
            translationCart1.startDelay = 1400
            translationCart1.start()

            apareceCart1.startDelay = 1400
            apareceCart1.start()


            //cart2
            var apareceCart2 = ValueAnimator.ofFloat(0f, 1f)
            apareceCart2.duration = 300
            apareceCart2.interpolator = LinearInterpolator()
            apareceCart2.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                prepared.alpha = animation
                linea2.alpha = animation
            }


            var inicioCart2 = prepared.y
            var finCart2 = prepared.y + 2000
            prepared.y = finCart2
            var translationCart2 = ValueAnimator.ofFloat(finCart2, inicioCart2)
            translationCart2.duration = 500
            translationCart2.interpolator = LinearInterpolator()
            translationCart2.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                prepared.translationY = animation
            }
            translationCart2.startDelay = 1900
            translationCart2.start()

            apareceCart2.startDelay = 1900
            apareceCart2.start()


            //cart3
            var apareceCart3 = ValueAnimator.ofFloat(0f, 1f)
            apareceCart3.duration = 300
            apareceCart3.interpolator = LinearInterpolator()
            apareceCart3.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                delivery.alpha = animation
                linea3.alpha = animation
            }


            var inicioCart3 = delivery.x
            var finCart3 = delivery.x - 2000
            delivery.x = finCart3
            var translationCart3 = ValueAnimator.ofFloat(finCart3, inicioCart3)
            translationCart3.duration = 500
            translationCart3.interpolator = LinearInterpolator()
            translationCart3.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                delivery.translationX = animation
            }
            translationCart3.startDelay = 2400
            translationCart3.start()

            apareceCart3.startDelay = 2400
            apareceCart3.start()


            //mapa
            var apareceMapa = ValueAnimator.ofFloat(0f, 1f)
            apareceMapa.duration = 900
            apareceMapa.interpolator = BounceInterpolator()
            apareceMapa.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                mapa.alpha = animation
                mapa.scaleX = animation
                mapa.scaleY = animation
                linea4.alpha = animation
                linea4.scaleX = animation
                linea4.scaleY = animation
            }

            apareceMapa.startDelay = 2700
            apareceMapa.start()


            //cart4
            var apareceCart4 = ValueAnimator.ofFloat(0f, 1f)
            apareceCart4.duration = 300
            apareceCart4.interpolator = LinearInterpolator()
            apareceCart4.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                received.alpha = animation
            }


            var inicioCart4 = received.y
            var finCart4 = received.y + 2000
            received.y = finCart4
            var rodarCart4 = ValueAnimator.ofFloat(finCart4, inicioCart4)
            rodarCart4.duration = 300
            rodarCart4.interpolator = LinearInterpolator()
            rodarCart4.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                received.translationY = animation
            }
            apareceCart4.startDelay = 3200
            apareceCart4.start()
            rodarCart4.startDelay = 3200
            rodarCart4.start()

        }
    }
}