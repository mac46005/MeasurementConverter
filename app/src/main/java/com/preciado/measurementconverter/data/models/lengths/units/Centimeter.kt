package com.preciado.measurementconverter.data.models.lengths.units

import com.preciado.measurementconverter.data.models.lengths.LengthUnit

class Centimeter: LengthUnit("Centimeter"){
    override fun toMillimeter(): Millimeter {
        val millimeter = Millimeter()
        millimeter.value = value * 10
        return millimeter
    }

    override fun toCentimeter(): Centimeter {
        return this
    }

    override fun toDecimeter(): Decimeter {
        val decimeter = Decimeter()
        decimeter.value = value / 10
        return decimeter
    }

    override fun toMeter(): Meter {
        val meter = Meter()
        meter.value = value / 100
        return meter
    }

    override fun toDecameter(): Decameter {
        val decameter = Decameter()
        decameter.value = value / 1000
        return decameter
    }

    override fun toHectometer(): Hectometer {
        val hectometer = Hectometer()
        hectometer.value = value / 10000
        return hectometer
    }

    override fun toKilometer(): Kilometer {
        val kilometer = Kilometer()
        kilometer.value = value / 100000
        return kilometer
    }

    override fun toInch(): Inch {
        val inch = Inch()
        inch.value = value / 2.54
        return inch
    }

    override fun toFoot(): Foot {
        val foot = Foot()
        foot.value = value / 30.48
        return foot
    }

    override fun toMile(): Mile {
        val mile = Mile()
        mile.value = value / 160900
        return mile
    }

    override fun toYard(): Yard {
        val yard = Yard()
        yard.value = value / 91.44
        return yard
    }

    override fun toNauticalMile(): NauticalMile {
        val nauticalMile = NauticalMile()
        nauticalMile.value = value / 185200
        return nauticalMile
    }
}