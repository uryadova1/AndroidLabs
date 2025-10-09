package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class AActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a) // подключаем XML layout

        Log.d("Lifecycle", "AActivity: onCreate")

        val btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            Log.d("Navigation", "A -> B")
            val intent = Intent(this, BActivity::class.java)
            startActivity(intent)
        }
    }
}
