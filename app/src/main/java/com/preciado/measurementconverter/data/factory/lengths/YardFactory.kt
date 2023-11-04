package com.preciado.measurementconverter.data.factory.lengths

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.lengths.units.Yard

object YardFactory: IFactory<Yard> {
    override fun build(vararg params: Any?): Yard {
        return Yard()
    }
}