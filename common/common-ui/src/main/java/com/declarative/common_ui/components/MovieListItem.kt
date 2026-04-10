package com.declarative.common_ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.declarative.common_ui.theme.MyDeclarativeGradleTheme

@Composable
fun MovieList(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun MovieListPreview() {
    MyDeclarativeGradleTheme {
        MovieList("Android")
    }
}