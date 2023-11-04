package com.preciado.measurementconverter.data.factory.temperatures

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.temperatures.units.Celsius
import javax.inject.Inject

object CelsiusFactory : IFactory<Celsius> {
    override fun build(vararg params: Any?): Celsius {
        return Celsius()
    }

}