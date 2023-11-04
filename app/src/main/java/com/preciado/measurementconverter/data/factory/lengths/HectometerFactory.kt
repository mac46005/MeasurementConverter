package com.preciado.measurementconverter.data.factory.lengths

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.lengths.units.Hectometer

object HectometerFactory: IFactory<Hectometer>{
    override fun build(vararg params: Any?): Hectometer {
        return Hectometer()

    }
}