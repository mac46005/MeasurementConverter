package com.preciado.measurementconverter.data.factory.lengths

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.lengths.units.Mile

object MileFactory: IFactory<Mile> {
    override fun build(vararg params: Any?): Mile {
        return Mile()
    }
}