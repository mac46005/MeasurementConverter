package com.preciado.measurementconverter.data.models

import com.preciado.measurementconverter.data.interfaces.IMeasurementConverter
import com.preciado.measurementconverter.data.interfaces.IMeasurementUnit

class Temperatures: IMeasurementConverter {
    override var Unit1: IMeasurementUnit = TemperatureUnit.Fahrenheit()


    override var Unit2: IMeasurementUnit = TemperatureUnit.Celsius()




    override fun convert(){
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
    }






























    sealed class TemperatureUnit: IMeasurementUnit{
        override var value: Double = 0.0






        class Fahrenheit: TemperatureUnit(){
            override var value: Double = 0.0
            override fun convertTo(measurementType: IMeasurementUnit): IMeasurementUnit {
                var convertedUnit: IMeasurementUnit = this
                when(measurementType){
                    is Celsius -> {
                        convertedUnit = convertFahrenheitToCelsius()
                    }
                    is Kelvin -> {
                        convertedUnit = convertFahrenheitToKelvin()
                    }
                }
                return convertedUnit
            }
            //fahrenheit to celsius
            //(°F − 32) × 5/9 = 0°C
            private fun convertFahrenheitToCelsius(): Celsius {
                var celsius = Celsius()
                celsius.value = (this.value - 32.0) * 5/9
                return celsius
            }

            //(0°F − 32) × 5/9 + 273.15
            private fun convertFahrenheitToKelvin(): Kelvin{
                var kelvin = Kelvin()
                kelvin.value = (this.value - 32) + (5/9) + 273.15
                return kelvin
            }
        }




        class Celsius: TemperatureUnit(){
            override var value: Double = 0.0
            override fun convertTo(measurementType: IMeasurementUnit): IMeasurementUnit {
                var convertedUnit: IMeasurementUnit = this
                when(measurementType){
                    is Fahrenheit -> {
                        convertedUnit = convertCelsiusToFahrenheit()
                    }
                    is Kelvin -> {
                        convertedUnit = convertCelsiusToKelvin()
                    }
                }
                return this
            }
            //celsius to fahrenheit
            //(0°C × 9/5) + 32 = 32°F
            private fun convertCelsiusToFahrenheit(): Fahrenheit{
                var fahrenheit = Fahrenheit()
                fahrenheit.value = (value * (9/5)) + 32
                return fahrenheit
            }

            //0°C + 273.15
            private fun convertCelsiusToKelvin(): Kelvin{
                var kelvin = Kelvin()
                kelvin.value = value + 273.15
                return kelvin
            }

        }

        class Kelvin: TemperatureUnit(){
            override var value: Double = 0.0
            override fun convertTo(measurementType: IMeasurementUnit): IMeasurementUnit {
                var convertedUnit: IMeasurementUnit = this
                when(measurementType){
                    is Fahrenheit -> {
                        convertedUnit = convertKelvinToFahrenheit()
                    }
                    is Celsius -> {
                        convertedUnit = convertKelvinToCelsius()
                    }
                }
            }

            //(0K − 273.15) × 9/5 + 32
            private fun convertKelvinToFahrenheit(): Fahrenheit{
                var fahrenheit = Fahrenheit()
                fahrenheit.value = (value - 273.15) * (9/5) + 32
                return fahrenheit
            }

            //0K − 273.15
            private fun convertKelvinToCelsius(): Celsius{
                var celsius = Celsius()
                celsius.value = value - 273.15
                return celsius
            }
        }



    }
}