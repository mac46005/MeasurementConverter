package com.preciado.measurementconverter.ui.components.fields.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.preciado.measurementconverter.data.interfaces.IMeasurementUnit
import com.preciado.measurementconverter.data.models.Celsius
import com.preciado.measurementconverter.data.models.Fahrenheit
import com.preciado.measurementconverter.data.models.Kelvin
import com.preciado.measurementconverter.data.models.TemperatureUnit
import com.preciado.measurementconverter.data.models.TemperatureUnits

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