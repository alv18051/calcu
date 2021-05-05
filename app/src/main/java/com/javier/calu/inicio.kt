package com.javier.calu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menui)

        //Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()

        val btnOpen: Button = findViewById(R.id.ingresar)

        btnOpen.setOnClickListener {
            Log.e("LOG", "OnClick")

            val intent = Intent(this, menu::class.java)
            intent.putExtra("valueA", "Valor desde actividad1")

            startActivity(intent)

        }
    }
}