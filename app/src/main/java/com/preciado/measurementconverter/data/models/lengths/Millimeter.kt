package com.preciado.measurementconverter.data.models.lengths

class Millimeter: LengthUnit("Millimeter"), IToLengthUnit {
    override fun toMillimeter(): Millimeter {
        TODO("Not yet implemented")
    }

    override fun toCentimeter(): Centimeter{
        val centimeter: Centimeter = Centimeter()
        centimeter.value = value / 10
        return centimeter
    }
    override fun toDecimeter(): Decimeter{
        val decimeter = Decimeter()
        decimeter.value = value / 100
        return Decimeter()
    }

    override fun toMeter():Meter{
        val meter = Meter()
        meter.value = value / 1000
        return meter
    }

    override fun toDekameter(): Dekameter {
        TODO("Not yet implemented")
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
