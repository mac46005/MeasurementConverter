package com.preciado.measurementconverter.data.factory.lengths

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.lengths.units.Foot

object FootFactory: IFactory<Foot> {
    override fun build(vararg params: Any?): Foot {
        return Foot()
    }
}