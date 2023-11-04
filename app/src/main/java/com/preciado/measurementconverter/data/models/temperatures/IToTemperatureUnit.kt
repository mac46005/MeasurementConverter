package com.preciado.measurementconverter.data.models.temperatures

import com.preciado.measurementconverter.data.models.temperatures.units.Celsius
import com.preciado.measurementconverter.data.models.temperatures.units.Fahrenheit
import com.preciado.measurementconverter.data.models.temperatures.units.Kelvin

interface IToTemperatureUnit {
    fun toFahrenheit(): Fahrenheit
    fun toCelsius(): Celsius
    fun toKelvin(): Kelvin
}