package com.example.nikeapp.screens

import android.content.res.Configuration
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Home() {
    Text(text = "Home")
}

@Preview(
    showSystemUi = true,
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
fun HomePreview() {
    Home()
}