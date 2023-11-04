package com.preciado.measurementconverter.data.models.lengths.units

import com.preciado.measurementconverter.data.models.lengths.IToLengthUnit
import com.preciado.measurementconverter.data.models.lengths.LengthUnit

class Millimeter: LengthUnit("Millimeter"), IToLengthUnit {
    override fun toMillimeter(): Millimeter {
        return this
    }

    override fun toCentimeter(): Centimeter {
        val centimeter: Centimeter = Centimeter()
        centimeter.value = value / 10
        return centimeter
    }
    override fun toDecimeter(): Decimeter {
        val decimeter = Decimeter()
        decimeter.value = value / 100
        return Decimeter()
    }

    override fun toMeter(): Meter {
        val meter = Meter()
        meter.value = value / 1000
        return meter
    }

    override fun toDecameter(): Decameter {
        val decameter = Decameter()
        decameter.value = value / 10000
        return decameter
    }

    override fun toHectometer(): Hectometer {
        val hectometer = Hectometer()
        hectometer.value = value / 100000
        return hectometer
    }

    override fun toKilometer(): Kilometer {
        val kilometer = Kilometer()
        kilometer.value = value / 1000000
        return kilometer
    }

    override fun toInch(): Inch {
        val inch = Inch()
        inch.value = value / 25.4
        return inch
    }

    override fun toFoot(): Foot {
        val foot = Foot()
        foot.value = value / 304.8
        return foot
    }

    override fun toMile(): Mile {
        val mile = Mile()
        mile.value = value / 1.609e+6
        return mile
    }

    override fun toYard(): Yard {
        val yard = Yard()
        yard.value = value / 914.4
        return yard
    }

    override fun toNauticalMile(): NauticalMile {
        val nauticalMile = NauticalMile()
        nauticalMile.value = value / 1.852e+6
        return nauticalMile
    }


}
