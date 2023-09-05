package com.example.bottombar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.materialIcon
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavScreen(
    val route:String,
    val title:String,
    val icon:ImageVector
) {
    object Home:BottomNavScreen(route = "home_screen", title = "Home", icon=  Icons.Default.Home)
    object Profile:BottomNavScreen(route = "profile_screen", title = "Profile", icon=Icons.Default.Person)
    object Setting:BottomNavScreen(route = "settings_screen", title = "Settings", icon=Icons.Default.Settings)
}