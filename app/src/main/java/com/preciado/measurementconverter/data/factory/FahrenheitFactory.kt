package com.preciado.measurementconverter.data.factory

import com.preciado.measurementconverter.data.models.temperatures.units.Fahrenheit
import javax.inject.Inject

class FahrenheitFactory @Inject constructor(): IFactory<Fahrenheit> {
    override fun build(vararg params: Any?): Fahrenheit {
        return Fahrenheit()
    }
}