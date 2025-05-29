package com.example.menculinirollthedice

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val msg = intent.getStringExtra("MESSAGE")
        val textView = findViewById<TextView>(R.id.textView2Activity)
        textView.text = msg

        val imageViewSecond = findViewById<ImageView>(R.id.imageViewSecondActivity)
        val random = intent.getIntExtra("RANDOM", -1)
        val resource = when (random) {
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            6 -> R.drawable.dice_face_6
            else -> R.drawable.dices
        }

        imageViewSecond.setImageResource(resource)
        Log.d("SECOND", "FINITO DISEGNO DADO")

        Toast.makeText(this, "Attendi 5 secondi...", Toast.LENGTH_SHORT).show()


        // Avvia l'activity in base al numero
        Handler(Looper.getMainLooper()).postDelayed({
        val nextActivity = if (random % 2 == 0) {
            Intent(this, ThirdActivity::class.java)
        } else {
            Intent(this, FourthActivity::class.java)
        }
        nextActivity.putExtra("RANDOM", random)
        startActivity(nextActivity)
    }, 5000)
  }
}

