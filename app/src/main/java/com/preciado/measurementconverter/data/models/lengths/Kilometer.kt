package com.preciado.measurementconverter.data.models.lengths

class Kilometer: LengthUnit(name = "Kilometer"), IToLengthUnit {
    override fun toMillimeter(): Millimeter {
        val millimeter = Millimeter()
        millimeter.value = value * 1000000
        return millimeter
    }

    override fun toCentimeter(): Centimeter {
        val centimeter = Centimeter()
        centimeter.value = value * 100000
        return centimeter
    }

    override fun toDecimeter(): Decimeter {
        val decimeter = Decimeter()
        decimeter.value = value * 10000
        return decimeter
    }

    override fun toMeter(): Meter {
        val meter = Meter()
        meter.value = value * 1000
        return meter
    }

    override fun toDecameter(): Decameter {
        val decameter = Decameter()
        decameter.value = value * 100
        return decameter
    }

    override fun toHectometer(): Hectometer {
        val hectometer = Hectometer()
        hectometer.value = value * 10
        return hectometer
    }

    override fun toKilometer(): Kilometer {
        return this
    }

    override fun toInch(): Inch {
        val inch = Inch()
        inch.value = value * 39370
        return inch
    }

    override fun toFoot(): Foot {
        val foot = Foot()
        foot.value = value * 3281
        return foot
    }

    override fun toMile(): Mile {
        val mile = Mile()
        mile.value = value / 1.609
        return mile
    }

    override fun toYard(): Yard {
        val yard = Yard()
        yard.value = value * 1094
        return yard
    }

    override fun toNauticalMile(): NauticalMile {
        val nauticalMile = NauticalMile()
        nauticalMile.value = value / 1.852
        return nauticalMile
    }

}