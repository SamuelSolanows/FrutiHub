package com.example.frutihub

import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AccelerateInterpolator
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import android.view.animation.OvershootInterpolator
import androidx.core.os.postDelayed
import com.example.frutihub.databinding.ActivityHomeScreenOneBinding

class Home_screen_one : AppCompatActivity() {
    lateinit var bindig: ActivityHomeScreenOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindig = ActivityHomeScreenOneBinding.inflate(layoutInflater)
        setContentView(bindig.root)
        invisible()
        animacione()
        a()

    }


    fun invisible() {
        bindig.apply {
            menu.alpha = 0f
            canasta.alpha = 0f
            texto.alpha = 0f
            buscar.alpha = 0f
            recomendado.alpha = 0f
            recomendadotxt.alpha = 0f
            barra.alpha = 0f
            barraMenu.alpha = 0f
            quinoa.alpha = 0f
        }
    }

    fun animacione() {
        bindig.apply {

            //menú
            var aparecemenu = ValueAnimator.ofFloat(0f, 1f)
            aparecemenu.duration = 500
            aparecemenu.interpolator = LinearInterpolator()
            aparecemenu.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                menu.alpha = animation
                menu.scaleY = animation
                menu.scaleX = animation
            }
            aparecemenu.startDelay = 200
            aparecemenu.start()

            //texto
            var aparecetexto = ValueAnimator.ofFloat(0f, 1f)
            aparecetexto.duration = 600
            aparecetexto.interpolator = LinearInterpolator()
            aparecetexto.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                texto.alpha = animation
            }
            var iniiotex = texto.y
            var fintex = texto.y + 250
            texto.y = fintex
            var rodartexxto = ValueAnimator.ofFloat(fintex, iniiotex)
            rodartexxto.duration = 600
            rodartexxto.interpolator = LinearInterpolator()
            rodartexxto.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                texto.translationY = animation
            }
            aparecetexto.startDelay = 1000
            rodartexxto.startDelay = 1000
            aparecetexto.start()
            rodartexxto.start()


            //buscar
            var aparecebuscar = ValueAnimator.ofFloat(0f, 1f)
            aparecebuscar.duration = 600
            aparecebuscar.interpolator = LinearInterpolator()
            aparecebuscar.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                buscar.alpha = animation
            }


            var iniciobus = buscar.y
            var finbus = buscar.y + 250
            buscar.y = finbus
            var rodarbuscar = ValueAnimator.ofFloat(finbus, iniciobus)
            rodarbuscar.duration = 600
            rodarbuscar.interpolator = LinearInterpolator()
            rodarbuscar.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                buscar.translationY = animation
            }
            aparecebuscar.startDelay = 1500
            rodarbuscar.startDelay = 1500
            aparecebuscar.start()
            rodarbuscar.start()

            //recomendado
            var aparecerecomendadotxt = ValueAnimator.ofFloat(0f, 1f)
            aparecerecomendadotxt.duration = 600
            aparecerecomendadotxt.interpolator = LinearInterpolator()
            aparecerecomendadotxt.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                recomendadotxt.alpha = animation
                recomendado.alpha = animation
            }

            var iniciorecomen = recomendado.y
            var finorecomen = recomendado.y + 250
            recomendado.y = finorecomen
            var rodarrecomendado = ValueAnimator.ofFloat(finorecomen, iniciorecomen)
            rodarrecomendado.duration = 600
            rodarrecomendado.interpolator = LinearInterpolator()
            rodarrecomendado.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                recomendado.translationY = animation
            }
            aparecerecomendadotxt.startDelay = 1900
            aparecerecomendadotxt.start()
            rodarrecomendado.startDelay = 1900
            rodarrecomendado.start()


            //barra
            var aparecebarra = ValueAnimator.ofFloat(0f, 1f)
            aparecebarra.duration = 500
            aparecebarra.interpolator = OvershootInterpolator()
            aparecebarra.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                barra.alpha = animation
                barra.scaleX = animation
                barra.scaleY = animation
                canasta.alpha = animation
                canasta.scaleX = animation
                canasta.scaleY = animation
                barraMenu.alpha = animation
                barraMenu.scaleX = animation
                barraMenu.scaleY = animation
            }
            aparecebarra.startDelay = 2500
            aparecebarra.start()

            //tropical
            var iniciotropical = tropical.y
            var fintropical = tropical.y + 250
            tropical.y = fintropical
            var rodartropical = ValueAnimator.ofFloat(fintropical, iniciotropical)
            rodartropical.duration = 300
            rodartropical.interpolator = LinearInterpolator()
            rodartropical.addUpdateListener { ValueAnimator ->
                var animate = ValueAnimator.animatedValue as Float
                tropical.translationY = animate
            }
            rodartropical.startDelay = 2600
            rodartropical.start()


            //quinoa
            var aparecequinoa = ValueAnimator.ofFloat(0f, 1f)
            aparecequinoa.duration = 600
            aparecequinoa.interpolator = DecelerateInterpolator()
            aparecequinoa.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                quinoa.alpha = animation
                quinoa.scaleX = animation
                quinoa.scaleY = animation
            }
            aparecequinoa.startDelay = 2600
            aparecequinoa.start()

        }


    }

    fun a() {
        bindig.quinoa.setOnClickListener {
            startActivity(Intent(this@Home_screen_one, Completeorder::class.java))
        }
    }
}