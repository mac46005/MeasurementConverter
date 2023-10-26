package com.preciado.measurementconverter.features.convert_temperatures

import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnits

sealed class ConvertTemperatureFormEvent{
    data class onUnit1Changed(val tempUnit1: TemperatureUnits): ConvertTemperatureFormEvent()
}
