package com.example.nikeapp.screens.NavGraph

sealed class Screen(val route: String){
    object Splash: Screen(route = "splash_screen")
    object Home: Screen(route = "home_screen")
}
