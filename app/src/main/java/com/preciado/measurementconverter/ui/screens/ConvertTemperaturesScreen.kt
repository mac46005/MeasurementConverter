package com.preciado.measurementconverter.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.preciado.measurementconverter.data.models.TemperatureUnit
import com.preciado.measurementconverter.ui.components.bars.TopBar
import com.preciado.measurementconverter.ui.components.fields.theme.TemperatureFieldDropDown
import com.preciado.measurementconverter.ui.components.fields.theme.TextField

@Composable
fun ConvertTemperaturesScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    onTempUnit1Selected: (TemperatureUnit) -> Unit,
    onTempUnit2Selected: (TemperatureUnit) -> Unit,
    setTemperature: (Double) -> Unit,
    convertTemperatureUnit: () -> Unit
){
    Column (modifier = modifier.fillMaxSize()){
        TopBar()
        Text(text = "Temperature")
        Text(text = "From")




        TemperatureFieldDropDown(
            onItemSelected = onTempUnit1Selected
        )


        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Value")

            val textState = remember{
                mutableStateOf("")
            }
            TextField(
                value = textState.value,
                onValueChange = {
                    textState.value = it
                    setTemperature(it.toDouble())
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                )
            )
        }



        Text(text = "To")






        TemperatureFieldDropDown(
            onItemSelected = onTempUnit2Selected
        )

        Button(onClick = convertTemperatureUnit) {
            Text(text = "Convert")
        }



        Text(text = "Result")
        Text(text = "33.6")
        Text(text = "1 Celsius = 33.8")
    }
}

@Preview
@Composable
fun PreviewConvertTemperatures(){
    ConvertTemperaturesScreen(
        navController = rememberNavController(),
        onTempUnit1Selected = {},
        onTempUnit2Selected = {},
        setTemperature = {},
        convertTemperatureUnit = {}
    )
}