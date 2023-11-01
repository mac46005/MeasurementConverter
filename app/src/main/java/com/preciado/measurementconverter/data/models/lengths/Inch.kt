package com.preciado.measurementconverter.data.models.lengths

class Inch: LengthUnit("Inch") {
    override fun toMillimeter(): Millimeter {
        val millimeter = Millimeter()
        millimeter.value = value * 25.4
        return millimeter
    }

    override fun toCentimeter(): Centimeter {
        val centimeter = Centimeter()
        centimeter.value = value * 2.54
        return centimeter
    }

    override fun toDecimeter(): Decimeter {
        val decimeter = Decimeter()
        decimeter.value = value / 3.937
        return decimeter
    }

    override fun toMeter(): Meter {
        val meter = Meter()
        meter.value = value /  39.37
        return meter
    }

    override fun toDecameter(): Decameter {
        val decameter = Decameter()
        decameter.value = value / 393.7
        return decameter
    }

    override fun toHectometer(): Hectometer {
        val hectometer = Hectometer()
        hectometer.value = value / 3937
        return hectometer
    }

    override fun toKilometer(): Kilometer {
        val kilometer = Kilometer()
        kilometer.value = value / 39370
        return kilometer
    }

    override fun toInch(): Inch {
        return this
    }

    override fun toFoot(): Foot {
        val foot = Foot()
        foot.value = value / 12
        return foot
    }

    override fun toMile(): Mile {
        val mile = Mile()
        mile.value = value / 63360
        return mile
    }

    override fun toYard(): Yard {
        val yard = Yard()
        yard.value = value / 36
        return yard
    }

    override fun toNauticalMile(): NauticalMile {
        val nauticalMile = NauticalMile()
        nauticalMile.value = value / 72910
        return nauticalMile
    }

}