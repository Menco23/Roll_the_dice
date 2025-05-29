package com.example.menculinirollthedice

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth)

        val numero = intent.getIntExtra("RANDOM", -1)
        val textView = findViewById<TextView>(R.id.textViewFourthActivity)

        if (numero != -1 && numero % 2 != 0) {
            textView.text = " Peccato! Hai perso con il numero dispari: $numero"
            Toast.makeText(this, "Riprova!", Toast.LENGTH_LONG).show()
        } else {
            textView.text = "Numero non valido o non dispari: $numero"
        }
    }
}
