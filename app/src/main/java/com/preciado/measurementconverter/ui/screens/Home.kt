package com.preciado.measurementconverter.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.preciado.measurementconverter.ui.components.bars.TopBar
import com.preciado.measurementconverter.ui.navigation.Screen

@Composable
fun Home(
    navController: NavController,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        TopBar()
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier) {
                Card(
                    modifier = Modifier.clickable {
                        navController.navigate(Screen.ConvertTemperatures.fullRoute())
                    }
                ) {
                    Text(text = "Temperature")
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewHome(){
    Home(
        navController = rememberNavController()

    )
}