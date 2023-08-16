package com.example.frutihub

import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.Sampler.Value
import android.view.animation.LinearInterpolator
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
        animations()
        invicible()
    }

    fun invicible() {
        binding.apply {
            quinoa.alpha = 0f
            linea1.alpha = 0f
            melon.alpha = 0f
            linea2.alpha = 0f
            tropical.alpha = 0f
        }
    }

    fun animations() {
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
                quinoa.alpha = animation
                linea1.alpha = animation
            }


            var inicioCart1 = quinoa.x
            var finCart1 = quinoa.x - 2000
            quinoa.x = finCart1
            var translationCart1 = ValueAnimator.ofFloat(finCart1, inicioCart1)
            translationCart1.duration = 1500
            translationCart1.interpolator = LinearInterpolator()
            translationCart1.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                quinoa.translationX = animation
                linea1.translationX = animation
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
                melon.alpha = animation
                linea2.alpha = animation
            }
            var inicioCart2 = melon.x
            var finCart2 = melon.x + 2000
            melon.x = finCart2
            var translationCart2 = ValueAnimator.ofFloat(finCart2, inicioCart2)
            translationCart2.duration = 1500
            translationCart2.interpolator = LinearInterpolator()
            translationCart2.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                melon.translationX = animation
                linea2.translationX = animation
            }
            translationCart2.startDelay = 1800
            translationCart2.start()
            apareceCart2.startDelay = 1800
            apareceCart2.start()


            //cart3
            var apareceCart3 = ValueAnimator.ofFloat(0f, 1f)
            apareceCart3.duration = 300
            apareceCart3.interpolator = LinearInterpolator()
            apareceCart3.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                tropical.alpha = animation
            }

            var inicioCart3 = tropical.x
            var finCart3 = tropical.x - 2000
            tropical.x = finCart3
            var translationCart3 = ValueAnimator.ofFloat(finCart3, inicioCart3)
            translationCart3.duration = 1500
            translationCart3.interpolator = LinearInterpolator()
            translationCart3.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                tropical.translationX = animation
            }
            translationCart3.startDelay = 2200
            translationCart3.start()
            apareceCart3.startDelay = 2200
            apareceCart3.start()


            //bootom
            var inicioBootom = bootom.y
            var finBootom = bootom.y + 2000
            bootom.y = finBootom
            var transtationBoottom = ValueAnimator.ofFloat(finBootom, inicioBootom)
            transtationBoottom.duration = 500
            transtationBoottom.interpolator = LinearInterpolator()
            transtationBoottom.addUpdateListener { ValueAnimator ->
                var animation = ValueAnimator.animatedValue as Float
                bootom.translationY = animation
            }
            transtationBoottom.startDelay = 3400
            transtationBoottom.start()
        }
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

                        txtNumbers.alpha = 0f
                        txtDelivery.alpha = 0f
                        btnDelivery.alpha = 0f
                        btnCarPay.alpha = 0f


                        var apareceTxt1 = ValueAnimator.ofFloat(0f, 1f)
                        apareceTxt1.duration = 500
                        apareceTxt1.interpolator = LinearInterpolator()
                        apareceTxt1.addUpdateListener { ValueAnimator ->
                            var animation = ValueAnimator.animatedValue as Float
                            txtDelivery.alpha = animation
                        }

                        var iniciotxt1 = txtDelivery.y
                        var fintxt1 = txtDelivery.y + 300
                        txtDelivery.y = fintxt1
                        var translacionTxt1 = ValueAnimator.ofFloat(fintxt1, iniciotxt1)
                        translacionTxt1.duration = 600
                        translacionTxt1.interpolator = LinearInterpolator()
                        translacionTxt1.addUpdateListener { ValueAnimator ->
                            var animation = ValueAnimator.animatedValue as Float
                            txtDelivery.translationY = animation
                        }
                        translacionTxt1.startDelay = 400
                        translacionTxt1.start()
                        apareceTxt1.startDelay = 400
                        apareceTxt1.start()


                    }
                }
            }

        }
    }
}