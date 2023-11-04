package com.preciado.measurementconverter.data.factory.lengths

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.lengths.units.Millimeter

object MillimeterFactory: IFactory<Millimeter> {
    override fun build(vararg params: Any?): Millimeter {
        return Millimeter()
    }
}