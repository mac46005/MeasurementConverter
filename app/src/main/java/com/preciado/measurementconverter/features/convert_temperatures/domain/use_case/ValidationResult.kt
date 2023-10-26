package com.preciado.measurementconverter.features.convert_temperatures.domain.use_case

data class ValidationResult(
    val successful: Boolean = false,
    val errorMessage: String? = null
)
