package com.alusionista.mensis_eucharisticus.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.alusionista.mensis_eucharisticus.R

val fonts = FontFamily(
    Font (R.font.gentium_book_basic_regular),
    Font (R.font.gentium_book_basic_bold, weight = FontWeight.Bold) ,
    Font (R.font.gentium_book_basic_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font (R.font.gentium_book_basic_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic)
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)