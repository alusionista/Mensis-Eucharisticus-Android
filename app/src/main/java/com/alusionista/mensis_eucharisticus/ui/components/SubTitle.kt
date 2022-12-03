package com.alusionista.mensis_eucharisticus.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SubTitle(string: String) {
    Text(
        text = string,
        modifier = Modifier
            .padding(horizontal = 18.dp, vertical = 9.dp),
        fontSize = 22.sp,
        fontStyle = FontStyle.Italic,
    )

}