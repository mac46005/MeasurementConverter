package com.preciado.measurementconverter.data.repo

import com.preciado.measurementconverter.data.models.Celsius
import com.preciado.measurementconverter.data.models.Fahrenheit
import com.preciado.measurementconverter.data.models.Kelvin
import com.preciado.measurementconverter.data.models.TemperatureUnit
import javax.inject.Inject

class Temperatures{
    fun getTemperatures(): List<TemperatureUnit>{
        return listOf(
            Fahrenheit(),
            Celsius(),
            Kelvin()
        )
    }
}