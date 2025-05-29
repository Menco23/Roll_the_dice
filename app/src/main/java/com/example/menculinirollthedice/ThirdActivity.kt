package com.example.menculinirollthedice

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val numero = intent.getIntExtra("RANDOM", -1)

        val textView = findViewById<TextView>(R.id.textViewThirdActivity)

        if (numero != -1 && numero % 2 == 0) {
            textView.text = " Complimenti! Hai vinto con il numero pari: $numero!"
            Toast.makeText(this, "Hai vinto!", Toast.LENGTH_LONG).show()
        } else {
            textView.text = "Questo numero non è pari: $numero"
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
