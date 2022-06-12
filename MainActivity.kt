package com.mesq.schwarzschildcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.pow

val foo : Double = 10.0.pow(-11)
val gravitationalConstant : Double = 6.674.times(foo)

val bar : Double = 10.0.pow(8)
val speedOfLight : Double = 2.99792458.times(bar)



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainTextView : TextView = findViewById(R.id.textView)
        val mainButton : Button = findViewById(R.id.button)
        mainButton.setOnClickListener {
            mainTextView.text = schwarzschildCalc(70.0).toString()
        }
    }
}

fun schwarzschildCalc(bodyMass: Double): Double {
    val num = 2.times(gravitationalConstant).times(bodyMass)
    val den = speedOfLight.pow(2)
    return num / den
}
