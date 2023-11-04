package com.preciado.measurementconverter.data.factory.lengths

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.lengths.units.Decimeter

object DecimeterFactory: IFactory<Decimeter> {
    override fun build(vararg params: Any?): Decimeter {
        return Decimeter()
    }
}