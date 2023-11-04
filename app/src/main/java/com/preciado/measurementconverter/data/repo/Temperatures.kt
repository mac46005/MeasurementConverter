package com.preciado.measurementconverter.data.repo

import com.preciado.measurementconverter.data.models.temperatures.units.Celsius
import com.preciado.measurementconverter.data.models.temperatures.units.Fahrenheit
import com.preciado.measurementconverter.data.models.temperatures.units.Kelvin
import com.preciado.measurementconverter.data.models.temperatures.units.TemperatureUnit

class Temperatures{
    fun getTemperatures(): List<TemperatureUnit>{
        return listOf(
            Fahrenheit(),
            Celsius(),
            Kelvin()
        )
    }
}