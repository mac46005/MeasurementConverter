package com.preciado.measurementconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.preciado.measurementconverter.ui.navigation.Screen
import com.preciado.measurementconverter.features.convert_temperatures.ConvertTemperaturesScreen
import com.preciado.measurementconverter.features.home.domain.Home
import com.preciado.measurementconverter.ui.theme.MeasurementConverterTheme
import com.preciado.measurementconverter.features.convert_temperatures.ConvertTemperaturesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeasurementConverterTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = Screen.Home.fullRoute()){
                    composable(Screen.Home.fullRoute()){
                        Home(navController = navController)
                    }

                    composable(Screen.ConvertTemperatures.fullRoute()){
                        val convertTemperaturesViewModel: ConvertTemperaturesViewModel = hiltViewModel()
                        ConvertTemperaturesScreen(
                            navController = navController,
                            state = convertTemperaturesViewModel.state,
                            validationEvents = convertTemperaturesViewModel.validationEvents,
                            onEvent = convertTemperaturesViewModel::onEvent
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