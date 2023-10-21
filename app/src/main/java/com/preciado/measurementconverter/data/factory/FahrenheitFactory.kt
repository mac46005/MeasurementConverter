package com.preciado.measurementconverter.data.factory

import com.preciado.measurementconverter.data.interfaces.IMeasurementUnit
import com.preciado.measurementconverter.data.models.Fahrenheit

class FahrenheitFactory: IFactory<Fahrenheit> {
    override fun build(vararg params: Any?): Fahrenheit {
        return Fahrenheit()
    }
}