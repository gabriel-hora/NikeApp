package com.example.nikeapp

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.tooling.preview.Preview
import com.example.nikeapp.screens.Splash
import com.example.nikeapp.ui.theme.NikeAppTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NikeAppTheme {
                Surface {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Splash()
}

@Preview(showSystemUi = true)
@Composable
fun AppPreview() {
    App()
}