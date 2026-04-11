package com.declarative.list

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(name: String, modifier: Modifier = Modifier) {
    MainList(name, modifier)
}