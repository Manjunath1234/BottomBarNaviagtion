package com.example.bottombar


import android.annotation.SuppressLint
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")

@Composable
fun MainScreen(){
    val navHostController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navHostController = navHostController)}
    ) {
        BottomNavGraph(navHostController)
    }
}

@Composable
fun BottomBar(navHostController: NavHostController){
    val screens = listOf(
        BottomNavScreen.Home,
        BottomNavScreen.Profile,
        BottomNavScreen.Setting,
    )
    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

   NavigationBar() {
       screens.forEach {screens->

           AddItem( screens,currentDestination,navHostController)


       }
   }
}

@Composable
fun RowScope.AddItem(screen: BottomNavScreen,currentDestination: NavDestination?,navHostController: NavHostController) {
    NavigationBarItem(
        label = { Text(text = screen.title) },
        icon = { Icon(imageVector = screen.icon,contentDescription = "Navigation icon") },
        selected = currentDestination?.hierarchy?.any {
            it.route==screen.route
        } ==true,
        onClick = {

            navHostController.navigate(screen.route){
                popUpTo(navHostController.graph.findStartDestination().id)
                launchSingleTop =true
            }
        }
    )
}

