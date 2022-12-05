package com.example.nikeapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.nikeapp.R

val Pretendard = FontFamily(
    Font(R.font.pretendard_regular, FontWeight.Normal),
    Font(R.font.pretendard_thin, FontWeight.Thin),
    Font(R.font.pretendard_light, FontWeight.Light),
    Font(R.font.pretendard_medium, FontWeight.Medium),
    Font(R.font.pretendard_semibold, FontWeight.SemiBold),
    Font(R.font.pretendard_extrabold, FontWeight.ExtraBold),
    Font(R.font.pretendard_bold, FontWeight.Bold),
    Font(R.font.pretendard_extralight, FontWeight.ExtraLight),
    Font(R.font.pretendard_black, FontWeight.Black)
)

val Typography = Typography(
    defaultFontFamily = Pretendard,
    h1 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        color = Color.White
    ),

    button = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        color = Color.Black
    )
)