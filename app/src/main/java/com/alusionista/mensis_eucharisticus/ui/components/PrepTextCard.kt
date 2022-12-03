package com.alusionista.mensis_eucharisticus.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp

@Composable
fun PrepTextCard(bold: String, string: String) {

    Card(
        shape = MaterialTheme.shapes.small
    ) {
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.ExtraBold)) {
                    append(bold)
                }
                append(string)
            },
            modifier = Modifier
                .padding(18.dp)
        )
    }
    Spacer(Modifier.height(18.dp))
}