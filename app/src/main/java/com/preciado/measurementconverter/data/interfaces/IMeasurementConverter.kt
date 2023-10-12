package com.preciado.measurementconverter.data.interfaces

interface IMeasurementConverter{
    var Unit1: IMeasurementUnit
    var Unit2: IMeasurementUnit

    fun convert()
}