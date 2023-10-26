package com.preciado.measurementconverter.features.convert_temperatures.domain.use_case

import java.lang.NumberFormatException

class ValidateTemperature {
    fun execute(temperature: String): ValidationResult{
        try{
            if(temperature.isBlank()){
                return ValidationResult(
                    false,
                    "Please, input a value to convert"
                )
            }
        }catch (ex: NumberFormatException){
            return ValidationResult(
                false,
                ex.message
            )
        }
        return ValidationResult(
            true
        )
    }
}