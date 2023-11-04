package com.preciado.measurementconverter.data.models.lengths.units

import com.preciado.measurementconverter.data.models.lengths.LengthUnit

class Meter: LengthUnit("Meter") {
    override fun toMillimeter(): Millimeter {
        val millimeter = Millimeter()
        millimeter.value = value * 1000
        return millimeter
    }

    override fun toCentimeter(): Centimeter {
        val centimeter = Centimeter()
        centimeter.value = value * 100
        return centimeter
    }

    override fun toDecimeter(): Decimeter {
        val decimeter = Decimeter()
        decimeter.value = value * 10
        return decimeter
    }

    override fun toMeter(): Meter {
        return this
    }

    override fun toDecameter(): Decameter {
        val decameter = Decameter()
        decameter.value = value / 10
        return decameter
    }

    override fun toHectometer(): Hectometer {
        val hectometer = Hectometer()
        hectometer.value = value / 100
        return hectometer
    }

    override fun toKilometer(): Kilometer {
        val kilometer = Kilometer()
        kilometer.value = value / 1000
        return kilometer
    }

    override fun toInch(): Inch {
        val inch = Inch()
        inch.value = value * 39.37
        return inch
    }

    override fun toFoot(): Foot {
        val foot = Foot()
        foot.value = value * 3.281
        return foot
    }

    override fun toMile(): Mile {
        val mile = Mile()
        mile.value = value / 1609
        return mile
    }

    override fun toYard(): Yard {
        val yard = Yard()
        yard.value = value * 1.094
        return yard
    }

    override fun toNauticalMile(): NauticalMile {
        val nauticalMile = NauticalMile()
        nauticalMile.value = value / 1852
        return nauticalMile
    }
}