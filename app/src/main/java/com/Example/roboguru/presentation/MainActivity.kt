package com.Example.roboguru.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.Example.roboguru.presentation.ui.chapter.ChapterScreen
import com.Example.roboguru.presentation.ui.chat.ChatScreen
import com.Example.roboguru.presentation.ui.detailscreen.DetailScreen
import com.Example.roboguru.presentation.ui.home.HomeScreen
import com.Example.roboguru.presentation.ui.number.NumberScreen
import com.Example.roboguru.presentation.ui.otpScreen.OtpScreen
import com.Example.roboguru.presentation.ui.startup1.StartupScreen1
import com.Example.roboguru.presentation.ui.startup2.StartupScreen2
import com.Example.roboguru.presentation.ui.startup3.StartupScreen3
import com.Example.roboguru.presentation.ui.startup4.StartupScreen4
import com.Example.roboguru.presentation.ui.subject.SubjectScreen
import com.Example.roboguru.ui.theme.ROBOGURUTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ROBOGURUTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   innerPadding
                    StartupScreen4()
                }
            }
        }
    }
}

