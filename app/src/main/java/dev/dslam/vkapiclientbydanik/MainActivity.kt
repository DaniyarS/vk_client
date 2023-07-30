package dev.dslam.vkapiclientbydanik

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.dslam.vkapiclientbydanik.ui.theme.MainScreen
import dev.dslam.vkapiclientbydanik.ui.theme.VkApiClientByDanikTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VkApiClientByDanikTheme() {
                MainScreen()
            }
        }
    }
}