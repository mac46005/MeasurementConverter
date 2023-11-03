package com.preciado.measurementconverter.data.models.temperatures

class Kelvin: TemperatureUnit("Kelvin"){
    override var value: Double = 0.0


    //(0K − 273.15) × 9/5 + 32
    override fun toFahrenheit(): Fahrenheit {
        val fahrenheit = Fahrenheit()
        fahrenheit.value = (value - 273.15) * (9/5) + 32
        return fahrenheit
    }

    //0K − 273.15
    override fun toCelsius(): Celsius {
        val celsius = Celsius()
        celsius.value = value - 273.15
        return celsius
    }

    override fun toKelvin(): Kelvin {
        return this
    }
}