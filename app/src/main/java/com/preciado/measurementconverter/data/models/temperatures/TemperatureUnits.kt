package com.preciado.measurementconverter.data.models.temperatures

import com.preciado.measurementconverter.data.factory.CelsiusFactory
import com.preciado.measurementconverter.data.factory.FahrenheitFactory
import com.preciado.measurementconverter.data.factory.KelvinFactory
import com.preciado.measurementconverter.data.models.MeasurementUnits
import com.preciado.measurementconverter.data.models.temperatures.units.TemperatureUnit

enum class TemperatureUnits(measurementType: TemperatureUnit) {
    FAHRENHEIT(FahrenheitFactory().build()),
    CELSIUS(CelsiusFactory().build()),
    KELVIN(KelvinFactory().build())
}