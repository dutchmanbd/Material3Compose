package com.ticonsys.core.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ticonsys.core.R


private val Urbanist = FontFamily(
    fonts = listOf(
        Font(R.font.urbanist_light, FontWeight.W300),
        Font(R.font.urbanist_regular, FontWeight.W400),
        Font(R.font.urbanist_medium, FontWeight.W500),
        Font(R.font.urbanist_bold, FontWeight.W600),
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W500,
        fontSize = 32.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W500,
        fontSize = 28.sp,
    ),
    displaySmall = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W500,
        fontSize = 24.sp,
    ),
    headlineLarge = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W400,
        fontSize = 22.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W400,
        fontSize = 20.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W400,
        fontSize = 18.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp
    ),
    bodySmall = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W300,
        fontSize = 12.sp
    ),
    titleLarge = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp
    ),
    titleMedium = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W400,
        fontSize = 15.sp
    ),
    titleSmall = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W300,
        fontSize = 14.sp
    ),
    labelLarge = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W500,
        fontSize = 16.sp
    ),
    labelMedium = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.W300,
        fontSize = 12.sp
    )

)