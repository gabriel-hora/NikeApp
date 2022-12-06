package com.example.nikeapp.screens.NavGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nikeapp.screens.Home
import com.example.nikeapp.screens.Splash

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(
            route = Screen.Splash.route
        ) {
            Splash(navController)
        }
        composable(
            route = Screen.Home.route
        ) {
            Home()
        }
    }
}