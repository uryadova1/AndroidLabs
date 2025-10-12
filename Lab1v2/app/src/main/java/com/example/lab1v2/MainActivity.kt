package com.example.lab1v2

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity

import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController

//import com.example.lab1v2.ui.theme.NavigationDemoTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Lifecycle", "MainActivity created")

        setContent {
            val navController = rememberNavController()
            AppNavHost(navController = navController, onExitApp = { finish() })

        }
    }
}
