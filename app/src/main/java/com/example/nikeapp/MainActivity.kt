package com.example.nikeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nikeapp.screens.NavGraph.SetupNavGraph
import com.example.nikeapp.screens.Splash
import com.example.nikeapp.ui.theme.NikeAppTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NikeAppTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController as NavHostController)
            }
        }
    }
}