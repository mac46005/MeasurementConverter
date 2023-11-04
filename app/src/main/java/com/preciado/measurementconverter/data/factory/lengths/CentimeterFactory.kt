package com.preciado.measurementconverter.data.factory.lengths

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.lengths.units.Centimeter

object CentimeterFactory: IFactory<Centimeter> {
    override fun build(vararg params: Any?): Centimeter {
        return Centimeter()
    }
}