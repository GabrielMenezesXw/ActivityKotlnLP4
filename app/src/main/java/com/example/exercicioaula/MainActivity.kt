package com.example.exercicioaula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener { onClick() }
    }

    fun onClick() {
        val nome = findViewById<EditText>(R.id.et_nome)
        val nomeConcatenado = "OLÁ ${nome.text}";
        nome.setText(nomeConcatenado)
    }


}