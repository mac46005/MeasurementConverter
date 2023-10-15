package com.preciado.measurementconverter.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.preciado.measurementconverter.data.interfaces.IMeasurementUnit
import com.preciado.measurementconverter.data.models.Celsius
import com.preciado.measurementconverter.data.models.Fahrenheit
import com.preciado.measurementconverter.data.models.Kelvin
import com.preciado.measurementconverter.ui.components.bars.TopBar
import com.preciado.measurementconverter.ui.components.fields.theme.MeasurementFieldDropDown
import com.preciado.measurementconverter.ui.components.fields.theme.TextField

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConvertTemperaturesScreen(
    navController: NavController,
    modifier: Modifier = Modifier
){
    Column (modifier = Modifier.fillMaxSize()){
        TopBar()
        Text(text = "Temperature")
        Text(text = "From")





        val measurement1 = remember{
            mutableStateOf<IMeasurementUnit?>(Fahrenheit())
        }


        //TODO Make this a separate composable
        MeasurementFieldDropDown(
            dropDownList = listOf(
                Fahrenheit(),
                Celsius(),
                Kelvin()
            ),
            selectedMeasurementUnitState = measurement1
        )

        Row() {
            Text(text = "Value")
            TextField(
                value = "",
                onValueChange = {}
            )
        }



        Text(text = "To")




        val measurement2 = remember{
            mutableStateOf<IMeasurementUnit?>(Celsius())
        }


        MeasurementFieldDropDown(
            dropDownList = listOf(
                Fahrenheit(),
                Celsius(),
                Kelvin()
            ),
            selectedMeasurementUnitState = measurement2
        )



        Text(text = "Result")
        Text(text = "33.6")
        Text(text = "1 Celsius = 33.8")
    }
}

@Preview
@Composable
fun PreviewConvertTemperatures(){
    ConvertTemperaturesScreen(navController = rememberNavController())
}