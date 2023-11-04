package com.preciado.measurementconverter.data.models.lengths.units

import com.preciado.measurementconverter.data.models.lengths.LengthUnit

class Yard: LengthUnit("Yard") {
    override fun toMillimeter(): Millimeter {
        val millimeter = Millimeter()
        millimeter.value = value * .001094
        return millimeter
    }

    override fun toCentimeter(): Centimeter {
        val centimeter = Centimeter()
        centimeter.value = value * .01094
        return centimeter
    }

    override fun toDecimeter(): Decimeter {
        val decimeter = Decimeter()
        decimeter.value = value / .1094
        return decimeter
    }

    override fun toMeter(): Meter {
        val meter = Meter()
        meter.value = value / 1.094
        return meter
    }

    override fun toDecameter(): Decameter {
        val decameter = Decameter()
        decameter.value = value / 10.94
        return decameter
    }

    override fun toHectometer(): Hectometer {
        val hectometer = Hectometer()
        hectometer.value = value / 109.4
        return hectometer
    }

    override fun toKilometer(): Kilometer {
        val kilometer = Kilometer()
        kilometer.value = value / 1094
        return kilometer
    }

    override fun toInch(): Inch {
        val inch = Inch()
        inch.value = value * 36
        return inch
    }

    override fun toFoot(): Foot {
        val foot = Foot()
        foot.value = value * 3
        return foot
    }

    override fun toMile(): Mile {
        val mile = Mile()
        mile.value = value / 1760
        return mile
    }

    override fun toYard(): Yard {
        return this
    }

    override fun toNauticalMile(): NauticalMile {
        val nauticalMile = NauticalMile()
        nauticalMile.value = value / 2025
        return nauticalMile
    }
}