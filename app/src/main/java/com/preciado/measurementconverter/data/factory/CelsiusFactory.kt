package com.preciado.measurementconverter.data.factory

import com.preciado.measurementconverter.data.interfaces.IMeasurementUnit
import com.preciado.measurementconverter.data.models.Celsius

class CelsiusFactory: IFactory<IMeasurementUnit> {
    override fun build(vararg params: Any?): IMeasurementUnit {
        return Celsius()
    }

}