package com.preciado.measurementconverter.features.convert_temperatures.domain.use_case

sealed class ValidationEvent {
    object Success: ValidationEvent()
    data class UnSuccessful(val errorMessage: String? = null, val unsuccessfulResults: List<ValidationResult>? = null): ValidationEvent()
}