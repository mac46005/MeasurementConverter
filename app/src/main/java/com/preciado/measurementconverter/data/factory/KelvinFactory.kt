package com.preciado.measurementconverter.data.factory

import com.preciado.measurementconverter.data.models.temperatures.units.Kelvin
import javax.inject.Inject

class KelvinFactory @Inject constructor() : IFactory<Kelvin> {
    override fun build(vararg params: Any?): Kelvin {
        return Kelvin()
    }

}