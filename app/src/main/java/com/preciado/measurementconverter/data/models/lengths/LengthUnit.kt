package com.preciado.measurementconverter.data.models.lengths

import com.preciado.measurementconverter.data.interfaces.IMeasurementUnit

abstract class LengthUnit(
    override var name: String,
    ) : IMeasurementUnit, IToLengthUnit {
    override var value: Double = 0.0
}