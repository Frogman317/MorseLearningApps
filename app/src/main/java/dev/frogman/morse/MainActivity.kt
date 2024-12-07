package dev.frogman.morse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.frogman.morse.ui.screen.HomeScreen
import dev.frogman.morse.ui.theme.MorseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MorseTheme {
                HomeScreen()
            }
        }
    }
}