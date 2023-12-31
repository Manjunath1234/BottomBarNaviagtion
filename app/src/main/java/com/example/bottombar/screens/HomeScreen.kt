package com.example.bottombar.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun HomeScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue),
    contentAlignment = Alignment.Center){
        Text(text = "Home Screen",
            color= Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = MaterialTheme.typography.headlineMedium.fontSize)
    }
}


@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}