package com.example.frutihub

import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.BounceInterpolator
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import com.example.frutihub.databinding.ActivityWelcomeBinding

class Welcome : AppCompatActivity() {
    lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        NextActivity()
        invisible()
        animaciones()
    }

    private fun NextActivity() {
        binding.btnNext.setOnClickListener {
            startActivity(Intent(this@Welcome, Authentication::class.java))
        }
    }

    fun invisible() {
        binding.apply {
            ensalada.alpha = 0f
            sombra.alpha = 0f
            titulo.alpha = 0f
            texto.alpha = 0f
            btnNext.alpha = 0f
            frutica.alpha = 0f
        }
    }

    fun animaciones() {
        binding.apply {
            //Contenedor
            var iniciocont = contenedor.y
            var fincont = contenedor.y + 2000
            contenedor.y = fincont
            var translacionContenedor = ValueAnimator.ofFloat(fincont, iniciocont)
            translacionContenedor.duration = 1000
            translacionContenedor.interpolator = DecelerateInterpolator()
            translacionContenedor.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                contenedor.translationY = animation
            }
            translacionContenedor.start()

            //Frutas/sombra

            var apareceEnsalada = ValueAnimator.ofFloat(0f, 1f)
            apareceEnsalada.duration = 1000
            apareceEnsalada.interpolator = BounceInterpolator()
            apareceEnsalada.addUpdateListener { ValueAnimator ->
                var animatio = ValueAnimator.animatedValue as Float
                ensalada.alpha = animatio
                ensalada.scaleY = animatio
                ensalada.scaleX = animatio
                sombra.alpha = animatio
                sombra.scaleY = animatio
                sombra.scaleX = animatio
                frutica.alpha = animatio
                frutica.scaleY = animatio
                frutica.scaleX = animatio
            }
            apareceEnsalada.startDelay = 800
            apareceEnsalada.start()


            //textos
            var aparecetitulo = ValueAnimator.ofFloat(0f, 1f)
            apareceEnsalada.duration = 1000
            apareceEnsalada.interpolator = LinearInterpolator()
            aparecetitulo.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                titulo.alpha = animation
                titulo.scaleX = animation
                titulo.scaleY = animation
                texto.alpha = animation
                texto.scaleX = animation
                texto.scaleY = animation
            }

            var iniciotitu = titulo.y
            var fintitu = titulo.y + 2000
            titulo.y = fintitu
            var translaciontitulo = ValueAnimator.ofFloat(fintitu, iniciotitu)
            translaciontitulo.duration = 1000
            translaciontitulo.interpolator = LinearInterpolator()
            translaciontitulo.addUpdateListener { ValueAnimator ->
                var aimation = ValueAnimator.animatedValue as Float
                titulo.translationY = aimation
                texto.translationY = aimation
            }

            aparecetitulo.startDelay = 1200
            translaciontitulo.startDelay = 1200
            aparecetitulo.start()
            translaciontitulo.start()



            //boton
            var apareceboton = ValueAnimator.ofFloat(0f, 1f)
            apareceboton.duration = 1000
            apareceboton.interpolator = LinearInterpolator()
            apareceboton.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                btnNext.alpha = animation
                btnNext.scaleX = animation
                btnNext.scaleY = animation

            }

            var iniciobtn = btnNext.y
            var finbtn = btnNext.y + 2000
            btnNext.y = finbtn
            var translacionbtn = ValueAnimator.ofFloat(finbtn, iniciobtn)
            translacionbtn.duration = 1000
            translacionbtn.interpolator = LinearInterpolator()
            translacionbtn.addUpdateListener { ValueAnimator ->
                var aimation = ValueAnimator.animatedValue as Float
                btnNext.translationY = aimation
            }

            apareceboton.startDelay = 1600
            translacionbtn.startDelay = 1600
            apareceboton.start()
            translacionbtn.start()

        }
    }
}