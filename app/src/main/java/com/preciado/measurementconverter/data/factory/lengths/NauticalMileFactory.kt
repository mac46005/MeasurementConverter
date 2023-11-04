package com.preciado.measurementconverter.data.factory.lengths

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.lengths.units.NauticalMile

object NauticalMileFactory: IFactory<NauticalMile> {
    override fun build(vararg params: Any?): NauticalMile {
        return NauticalMile()
    }
}