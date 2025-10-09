package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class CActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        Log.d("Lifecycle", "CActivity: onCreate")

        val btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            Log.d("Navigation", "C -> A")
            val intent = Intent(this, AActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }
    }
}