package com.preciado.measurementconverter.data.models.lengths

interface IToLengthUnit {
    fun toMillimeter(): Millimeter
    fun toCentimeter(): Centimeter
    fun toDecimeter(): Decimeter
    fun toMeter(): Meter
    fun toDekameter(): Dekameter
    fun toHectometer(): Hectometer
    fun toKilometer(): Kilometer
    fun toInch(): Inch
    fun toFoot(): Foot
    fun toMile(): Mile
    fun toYard(): Yard
    fun toNauticalMile(): NauticalMile
}