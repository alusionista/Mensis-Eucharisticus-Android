package com.alusionista.mensis_eucharisticus.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.alusionista.mensis_eucharisticus.MainViewModel
import com.alusionista.mensis_eucharisticus.R
import com.alusionista.mensis_eucharisticus.ui.components.MainUI

@Composable
fun MainView(viewModel: MainViewModel = viewModel()) {
    val day by viewModel.day.observeAsState(1)
    val getTextByDay by viewModel.getTextByDay
    val isDarkTheme by viewModel.isDarkTheme
    val leaf = if(isDarkTheme) painterResource(R.drawable.light_leaf) else painterResource(R.drawable.leaf)

    MainUI(day, getTextByDay, leaf)

}