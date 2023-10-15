package com.preciado.measurementconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.preciado.measurementconverter.ui.navigation.Screen
import com.preciado.measurementconverter.ui.screens.ConvertTemperaturesScreen
import com.preciado.measurementconverter.ui.screens.Home
import com.preciado.measurementconverter.ui.theme.MeasurementConverterTheme
import com.preciado.measurementconverter.viewmodel.ConvertTemperaturesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeasurementConverterTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = Screen.Home.toString()){
                    composable(Screen.Home.fullRoute()){
                        Home(navController = navController)
                    }

                    composable(Screen.ConvertTemperatures.fullRoute()){
                        val convertTemperaturesViewModel: ConvertTemperaturesViewModel = hiltViewModel()
                        ConvertTemperaturesScreen(
                            navController = navController,
                            onTempUnit1Selected = convertTemperaturesViewModel::setTempUnit1,
                            onTempUnit2Selected = convertTemperaturesViewModel::setTempUnit2,
                            setTemperature = convertTemperaturesViewModel::setTemperature,
                            convertTemperatureUnit = convertTemperaturesViewModel::convertTemperatureUnit
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MeasurementConverterTheme {
        Greeting("Android")
    }
}