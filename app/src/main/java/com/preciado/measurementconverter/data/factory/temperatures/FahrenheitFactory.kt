package com.preciado.measurementconverter.data.factory.temperatures

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.temperatures.units.Fahrenheit
import javax.inject.Inject

object FahrenheitFactory : IFactory<Fahrenheit> {
    override fun build(vararg params: Any?): Fahrenheit {
        return Fahrenheit()
    }
}