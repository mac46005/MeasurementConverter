package com.preciado.measurementconverter.data.models

import com.preciado.measurementconverter.data.interfaces.IConvertUnit
import com.preciado.measurementconverter.data.interfaces.IMeasurementConverter
import com.preciado.measurementconverter.data.interfaces.IMeasurementType

sealed class Temperatures: IMeasurementConverter {

    //fahrenheit to celsius
    //(°F − 32) × 5/9 = 0°C

    //celsius to fahrenheit
    //(0°C × 9/5) + 32 = 32°F


    override fun convert(): Double {
        TODO("Not yet implemented")
    }







    sealed class TemperatureUnit: IMeasurementType{
        override var value: Double = 0.0

        class Fahrenheit: IMeasurementType{
            override var value: Double = 0.0
        }

        class Celsius: IMeasurementType{
            override var value: Double = 0.0
        }

        class Kelvin: IMeasurementType{
            override var value: Double = 0.0
        }
    }
}