package com.example.lab1v2

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ScreenA(onNext: () -> Unit, onExit: () -> Unit) {
    BackHandler {
        onExit() // закрывает приложение
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFCDD2)),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Экран A", color = Color.Black)
            Spacer(Modifier.height(20.dp))
            Button(onClick = onNext) {
                Text("Перейти к экрану B")
            }
        }
    }
}

@Composable
fun ScreenB(onNext: () -> Unit, onBack: () -> Unit) {
    BackHandler {
        onBack()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE8FDFC)),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Экран B", color = Color.Black)
            Spacer(Modifier.height(20.dp))
            Button(onClick = onNext) {
                Text("Перейти к экрану C")
            }
        }
    }
}

@Composable
fun ScreenC(onNext: () -> Unit, onBack: () -> Unit) {
    BackHandler {
        onBack()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFC0F8BE)),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Экран C", color = Color.Black)
            Spacer(Modifier.height(20.dp))
            Button(onClick = onNext) {
                Text("Перейти к экрану A")
            }
        }
    }
}
