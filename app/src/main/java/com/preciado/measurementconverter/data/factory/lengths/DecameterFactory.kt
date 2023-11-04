package com.preciado.measurementconverter.data.factory.lengths

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.lengths.units.Decameter

object DecameterFactory: IFactory<Decameter> {
    override fun build(vararg params: Any?): Decameter {
        return Decameter()
    }
}