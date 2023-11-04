package com.preciado.measurementconverter.data.factory.lengths

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.lengths.units.Meter

object MeterFactory: IFactory<Meter> {
    override fun build(vararg params: Any?): Meter {
        return Meter()
    }
}