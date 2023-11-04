package com.preciado.measurementconverter.data.models.lengths

import com.preciado.measurementconverter.data.factory.lengths.CentimeterFactory
import com.preciado.measurementconverter.data.factory.lengths.DecameterFactory
import com.preciado.measurementconverter.data.factory.lengths.DecimeterFactory
import com.preciado.measurementconverter.data.factory.lengths.FootFactory
import com.preciado.measurementconverter.data.factory.lengths.HectometerFactory
import com.preciado.measurementconverter.data.factory.lengths.InchFactory
import com.preciado.measurementconverter.data.factory.lengths.KilometerFactory
import com.preciado.measurementconverter.data.factory.lengths.MeterFactory
import com.preciado.measurementconverter.data.factory.lengths.MileFactory
import com.preciado.measurementconverter.data.factory.lengths.MillimeterFactory
import com.preciado.measurementconverter.data.factory.lengths.NauticalMileFactory
import com.preciado.measurementconverter.data.factory.lengths.YardFactory
import com.preciado.measurementconverter.data.interfaces.IMeasurementType
import com.preciado.measurementconverter.data.interfaces.IMeasurementUnits

enum class LengthUnits : IMeasurementUnits<LengthUnit> {
    MILLIMETER{
        override fun buildUnit(): LengthUnit {
            return MillimeterFactory.build()
        }
    },
    CENTIMETER{
        override fun buildUnit(): LengthUnit {
            return CentimeterFactory.build()
        }

    },
    DECIMETER{
        override fun buildUnit(): LengthUnit {
            return DecimeterFactory.build()
        }

    },
    METER{
        override fun buildUnit(): LengthUnit {
            return MeterFactory.build()
        }

    },
    DECAMETER{
        override fun buildUnit(): LengthUnit {
            return DecameterFactory.build()
        }

    },
    HECTOMETER{
        override fun buildUnit(): LengthUnit {
            return HectometerFactory.build()
        }

    },
    KILOMETER{
        override fun buildUnit(): LengthUnit {
            return KilometerFactory.build()
        }

    },
    INCH{
        override fun buildUnit(): LengthUnit {
            return InchFactory.build()
        }

    },
    FOOT{
        override fun buildUnit(): LengthUnit {
            return FootFactory.build()
        }

    },
    MILE{
        override fun buildUnit(): LengthUnit {
            return MileFactory.build()
        }

    },
    YARD{
        override fun buildUnit(): LengthUnit {
            return YardFactory.build()
        }

    },
    NAUTICAL_MILE{
        override fun buildUnit(): LengthUnit {
            return NauticalMileFactory.build()
        }

    }

}