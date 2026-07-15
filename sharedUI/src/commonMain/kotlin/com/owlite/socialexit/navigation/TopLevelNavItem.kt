package com.owlite.socialexit.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Chat
import androidx.compose.material.icons.automirrored.outlined.Chat
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material.icons.outlined.History
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Shield
import androidx.compose.ui.graphics.vector.ImageVector
import org.jetbrains.compose.resources.StringResource
import socialexit.sharedui.generated.resources.*

data class TopLevelNavItem(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: StringResource,
    val titleTextId: StringResource,
)

val HOME =
    TopLevelNavItem(
        selectedIcon = Icons.Filled.Shield,
        unselectedIcon = Icons.Outlined.Shield,
        iconTextId = Res.string.menu_shield,
        titleTextId = Res.string.menu_shield,
    )

val SCRIPTS =
    TopLevelNavItem(
        selectedIcon = Icons.AutoMirrored.Filled.Chat,
        unselectedIcon = Icons.AutoMirrored.Outlined.Chat,
        iconTextId = Res.string.menu_scripts,
        titleTextId = Res.string.menu_scripts,
    )

val HISTORY =
    TopLevelNavItem(
        selectedIcon = Icons.Filled.History,
        unselectedIcon = Icons.Outlined.History,
        iconTextId = Res.string.menu_history,
        titleTextId = Res.string.menu_history,
    )

val SETTINGS =
    TopLevelNavItem(
        selectedIcon = Icons.Filled.Settings,
        unselectedIcon = Icons.Outlined.Settings,
        iconTextId = Res.string.menu_settings,
        titleTextId = Res.string.menu_settings,
    )
