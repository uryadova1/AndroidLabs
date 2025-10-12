package com.example.lab1v2

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun AppNavHost(navController: NavHostController, onExitApp: () -> Unit) {
    NavHost(navController = navController, startDestination = "screenA") {

        composable("screenA") {
            Log.d("NavHost", "Screen A opened")
            ScreenA(onNext = {
                Log.d("NavHost", "Navigating A -> B")
                navController.navigate("screenB")
            }, onExit = {
                Log.d("NavHost", "Exiting app from Screen A")
                onExitApp()
            })
        }

        composable("screenB") {
            Log.d("NavHost", "Screen B opened")
            ScreenB(onNext = {
                Log.d("NavHost", "Navigating B -> C")
                navController.navigate("screenC")
            }, onBack = {
                Log.d("NavHost", "Navigating B -> A")
                navController.popBackStack()
            })
        }

        composable("screenC") {
            Log.d("NavHost", "Screen C opened")
            ScreenC(onNext = {
                Log.d("NavHost", "Navigating C -> A")
                navController.navigate("screenA") {
                    popUpTo("screenA") { inclusive = true }
                }
            }, onBack = {
                Log.d("NavHost", "Navigating C -> B")
                navController.popBackStack()
            })
        }
    }
}
