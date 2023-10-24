package com.preciado.measurementconverter.ui.components.fields.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.preciado.measurementconverter.data.models.temperatures.Celsius
import com.preciado.measurementconverter.data.models.temperatures.Fahrenheit
import com.preciado.measurementconverter.data.models.temperatures.Kelvin
import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnit

@Composable
fun TemperatureFieldDropDown(
    modifier: Modifier = Modifier,
    onItemSelected: (TemperatureUnit) -> Unit
){
    MeasurementFieldDropDown(
        modifier = modifier,
        dropDownList = listOf(
            Fahrenheit(),
            Celsius(),
            Kelvin()
        )
    ){
        onItemSelected(it as TemperatureUnit)
    }
}