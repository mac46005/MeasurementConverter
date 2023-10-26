package com.preciado.measurementconverter.features.convert_temperatures

import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnit

data class ConvertTemperatureFormState(
    val unit1: TemperatureUnit,
    val unit2: TemperatureUnit,
    val result: String
)
