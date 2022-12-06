package com.example.nikeapp.screens

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nikeapp.R
import com.example.nikeapp.screens.NavGraph.Screen
import com.example.nikeapp.ui.theme.Typography
import com.example.nikeapp.ui.theme.backgroundSplash


@Composable
fun Splash(
    navController: NavController
) {
    Surface(
        color = backgroundSplash, modifier = Modifier.fillMaxSize()
    ) {
        Column(
            Modifier
                .padding(top = 100.dp)
        ) {
            Text(
                text = "You have the",
                color = Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(start = 20.dp)
            )
            Text(
                text = "power to",
                color = Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(start = 20.dp)
            )
            Text(
                text = "JUST DO IT.",
                color = Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.padding(start = 20.dp, top = 10.dp)
            )
            Button(
                onClick = {
                    navController.navigate(route = Screen.Home.route)
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White
                ),
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .padding(
                        start = 20.dp,
                        top = 70.dp
                    )
            ) {
                Column {
                    Text(
                        text = "Get Started",
                        style = Typography.button,
                        modifier = Modifier.padding(horizontal = 15.dp, vertical = 5.dp)
                    )
                }
            }
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ImageShoesNikeSplash()
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true,
    uiMode = UI_MODE_NIGHT_NO
)
@Composable
fun SplashPreview() {
    Splash(navController = rememberNavController())
}

@Composable
fun ImageShoesNikeSplash() {
    MaterialTheme() {
        Image(
            painterResource(R.drawable.shoes_nike_splash),
            contentDescription = "Foto de um Tenis Azul da Nike",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun ImageShoesNikeSplashPreview() {
    ImageShoesNikeSplash()
}