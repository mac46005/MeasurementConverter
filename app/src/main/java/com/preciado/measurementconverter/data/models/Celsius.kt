package com.preciado.measurementconverter.data.models

class Celsius: TemperatureUnit("Celsius"){
    override var value: Double = 0.0
    //celsius to fahrenheit
    //(0°C × 9/5) + 32 = 32°F
    fun toFahrenheit(): Fahrenheit {
        val fahrenheit = Fahrenheit()
        fahrenheit.value = (value * (9/5)) + 32
        return fahrenheit
    }

    //0°C + 273.15
    fun toKelvin(): Kelvin {
        val kelvin = Kelvin()
        kelvin.value = value + 273.15
        return kelvin
    }

}