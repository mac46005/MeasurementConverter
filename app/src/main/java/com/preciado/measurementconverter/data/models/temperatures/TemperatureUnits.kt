package com.preciado.measurementconverter.data.models.temperatures

import com.preciado.measurementconverter.data.factory.temperatures.CelsiusFactory
import com.preciado.measurementconverter.data.factory.temperatures.FahrenheitFactory
import com.preciado.measurementconverter.data.factory.temperatures.KelvinFactory
import com.preciado.measurementconverter.data.interfaces.IMeasurementUnits
import com.preciado.measurementconverter.data.models.temperatures.units.TemperatureUnit

enum class TemperatureUnits(
    ): IMeasurementUnits<TemperatureUnit> {
    FAHRENHEIT(){
        override fun buildUnit(): TemperatureUnit {
            return FahrenheitFactory.build()
        }
//BDBHFQ
    },
    CELSIUS() {
        override fun buildUnit(): TemperatureUnit {
            return CelsiusFactory.build()
        }
    },
    KELVIN() {
        override fun buildUnit(): TemperatureUnit {
            return KelvinFactory.build()
        }
    }
}