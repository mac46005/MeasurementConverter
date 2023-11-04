package com.preciado.measurementconverter.data.factory

import com.preciado.measurementconverter.data.models.temperatures.units.Celsius
import javax.inject.Inject

class CelsiusFactory @Inject constructor(): IFactory<Celsius> {
    override fun build(vararg params: Any?): Celsius {
        return Celsius()
    }

}