package com.owlite.socialexit

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.owlite.socialexit.features.home.ui.HomeScreen

enum class BottomNavItem(
    val label: String,
    val icon: ImageVector? = null,
) {
    HOME("Home"),
}

@Composable
@Preview
fun App() {
    MaterialTheme {
        NavRoot()
    }
}

@Composable
fun NavRoot() {
    var selectedTab by rememberSaveable { mutableStateOf(BottomNavItem.HOME) }

    Scaffold(
        bottomBar = {
            NavigationBar {
                BottomNavItem.entries.forEach { item ->
                    NavigationBarItem(
                        selected = selectedTab == item,
                        onClick = {
                            selectedTab = item
                        },
                        icon = {
                            item.icon?.let { icon ->
                                Icon(icon, contentDescription = item.label)
                            }
                        },
                        label = { Text(item.label) },
                    )
                }
            }
        },
    ) { paddingValues ->
        when (selectedTab) {
            BottomNavItem.HOME -> HomeScreen()
        }
    }
}
