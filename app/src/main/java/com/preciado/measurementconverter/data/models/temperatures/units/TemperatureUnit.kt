package com.preciado.measurementconverter.data.models.temperatures.units

import com.preciado.measurementconverter.data.models.measurement_types.ITemperature
import com.preciado.measurementconverter.data.models.temperatures.IToTemperatureUnit

abstract class TemperatureUnit(override var name: String): ITemperature, IToTemperatureUnit {
    override var value: Double = 0.0
}