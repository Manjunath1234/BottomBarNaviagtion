package com.example.bottombar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.example.bottombar.screens.HomeScreen
import com.example.bottombar.screens.ProfileScreen
import com.example.bottombar.screens.SettingsScreen

@Composable
fun BottomNavGraph(navHostController: NavHostController){

     NavHost(navController = navHostController, startDestination = BottomNavScreen.Home.route ){
         composable(
             route= BottomNavScreen.Home.route
         ){
             HomeScreen()
         }
         composable(
             route= BottomNavScreen.Profile.route
         ){
             ProfileScreen()
         }
         composable(
             route= BottomNavScreen.Setting.route
         ){
             SettingsScreen()
         }
     }
}