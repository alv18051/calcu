package com.javier.calu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class z : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculadora)

        var op: String = ""

        val imprimir: TextView = findViewById(R.id.TxtValue)

        val numero0: Button = findViewById(R.id.b0)
        val numero1: Button = findViewById(R.id.b1)
        val numero2: Button = findViewById(R.id.b2)
        val numero3: Button = findViewById(R.id.b3)
        val numero4: Button = findViewById(R.id.b4)
        val numero5: Button = findViewById(R.id.b5)
        val numero6: Button = findViewById(R.id.b6)
        val numero7: Button = findViewById(R.id.b7)
        val numero8: Button = findViewById(R.id.b8)
        val numero9: Button = findViewById(R.id.b9)

        val bClr: Button = findViewById(R.id.bCr)

        val bSum: Button = findViewById(R.id.bSum)
        val bRest: Button = findViewById(R.id.bRes)
        val bMulti: Button = findViewById(R.id.bMul)
        val bDiv: Button = findViewById(R.id.bDiv)
        val bIgu: Button = findViewById(R.id.bIgu)

        var rgstr: String = ""
        var val1: String = ""
        var n1: Double = 0.0
        var n2: Double = 0.0
        var results: Double = 0.0
        var resultStr: String


        numero0.setOnClickListener {
            if(val1==""){
                val1="0"
            }
            else{
                rgstr = "0"
                val1+= rgstr
                imprimir.text = val1
            }
        }
        numero1.setOnClickListener {
            if(val1=="0"){
                val1="1"
                imprimir.text = val1
            } else {
                rgstr = "1"
                val1 += rgstr
                imprimir.text = val1
            }
        }
        numero2.setOnClickListener {
            if(val1=="0"){
                val1="2"
                imprimir.text = val1
            } else {
                rgstr = "2"
                val1 += rgstr
                imprimir.text = val1
            }
        }
        numero3.setOnClickListener {
            if(val1=="0"){
                val1="3"
                imprimir.text = val1
            } else {
                rgstr = "3"
                val1 += rgstr
                imprimir.text = val1
            }
        }
        numero4.setOnClickListener {
            if(val1=="0"){
                val1="4"
                imprimir.text = val1
            } else {
                rgstr = "4"
                val1 += rgstr
                imprimir.text = val1
            }
        }
        numero5.setOnClickListener {
            if(val1=="0"){
                val1="5"
                imprimir.text = val1
            } else {
                rgstr = "5"
                val1 += rgstr
                imprimir.text = val1
            }
        }
        numero6.setOnClickListener {
            if(val1=="0"){
                val1="6"
                imprimir.text = val1
            } else {
                rgstr = "6"
                val1 += rgstr
                imprimir.text = val1
            }
        }
        numero7.setOnClickListener {
            if(val1=="0"){
                val1="7"
                imprimir.text = val1
            } else {
                rgstr = "7"
                val1 += rgstr
                imprimir.text = val1
            }
        }
        numero8.setOnClickListener {
            if(val1=="0"){
                val1="8"
                imprimir.text = val1
            } else {
                rgstr = "8"
                val1 += rgstr
                imprimir.text = val1
            }
        }
        numero9.setOnClickListener {
            if(val1=="0"){
                val1="9"
                imprimir.text = val1
            } else {
                rgstr = "9"
                val1 += rgstr
                imprimir.text = val1
            }
        }

        bClr.setOnClickListener {
            val1 = ""
            imprimir.text = val1
        }


        bSum.setOnClickListener {
            if(val1 ==""){
                n1 = 0.0
            } else{
                n1 = val1.toDouble()
            }
            val1 = ""
            imprimir.text = val1
            op = "suma"
        }
        bRest.setOnClickListener {
            if(val1 ==""){
                n1=0.0
            } else{
                n1 = val1.toDouble()
            }
            val1 = ""
            imprimir.text = val1
            op = "resta"
        }
        bMulti.setOnClickListener {
            if(val1 ==""){
                n1=0.0
            } else{
                n2 = val1.toDouble()
            }
            val1 = ""
            imprimir.text = val1
            op = "multiplicacion"
        }
        bDiv.setOnClickListener {
            if(val1 ==""){
                n1=0.0
            } else{
                n1 = val1.toDouble()
            }
            val1 = ""
            imprimir.text = val1
            op = "division"
        }
        bIgu.setOnClickListener {
            n2 = val1.toDouble()
            if(op == "suma"){
                results = n1+n2
            }
            else if(op == "resta"){
                results = n1-n2
            }
            else if(op == "multiplicacion"){
                results = n1*n2
            }
            else if(op == "division"){
                results = n1/n2
            }
            else if (op == ""){
                imprimir.text = val1
            }
            resultStr = results.toString()
            imprimir.text = resultStr
            val1 = resultStr

        }











    }


}