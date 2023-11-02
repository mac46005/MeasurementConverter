package com.preciado.measurementconverter.data.models.lengths

class Mile: LengthUnit("Mile") {
    override fun toMillimeter(): Millimeter {
        val millimeter = Millimeter()
        millimeter.value = value * 1.609e+6
        return millimeter
    }

    override fun toCentimeter(): Centimeter {
        val centimeter = Centimeter()
        centimeter.value = value * 160900
        return centimeter
    }

    override fun toDecimeter(): Decimeter {
        val decimeter = Decimeter()
        decimeter.value = value * 16090
        return decimeter
    }

    override fun toMeter(): Meter {
        val meter = Meter()
        meter.value = value * 1609
        return meter
    }

    override fun toDecameter(): Decameter {
        val decameter = Decameter()
        decameter.value = value * 160.9
        return decameter
    }

    override fun toHectometer(): Hectometer {
        val hectometer = Hectometer()
        hectometer.value = value * 16.093
        return hectometer
    }

    override fun toKilometer(): Kilometer {
        val kilometer = Kilometer()
        kilometer.value = value * 1.609
        return kilometer
    }

    override fun toInch(): Inch {
        val inch = Inch()
        inch.value = value * 72910
        return inch
    }

    override fun toFoot(): Foot {
        val foot = Foot()
        foot.value = value *  6076
        return foot
    }

    override fun toMile(): Mile {
        return this
    }

    override fun toYard(): Yard {
        val yard = Yard()
        yard.value = value *  1760
        return yard
    }

    override fun toNauticalMile(): NauticalMile {
        val nauticalMile = NauticalMile()
        nauticalMile.value = value / 1.151
        return nauticalMile
    }
}