package com.preciado.measurementconverter.data.models.lengths

class Decimeter: LengthUnit("Decimeter"){
    override fun toMillimeter(): Millimeter {
        val millimeter = Millimeter()
        millimeter.value = value * 100
        return millimeter
    }

    override fun toCentimeter(): Centimeter {
        val centimeter = Centimeter()
        centimeter.value = value * 10
        return centimeter
    }

    override fun toDecimeter(): Decimeter {
        return this
    }

    override fun toMeter(): Meter {
        val meter = Meter()
        meter.value = value / 10
        return meter
    }

    override fun toDecameter(): Decameter {
        val decameter = Decameter()
        decameter.value = value / 100
        return decameter
    }

    override fun toHectometer(): Hectometer {
        val hectometer = Hectometer()
        hectometer.value = value / 1000
        return hectometer
    }

    override fun toKilometer(): Kilometer {
        val kilometer = Kilometer()
        kilometer.value = value / 10000
        return kilometer
    }

    override fun toInch(): Inch {
        val inch = Inch()
        inch.value = value * 3.937
        return inch
    }

    override fun toFoot(): Foot {
        val foot = Foot()
        foot.value = value * 3.048
        return foot
    }

    override fun toMile(): Mile {
        val mile = Mile()
        mile.value = value / 16090
        return mile
    }

    override fun toYard(): Yard {
        val yard = Yard()
        yard.value = value / 9.144
        return yard
    }

    override fun toNauticalMile(): NauticalMile {
        val nauticalMile = NauticalMile()
        nauticalMile.value = value / 18520
        return nauticalMile
    }

}