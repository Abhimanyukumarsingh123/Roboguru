package com.Example.roboguru.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.Example.roboguru.presentation.ui.home.HomeScreen
import com.Example.roboguru.presentation.ui.number.NumberScreen
import com.Example.roboguru.ui.theme.ROBOGURUTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ROBOGURUTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   innerPadding
                    NumberScreen()
                }
            }
        }
    }
}

