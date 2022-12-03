package com.alusionista.mensis_eucharisticus.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.alusionista.mensis_eucharisticus.MainViewModel
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkColors(
    primary = Yellow,
    primaryVariant = Light,
    secondary = Light,
    background = Dark,
    surface = Dark,
    onPrimary = Light,
    onSecondary = Light,
    onBackground = Light,
    onSurface = Light,
)

private val LightColorPalette = lightColors(
    primary = Yellow,
    primaryVariant = Light,
    secondary = Light,
    background = Light,
    surface = Lighter,
    onPrimary = Dark,
    onSecondary = Dark,
    onBackground = Dark,
    onSurface = Dark,
)

@Composable
fun MensisEucharisticusTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    systemUiController: SystemUiController = rememberSystemUiController(),
    viewModel: MainViewModel = viewModel(),
    content: @Composable () -> Unit
) {

    viewModel.isDarkTheme.value = darkTheme

    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )

    systemUiController.setSystemBarsColor(
        color = colors.background
    )

}