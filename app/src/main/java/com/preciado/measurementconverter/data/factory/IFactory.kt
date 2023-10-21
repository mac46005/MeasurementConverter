package com.preciado.measurementconverter.data.factory

interface IFactory<T> {
    fun build(vararg params: Any?):T
}