package com.preciado.measurementconverter.data.factory.temperatures

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.temperatures.units.Kelvin
import javax.inject.Inject

object KelvinFactory : IFactory<Kelvin> {
    override fun build(vararg params: Any?): Kelvin {
        return Kelvin()
    }

}