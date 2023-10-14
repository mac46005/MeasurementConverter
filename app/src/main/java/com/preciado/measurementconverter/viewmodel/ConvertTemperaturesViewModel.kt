package com.preciado.measurementconverter.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.preciado.measurementconverter.data.models.Celsius
import com.preciado.measurementconverter.data.models.Fahrenheit
import com.preciado.measurementconverter.data.models.TemperatureConverter
import com.preciado.measurementconverter.data.models.TemperatureUnit
import com.preciado.measurementconverter.data.repo.Temperatures
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ConvertTemperaturesViewModel @Inject constructor(
    private val temperatureConverter: TemperatureConverter,
    private val temperatures: Temperatures,
) {
    val _tempUnit1: MutableLiveData<TemperatureUnit> = MutableLiveData(Fahrenheit())
    val tempUnit1: LiveData<TemperatureUnit> = _tempUnit1

    val _tempUnit2: MutableLiveData<TemperatureUnit> = MutableLiveData(Celsius())
    val tempUnit2: LiveData<TemperatureUnit> = _tempUnit2

    fun submit(){
        temperatureConverter.convert(_tempUnit1.value!!, _tempUnit2.value!!)
    }
}