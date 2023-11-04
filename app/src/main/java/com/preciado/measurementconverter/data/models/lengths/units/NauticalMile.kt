package com.preciado.measurementconverter.data.models.lengths.units

import com.preciado.measurementconverter.data.models.lengths.LengthUnit

class NauticalMile: LengthUnit("Nautical Mile") {
    override fun toMillimeter(): Millimeter {
        val millimeter = Millimeter()
        millimeter.value = value * 1852000
        return millimeter
    }

    override fun toCentimeter(): Centimeter {
        val centimeter = Centimeter()
        centimeter.value = value * 185200
        return centimeter
    }

    override fun toDecimeter(): Decimeter {
        val decimeter = Decimeter()
        decimeter.value = value * 18520
        return decimeter
    }

    override fun toMeter(): Meter {
        val meter = Meter()
        meter.value = value * 1852
        return meter
    }

    override fun toDecameter(): Decameter {
        val decameter = Decameter()
        decameter.value = value * 185.2
        return decameter
    }

    override fun toHectometer(): Hectometer {
        val hectometer = Hectometer()
        hectometer.value = value * 18.52
        return hectometer
    }

    override fun toKilometer(): Kilometer {
        val kilometer = Kilometer()
        kilometer.value = value * 1.852
        return kilometer
    }


    override fun toInch(): Inch {
        val inch = Inch()
        inch.value = value * 72910
        return inch
    }

    override fun toFoot(): Foot {
        val foot = Foot()
        foot.value = value * 6076
        return foot
    }

    override fun toMile(): Mile {
        val mile = Mile()
        mile.value = value * 1.151
        return mile
    }

    override fun toYard(): Yard {
        val yard = Yard()
        yard.value = value * 2025
        return yard
    }

    override fun toNauticalMile(): NauticalMile {
        return this
    }
}