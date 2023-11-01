package com.preciado.measurementconverter.data.models.lengths

class Inch: LengthUnit("Inch"), IToLengthUnit {
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

    }

    override fun toHectometer(): Hectometer {
        TODO("Not yet implemented")
    }

    override fun toKilometer(): Kilometer {
        TODO("Not yet implemented")
    }

    override fun toInch(): Inch {
        TODO("Not yet implemented")
    }

    override fun toFoot(): Foot {
        TODO("Not yet implemented")
    }

    override fun toMile(): Mile {
        TODO("Not yet implemented")
    }

    override fun toYard(): Yard {
        TODO("Not yet implemented")
    }

    override fun toNauticalMile(): NauticalMile {
        TODO("Not yet implemented")
    }

}