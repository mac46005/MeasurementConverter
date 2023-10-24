package com.preciado.measurementconverter.data.models.temperatures

import com.preciado.measurementconverter.data.interfaces.IMeasurementConverter
import com.preciado.measurementconverter.data.models.temperatures.Celsius
import com.preciado.measurementconverter.data.models.temperatures.Fahrenheit
import com.preciado.measurementconverter.data.models.temperatures.Kelvin
import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnit
import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnits
import javax.inject.Inject

class TemperatureConverter @Inject constructor(): IMeasurementConverter<TemperatureUnit> {

    override fun convert(from: TemperatureUnit, to: Any) : TemperatureUnit {
        val unitType = to as TemperatureUnits
        var unit: TemperatureUnit? = null
        when(from){
            is Fahrenheit -> {
                unit = convertFromFahrenheit(from, unitType)
            }
            is Celsius -> {
                unit = convertFromCelsius(from, unitType)
            }
            is Kelvin -> {
                unit =  convertFromKelvin(from, unitType)
            }
        }
        return unit!!
    }

    private fun convertFromFahrenheit(fahrenheit: Fahrenheit, to: TemperatureUnits): TemperatureUnit {
        when(to){
            TemperatureUnits.CELSIUS -> {
                return fahrenheit.toCelsius()
            }
            TemperatureUnits.KELVIN -> {
                return fahrenheit.toKelvin()
            }
            TemperatureUnits.FAHRENHEIT -> {
                return fahrenheit
            }
        }
    }

    private fun convertFromCelsius(celsius: Celsius, to: TemperatureUnits): TemperatureUnit {
        when(to){
            TemperatureUnits.FAHRENHEIT -> {
                return celsius.toFahrenheit()
            }
            TemperatureUnits.KELVIN -> {
                return celsius.toKelvin()
            }
            TemperatureUnits.CELSIUS -> {
                return celsius
            }
        }
    }

    private fun convertFromKelvin(kelvin: Kelvin, to: TemperatureUnits): TemperatureUnit {
        when(to){
            TemperatureUnits.FAHRENHEIT -> {
                return kelvin.toFahrenheit()
            }
            TemperatureUnits.CELSIUS -> {
                return kelvin.toCelsius()
            }
            TemperatureUnits.KELVIN -> {
                return kelvin
            }
        }
    }
}