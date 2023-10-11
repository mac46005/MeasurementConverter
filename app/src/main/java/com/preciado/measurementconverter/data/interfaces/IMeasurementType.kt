package com.preciado.measurementconverter.data.interfaces

interface IMeasurementType{
    var value: Double

    fun convertTo(measurementType: IMeasurementType): IMeasurementType
}