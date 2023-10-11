package com.preciado.measurementconverter.data.models

import com.preciado.measurementconverter.data.interfaces.IMeasurementConverter
import com.preciado.measurementconverter.data.interfaces.IMeasurementType

class Temperatures: IMeasurementConverter {
    override var Unit1: IMeasurementType = TemperatureUnit.Fahrenheit()


    override var Unit2: IMeasurementType = TemperatureUnit.Celsius()




    override fun convert(): Double {
        when(Unit1){
            is TemperatureUnit.Fahrenheit -> {
                Unit2 = (Unit1 as TemperatureUnit.Fahrenheit).convertTo(Unit2)
            }
            is TemperatureUnit.Celsius -> {
                Unit2 = (Unit1 as TemperatureUnit.Celsius).convertTo(Unit2)
            }
            is TemperatureUnit.Kelvin -> {
                Unit2 = (Unit1 as TemperatureUnit.Kelvin).convertTo(Unit2)
            }
        }
        return
    }



//fahrenheit to celsius
    //(°F − 32) × 5/9 = 0°C

    //celsius to fahrenheit
    //(0°C × 9/5) + 32 = 32°F



    sealed class TemperatureUnit: IMeasurementType{
        override var value: Double = 0.0

        class Fahrenheit: IMeasurementType{
            override var value: Double = 0.0
            override fun convertTo(measurementType: IMeasurementType): IMeasurementType {
                TODO("Not yet implemented")
            }

            private fun convertFahrenheitToCelsius(): Celsius {
                return Celsius()
            }

            private fun convertFahrenheitToKelvin(): Kelvin{
                return Kelvin()
            }
        }




        class Celsius: IMeasurementType{
            override var value: Double = 0.0
            override fun convertTo(measurementType: IMeasurementType): IMeasurementType {
                TODO("Not yet implemented")
            }

            private fun convertCelsiusToFahrenheit(): Fahrenheit{
                return Fahrenheit()
            }

            private fun convertCelsiusToKelvin(): Kelvin{
                return Kelvin()
            }

        }

        class Kelvin: IMeasurementType{
            override var value: Double = 0.0
            override fun convertTo(measurementType: IMeasurementType): IMeasurementType {
                TODO("Not yet implemented")
            }

            private fun convertKelvinToFahrenheit(): Fahrenheit{
                return Fahrenheit()
            }

            private fun convertKelvinToCelsius(): Celsius{
                return Celsius()
            }
        }
    }
}