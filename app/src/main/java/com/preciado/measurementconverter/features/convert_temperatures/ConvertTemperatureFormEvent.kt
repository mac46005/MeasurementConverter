package com.preciado.measurementconverter.features.convert_temperatures

import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnits

sealed class ConvertTemperatureFormEvent{
    data class OnUnit1Changed(val tempUnit1: TemperatureUnits): ConvertTemperatureFormEvent()
    data class OnTemperatureChanged(val temperature: String): ConvertTemperatureFormEvent()
    data class OnUnit2Changed(val tempUnit2: TemperatureUnits): ConvertTemperatureFormEvent()
    data class OnResultChanged(val result: String): ConvertTemperatureFormEvent()
    object Submit: ConvertTemperatureFormEvent()
}
