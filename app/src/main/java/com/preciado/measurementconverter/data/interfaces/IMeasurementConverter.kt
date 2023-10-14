package com.preciado.measurementconverter.data.interfaces

interface IMeasurementConverter{
    fun convert(from: IMeasurementUnit, to: IMeasurementUnit)
}