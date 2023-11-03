package com.preciado.measurementconverter.data.models.temperatures

interface IToTemperature {
    fun toFahrenheit(): Fahrenheit
    fun toCelsius(): Celsius
    fun toKelvin(): Kelvin
}