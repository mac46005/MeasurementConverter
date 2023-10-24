package com.preciado.measurementconverter.data.interfaces

interface IMeasurementConverter<T: IMeasurementUnit>{
    fun convert(from: T, to: Any): T
}