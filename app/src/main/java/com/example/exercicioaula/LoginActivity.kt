package com.example.exercicioaula

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        findViewById<Button>(R.id.button_clear).setOnClickListener { openNewActivity() }
    }

    fun openNewActivity() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}