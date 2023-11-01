package com.preciado.measurementconverter.data.models.lengths

class Foot: LengthUnit("Foot"), IToLengthUnit {
    override fun toMillimeter(): Millimeter {
        val millimeter = Millimeter()
        millimeter.value = value * 304.8
        return millimeter
    }

    override fun toCentimeter(): Centimeter {
        val centimeter = Centimeter()
        centimeter.value = value * 30.48
        return centimeter
    }

    override fun toDecimeter(): Decimeter {
        val decimeter = Decimeter()
        decimeter.value = value * 3.048
        return decimeter
    }

    override fun toMeter(): Meter {
        val meter = Meter()
        meter.value = value / 3.281
        return meter
    }

    override fun toDecameter(): Decameter {
        val decameter = Decameter()
        decameter.value = value / 32.808
        return decameter
    }

    override fun toHectometer(): Hectometer {
        val hectometer = Hectometer()
        hectometer.value = value / 328.1
        return hectometer
    }

    override fun toKilometer(): Kilometer {
        val kilometer = Kilometer()
        kilometer.value = value / 3281
        return kilometer
    }

    override fun toInch(): Inch {
        val inch = Inch()
        inch.value = value * 12
        return inch
    }

    override fun toFoot(): Foot {
        return this
    }

    override fun toMile(): Mile {
        val mile = Mile()
        mile.value = value / 5280
        return mile
    }

    override fun toYard(): Yard {
        val yard = Yard()
        yard.value = value / 3
        return yard
    }

    override fun toNauticalMile(): NauticalMile {
        val nauticalMile = NauticalMile()
        nauticalMile.value = value / 6076
        return nauticalMile
    }

}