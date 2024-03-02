package com.productivityservicehub.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1  = findViewById<EditText>(R.id.num1)
        var num2=findViewById<EditText>(R.id.num2)
        var op=findViewById<EditText>(R.id.op)

        var calculate=findViewById<Button>(R.id.calculate)

        var result=findViewById<TextView>(R.id.result)

        calculate.setOnClickListener{
            val number1=num1.text.toString().toDouble()
            val number2=num2.text.toString().toDouble()
            val operation=op.text.toString()
            if (operation=="+"){
                val res=number1+number2
                result.text="$res"
            }
            if (operation=="-"){
                val res=number1-number2
                result.text="$res"
            }
            if (operation=="*"){
                val res=number1*number2
                result.text="$res"
            }
            if (operation=="/"){
                val res=number1/number2
                result.text="$res"
            }

        }
    }
}