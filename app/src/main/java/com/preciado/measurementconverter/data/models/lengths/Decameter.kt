package com.preciado.measurementconverter.data.models.lengths

class Decameter: LengthUnit("Dekameter"){
    override fun toMillimeter(): Millimeter {
        val millimeter = Millimeter()
        millimeter.value = value * 10000
        return millimeter
    }

    override fun toCentimeter(): Centimeter {
        val centimeter = Centimeter()
        centimeter.value = value * 1000
        return centimeter
    }

    override fun toDecimeter(): Decimeter {
        val decimeter = Decimeter()
        decimeter.value = value * 100
        return decimeter
    }

    override fun toMeter(): Meter {
        val meter = Meter()
        meter.value = value * 10
        return meter
    }

    override fun toDecameter(): Decameter {
        return this
    }

    override fun toHectometer(): Hectometer {
        val hectometer = Hectometer()
        hectometer.value = value / 10
        return hectometer
    }

    override fun toKilometer(): Kilometer {
        val kilometer = Kilometer()
        kilometer.value = value / 100
        return kilometer
    }

    override fun toInch(): Inch {
        val inch = Inch()
        inch.value = value * 393.7
        return inch
    }

    override fun toFoot(): Foot {
        val foot = Foot()
        foot.value = value * 32.808
        return foot
    }

    override fun toMile(): Mile {
        val mile = Mile()
        mile.value = value / 160.9
        return mile
    }

    override fun toYard(): Yard {
        val yard = Yard()
        yard.value = value * 10.936
        return yard
    }

    override fun toNauticalMile(): NauticalMile {
        val nauticalMile = NauticalMile()
        nauticalMile.value = value / 185.2
        return nauticalMile
    }

}