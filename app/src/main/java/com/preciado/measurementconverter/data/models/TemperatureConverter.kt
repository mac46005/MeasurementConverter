package com.preciado.measurementconverter.data.models

import com.preciado.measurementconverter.data.interfaces.IMeasurementConverter
import com.preciado.measurementconverter.data.interfaces.IMeasurementUnit
import javax.inject.Inject

class TemperatureConverter @Inject constructor(): IMeasurementConverter<TemperatureUnit> {

    override fun convert(from: TemperatureUnit, to: TemperatureUnit) {
        when(from){
            is Fahrenheit -> {
                convertFromFahrenheit(from, to)
            }
            is Celsius -> {
                convertFromCelsius(from, to)
            }
            is Kelvin -> {
                convertFromKelvin(from, to)
            }
        }
    }

    private fun convertFromFahrenheit(fahrenheit: Fahrenheit, to: TemperatureUnit){
        when(to){
            is Celsius -> {
                val celsius = fahrenheit.toCelsius()
                to.value = celsius.value
            }
            is Kelvin -> {
                val kelvin = fahrenheit.toKelvin()
                to.value = kelvin.value
            }
            is Fahrenheit -> {
                to.value = fahrenheit.value
            }
        }
    }

    private fun convertFromCelsius(celsius: Celsius, to: TemperatureUnit){
        when(to){
            is Fahrenheit -> {
                val fahrenheit = celsius.toFahrenheit()
                to.value = fahrenheit.value
            }
            is Kelvin -> {
                val kelvin = celsius.toKelvin()
                to.value = kelvin.value
            }
            is Celsius -> {
                to.value = celsius.value
            }
        }
    }

    private fun convertFromKelvin(kelvin: Kelvin, to: TemperatureUnit){
        when(to){
            is Fahrenheit -> {
                val fahrenheit = kelvin.toFahrenheit()
                to.value = fahrenheit.value
            }
            is Celsius -> {
                val celsius = kelvin.toCelsius()
                to.value = celsius.value
            }
            is Kelvin -> {
                to.value = kelvin.value
            }
        }
    }
}