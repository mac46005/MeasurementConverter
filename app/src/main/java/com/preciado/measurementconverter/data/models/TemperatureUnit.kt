package com.preciado.measurementconverter.data.models

import com.preciado.measurementconverter.data.interfaces.IMeasurementUnit

abstract class TemperatureUnit(override var name: String): IMeasurementUnit {
    override var value: Double = 0.0


}