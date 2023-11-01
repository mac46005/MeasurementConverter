package com.preciado.measurementconverter.data.models.lengths

class Hectometer: LengthUnit("Hectometer"){
    override fun toMillimeter(): Millimeter {
        val millimeter = Millimeter()
        millimeter.value = value * 100000
        return millimeter
    }

    override fun toCentimeter(): Centimeter {
        val centimeter = Centimeter()
        centimeter.value = value * 10000
        return centimeter
    }

    override fun toDecimeter(): Decimeter {
        val decimeter = Decimeter()
        decimeter.value = value * 1000
        return decimeter
    }

    override fun toMeter(): Meter {
        val meter = Meter()
        meter.value = value * 100
        return meter
    }

    override fun toDecameter(): Decameter {
        val decameter = Decameter()
        decameter.value = value * 10
        return decameter
    }

    override fun toHectometer(): Hectometer {
        return this
    }

    override fun toKilometer(): Kilometer {
        val kilometer = Kilometer()
        kilometer.value = value / 10
        return kilometer
    }

    override fun toInch(): Inch {
        val inch = Inch()
        inch.value = value *  3937
        return inch
    }

    override fun toFoot(): Foot {
        val foot = Foot()
        foot.value = value * 328.1
        return foot
    }

    override fun toMile(): Mile {
        val mile = Mile()
        mile.value = value / 16.093
        return mile
    }

    override fun toYard(): Yard {
        val yard = Yard()
        yard.value = value * 109.4
        return yard
    }

    override fun toNauticalMile(): NauticalMile {
        val nauticalMile = NauticalMile()
        nauticalMile.value = value / 18.52
        return nauticalMile
    }

}
