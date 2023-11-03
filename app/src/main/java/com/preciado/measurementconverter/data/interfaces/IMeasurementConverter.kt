package com.preciado.measurementconverter.data.interfaces

interface IMeasurementConverter<T: IMeasurementType>{
    fun convert(from: T, to: Any): T
}