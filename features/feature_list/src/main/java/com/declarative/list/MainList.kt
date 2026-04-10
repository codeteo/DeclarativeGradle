package com.declarative.list

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.declarative.common_ui.components.MovieList

@Composable
fun MainList(name: String, modifier: Modifier = Modifier) {
    MovieList(name, modifier)
}
