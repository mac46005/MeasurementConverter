package com.preciado.measurementconverter.ui.components.fields

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnits

@Composable
fun <T: Enum<T>> EnumDropDown(
    enum: T
){
}

@Preview
@Composable
fun PreviewEnumDropDown(){
    EnumDropDown()
}