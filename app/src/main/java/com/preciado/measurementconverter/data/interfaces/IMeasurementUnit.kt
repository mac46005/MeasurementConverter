package com.preciado.measurementconverter.data.interfaces

interface IMeasurementUnit{
    var value: Double

    fun convertTo(measurementType: IMeasurementUnit): IMeasurementUnit
}