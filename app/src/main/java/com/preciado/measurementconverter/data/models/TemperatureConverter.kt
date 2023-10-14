package com.preciado.measurementconverter.data.models

import com.preciado.measurementconverter.data.interfaces.IMeasurementConverter
import com.preciado.measurementconverter.data.interfaces.IMeasurementUnit
import javax.inject.Inject

class TemperatureConverter @Inject constructor(): IMeasurementConverter {




    override fun convert(from: IMeasurementUnit, to: IMeasurementUnit){
        when(from){
            is TemperatureUnit.Fahrenheit -> {
                to = (from as TemperatureUnit.Fahrenheit).convertTo(Unit2)
            }
            is TemperatureUnit.Celsius -> {
                Unit2 = (Unit1 as TemperatureUnit.Celsius).convertTo(Unit2)
            }
            is TemperatureUnit.Kelvin -> {
                Unit2 = (Unit1 as TemperatureUnit.Kelvin).convertTo(Unit2)
            }
        }
    }




    private fun convertFahrenheitToCelsius(fahrenheit: TemperatureUnit.Fahrenheit): TemperatureUnit.Celsius {
        val celsius = TemperatureUnit.Celsius()
        celsius.value = (fahrenheit.value - 32.0) * 5/9
        return celsius
    }

    //(0°F − 32) × 5/9 + 273.15
    private fun convertFahrenheitToKelvin(fahrenheit: TemperatureUnit.Fahrenheit): TemperatureUnit.Kelvin {
        val kelvin = TemperatureUnit.Kelvin()
        kelvin.value = (fahrenheit.value - 32) + (5/9) + 273.15
        return kelvin
    }





    private fun convertCelsiusToFahrenheit(celsius: TemperatureUnit.Celsius): TemperatureUnit.Fahrenheit {
        val fahrenheit = TemperatureUnit.Fahrenheit()
        fahrenheit.value = (celsius.value * (9/5)) + 32
        return fahrenheit
    }

    //0°C + 273.15
    private fun convertCelsiusToKelvin(celsius: TemperatureUnit.Celsius): TemperatureUnit.Kelvin {
        val kelvin = TemperatureUnit.Kelvin()
        kelvin.value = celsius.value + 273.15
        return kelvin
    }

    private fun convertKelvinToFahrenheit(kelvin: TemperatureUnit.Kelvin): TemperatureUnit.Fahrenheit {
        val fahrenheit = TemperatureUnit.Fahrenheit()
        fahrenheit.value = (kelvin.value - 273.15) * (9/5) + 32
        return fahrenheit
    }

    //0K − 273.15
    private fun convertKelvinToCelsius(kelvin: TemperatureUnit.Kelvin): TemperatureUnit.Celsius {
        val celsius = TemperatureUnit.Celsius()
        celsius.value = kelvin.value - 273.15
        return celsius
    }




    private fun convertFromFahrenheit(value: Double,to: IMeasurementUnit): IMeasurementUnit{
        when(to){
            is TemperatureUnit.Celsius -> {
                
            }
        }
    }















    sealed class TemperatureUnit(override var name: String): IMeasurementUnit{
        override var value: Double = 0.0






        class Fahrenheit: TemperatureUnit("Fahrenheit"){
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
                val celsius = Celsius()
                celsius.value = (this.value - 32.0) * 5/9
                return celsius
            }

            //(0°F − 32) × 5/9 + 273.15
            private fun convertFahrenheitToKelvin(): Kelvin{
                val kelvin = Kelvin()
                kelvin.value = (this.value - 32) + (5/9) + 273.15
                return kelvin
            }
        }




        class Celsius: TemperatureUnit("Celsius"){
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
                return convertedUnit
            }
            //celsius to fahrenheit
            //(0°C × 9/5) + 32 = 32°F
            private fun convertCelsiusToFahrenheit(): Fahrenheit{
                val fahrenheit = Fahrenheit()
                fahrenheit.value = (value * (9/5)) + 32
                return fahrenheit
            }

            //0°C + 273.15
            private fun convertCelsiusToKelvin(): Kelvin{
                val kelvin = Kelvin()
                kelvin.value = value + 273.15
                return kelvin
            }

        }

        class Kelvin: TemperatureUnit("Kelvin"){
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
                return convertedUnit
            }

            //(0K − 273.15) × 9/5 + 32
            private fun convertKelvinToFahrenheit(): Fahrenheit{
                val fahrenheit = Fahrenheit()
                fahrenheit.value = (value - 273.15) * (9/5) + 32
                return fahrenheit
            }

            //0K − 273.15
            private fun convertKelvinToCelsius(): Celsius{
                val celsius = Celsius()
                celsius.value = value - 273.15
                return celsius
            }
        }



    }
}