package com.preciado.measurementconverter.data.interfaces

interface IMeasurementUnits<T: IMeasurementType> {
    fun buildUnit(): T
}