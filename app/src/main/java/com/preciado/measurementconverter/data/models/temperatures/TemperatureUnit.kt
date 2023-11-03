package com.preciado.measurementconverter.data.models.temperatures

import com.preciado.measurementconverter.data.models.measurement_types.ITemperature

abstract class TemperatureUnit(override var name: String): ITemperature, IToTemperature {
    override var value: Double = 0.0
}