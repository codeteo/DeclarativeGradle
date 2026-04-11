package com.declarative.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay
import com.declarative.common_ui.theme.MyDeclarativeGradleTheme
import com.declarative.list.MainList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val backStack = remember { mutableStateListOf<Any>(MainKey) }

            MyDeclarativeGradleTheme {
                NavDisplay(
                    backStack = backStack,
                    onBack = { backStack.removeLastOrNull() },
                    // TODO: replace inner block with entryProvider
                    entryProvider = { key ->
                        when (key) {
                            MainKey -> NavEntry(key) {
                                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                                    MainList(
                                        name = "Android",
                                        modifier = Modifier.padding(innerPadding)
                                    )
                                }
                            }
                            DetailKey -> NavEntry(key) { TODO() }
                            else -> throw IllegalStateException("Unknown route: $key")
                        }
                    }
                )
            }
        }
    }
}

private data object MainKey
private data object DetailKey
