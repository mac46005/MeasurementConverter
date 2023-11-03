package com.preciado.measurementconverter.data.models.lengths

import com.preciado.measurementconverter.data.interfaces.IMeasurementType
import com.preciado.measurementconverter.data.models.measurement_types.ILength

abstract class LengthUnit(
    override var name: String,
    ) : ILength, IToLengthUnit {
    override var value: Double = 0.0
}