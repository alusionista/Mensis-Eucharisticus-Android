package com.alusionista.mensis_eucharisticus.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainUI(day: Int, getTextByDay: List<String>, leaf: Painter) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = ScrollState(0)),
        //horizontalAlignment = Alignment.Start


    ) {
        Column (Modifier.padding(18.dp)) {
            Row(
                Modifier
                    .fillMaxWidth(),
                Arrangement.Center
            ) {
                Image(
                    modifier = Modifier
                        .width(100.dp)
                        .scale((-1).toFloat(), (1).toFloat())
                        .offset(y = 5.dp),
                    painter = leaf,
                    contentDescription = null
                )
                Text(
                    text = "Dia $day",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                )
                Image(
                    modifier = Modifier
                        .width(100.dp)
                        .offset(y = 5.dp),
                    painter = leaf,
                    contentDescription = null
                )
            }
            Spacer(Modifier.height(18.dp))

            SubTitle("Preparação")

            PrepTextCard("Quem vem? ", getTextByDay[0])
            PrepTextCard("A quem vem? ", getTextByDay[1])
            PrepTextCard("Por que vem? ", getTextByDay[2])

            SubTitle("Invocação")

            TextCard(getTextByDay[3])

            SubTitle("Ação de graças")

            TextCard(getTextByDay[4])
            TextCard(getTextByDay[5])
            TextCard(getTextByDay[6])

            SubTitle("Invocação")

            TextCard(getTextByDay[7])
        }
    }
}