package com.example.frutihub

import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.LinearInterpolator
import com.example.frutihub.databinding.ActivityCompleteorderBinding

class Completeorder : AppCompatActivity() {
    lateinit var binding: ActivityCompleteorderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompleteorderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        invisible()
        animation()
        CambiarActividad()
        binding.back.setOnClickListener {
            finish()
        }

    }

    fun invisible() {
        binding.apply {
            desayuno.alpha = 0f
            letras.alpha = 0f
        }
    }

    fun animation() {
        binding.apply {


            //plato
            var apareceplato = ValueAnimator.ofFloat(0f, 1f)
            apareceplato.duration = 500
            apareceplato.interpolator = LinearInterpolator()
            apareceplato.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                desayuno.alpha = animation
                desayuno.scaleY = animation
                desayuno.scaleX = animation


            }
            apareceplato.startDelay = 300
            apareceplato.start()


            //contenedor
            var iniciocont = contenedor.y
            var fincont = contenedor.y + 2500
            contenedor.y = fincont
            var translacionContenedor = ValueAnimator.ofFloat(fincont, iniciocont)
            translacionContenedor.duration = 500
            translacionContenedor.interpolator = LinearInterpolator()
            translacionContenedor.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                contenedor.translationY = animation
            }
            translacionContenedor.startDelay = 700
            translacionContenedor.start()


            //letras
            var aapreceletra = ValueAnimator.ofFloat(0f, 1f)
            aapreceletra.duration = 500
            aapreceletra.interpolator = LinearInterpolator()
            aapreceletra.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                letras.alpha = animation


            }
            aapreceletra.startDelay = 1500
            aapreceletra.start()


            //like
            var iniciolike = like.x
            var finlike = like.x - 2000
            like.x = finlike
            var translacionlike = ValueAnimator.ofFloat(finlike, iniciolike)
            translacionlike.duration = 500
            translacionlike.interpolator = LinearInterpolator()
            translacionlike.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                like.translationX = animation
            }
            translacionlike.startDelay = 1900
            translacionlike.start()

            //btn
            var iniciobtn = btn.x
            var finbtn = btn.x + 2000
            btn.x = finbtn
            var translacionbtn = ValueAnimator.ofFloat(finbtn, iniciobtn)
            translacionbtn.duration = 500
            translacionbtn.interpolator = LinearInterpolator()
            translacionbtn.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                btn.translationX = animation
            }
            translacionbtn.startDelay = 1900
            translacionbtn.start()


        }
    }

    fun CambiarActividad() {
        binding.btn.setOnClickListener {
            startActivity(Intent(this@Completeorder, Basket::class.java))
        }
    }
}