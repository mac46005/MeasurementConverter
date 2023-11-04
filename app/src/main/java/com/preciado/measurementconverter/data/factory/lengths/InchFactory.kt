package com.preciado.measurementconverter.data.factory.lengths

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.lengths.units.Inch

object InchFactory: IFactory<Inch> {
    override fun build(vararg params: Any?): Inch {
        return Inch()
    }
}