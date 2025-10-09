package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class BActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.d("Lifecycle", "BActivity: onCreate")

        val btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            Log.d("Navigation", "B -> C")
            val intent = Intent(this, CActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

    }
}
