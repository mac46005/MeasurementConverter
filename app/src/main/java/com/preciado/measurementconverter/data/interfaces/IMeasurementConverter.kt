package com.preciado.measurementconverter.data.interfaces

interface IMeasurementConverter{
    var Unit1: IMeasurementType
    var Unit2: IMeasurementType

    fun convert(): Double
}