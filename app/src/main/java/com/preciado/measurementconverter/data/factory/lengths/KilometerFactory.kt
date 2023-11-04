package com.preciado.measurementconverter.data.factory.lengths

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.lengths.units.Kilometer

object KilometerFactory: IFactory<Kilometer> {
    override fun build(vararg params: Any?): Kilometer {
        return Kilometer()
    }
}