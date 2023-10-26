package com.preciado.measurementconverter.features.convert_temperatures

import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnits

data class ConvertTemperatureFormState(
    val unit1: TemperatureUnits = TemperatureUnits.FAHRENHEIT,
    val temperature: String = "",
    val temperatureError: String? = null,
    val unit2: TemperatureUnits = TemperatureUnits.CELSIUS,
    val result: String = "0.0"
)
