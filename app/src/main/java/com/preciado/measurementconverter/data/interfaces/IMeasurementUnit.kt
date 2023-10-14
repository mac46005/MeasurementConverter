package com.preciado.measurementconverter.data.interfaces

interface IMeasurementUnit{
    var name: String
    var value: Double
    fun convertTo(measurementType: IMeasurementUnit): IMeasurementUnit
}