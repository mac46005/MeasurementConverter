package com.preciado.measurementconverter.data.factory

import com.preciado.measurementconverter.data.models.Kelvin

class KelvinFactory: IFactory<Kelvin> {
    override fun build(vararg params: Any?): Kelvin {
        return Kelvin()
    }

}