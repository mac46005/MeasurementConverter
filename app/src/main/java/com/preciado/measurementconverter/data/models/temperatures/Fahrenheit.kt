package com.preciado.measurementconverter.data.models.temperatures

class Fahrenheit: TemperatureUnit("Fahrenheit"){
    override var value: Double = 0.0
    override fun toFahrenheit(): Fahrenheit {
        return this
    }

    //fahrenheit to celsius
    //(°F − 32) × 5/9 = 0°C
    override fun toCelsius(): Celsius {
        val celsius = Celsius()
        celsius.value = (this.value - 32.0) * 5/9
        return celsius
    }

    //(0°F − 32) × 5/9 + 273.15
    override fun toKelvin(): Kelvin {
        val kelvin = Kelvin()
        kelvin.value = (this.value - 32) + (5/9) + 273.15
        return kelvin
    }
}