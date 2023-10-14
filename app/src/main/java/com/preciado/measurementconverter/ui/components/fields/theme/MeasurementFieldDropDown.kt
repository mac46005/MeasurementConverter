package com.preciado.measurementconverter.ui.components.fields.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.preciado.measurementconverter.data.interfaces.IMeasurementUnit
import com.preciado.measurementconverter.data.models.Temperatures
import com.preciado.measurementconverter.ui.components.fields.FieldDropDown

@Composable
fun MeasurementFieldDropDown(
    modifier: Modifier = Modifier,
    dropDownList: List<IMeasurementUnit>,

) {
    FieldDropDown<IMeasurementUnit>(
        dropDownList = dropDownList,
        buttonContent = {

        },
        dropDownItemBoxContent = {

        },
        placeHolder = {

        }
    ) {

    }
}

@Preview
@Composable
fun PreviewMeasurementFieldDropDown(){
    MeasurementFieldDropDown(
        dropDownList = listOf(
            Temperatures.TemperatureUnit.Celsius(),
            Temperatures.TemperatureUnit.Fahrenheit(),
            Temperatures.TemperatureUnit.Kelvin()
        )
    )
}