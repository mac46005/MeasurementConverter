package com.preciado.measurementconverter.data.repo

import com.preciado.measurementconverter.data.models.temperatures.Celsius
import com.preciado.measurementconverter.data.models.temperatures.Fahrenheit
import com.preciado.measurementconverter.data.models.temperatures.Kelvin
import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnit

class Temperatures{
    fun getTemperatures(): List<TemperatureUnit>{
        return listOf(
            Fahrenheit(),
            Celsius(),
            Kelvin()
        )
    }
}