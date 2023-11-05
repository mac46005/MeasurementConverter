package com.preciado.measurementconverter.data.factory.lengths

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.lengths.LengthUnit
import com.preciado.measurementconverter.data.models.lengths.LengthUnits

object LengthUnitFactory: IFactory<LengthUnit> {
    override fun build(vararg params: Any?): LengthUnit {
        val lengthUnit = params[0] as LengthUnits
        return lengthUnit.buildUnit()
    }
}