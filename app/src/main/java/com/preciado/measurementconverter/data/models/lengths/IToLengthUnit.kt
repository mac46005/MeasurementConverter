package com.preciado.measurementconverter.data.models.lengths

import com.preciado.measurementconverter.data.models.lengths.units.Centimeter
import com.preciado.measurementconverter.data.models.lengths.units.Decameter
import com.preciado.measurementconverter.data.models.lengths.units.Decimeter
import com.preciado.measurementconverter.data.models.lengths.units.Foot
import com.preciado.measurementconverter.data.models.lengths.units.Hectometer
import com.preciado.measurementconverter.data.models.lengths.units.Inch
import com.preciado.measurementconverter.data.models.lengths.units.Kilometer
import com.preciado.measurementconverter.data.models.lengths.units.Meter
import com.preciado.measurementconverter.data.models.lengths.units.Mile
import com.preciado.measurementconverter.data.models.lengths.units.Millimeter
import com.preciado.measurementconverter.data.models.lengths.units.NauticalMile
import com.preciado.measurementconverter.data.models.lengths.units.Yard

interface IToLengthUnit {
    fun toMillimeter(): Millimeter
    fun toCentimeter(): Centimeter
    fun toDecimeter(): Decimeter
    fun toMeter(): Meter
    fun toDecameter(): Decameter
    fun toHectometer(): Hectometer
    fun toKilometer(): Kilometer
    fun toInch(): Inch
    fun toFoot(): Foot
    fun toMile(): Mile
    fun toYard(): Yard
    fun toNauticalMile(): NauticalMile
}