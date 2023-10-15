package com.preciado.measurementconverter.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
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
) : ViewModel(){

    private val _tempUnit1: MutableLiveData<TemperatureUnit> = MutableLiveData(Fahrenheit())
    val tempUnit1: LiveData<TemperatureUnit> = _tempUnit1

    private val _tempUnit2: MutableLiveData<TemperatureUnit> = MutableLiveData(Celsius())
    val tempUnit2: LiveData<TemperatureUnit> = _tempUnit2

    private val _temperature: MutableLiveData<Double> = MutableLiveData(0.0)
    val temperature: LiveData<Double> = _temperature


    private val _result: MutableLiveData<Double> = MutableLiveData(0.0)
    val result: LiveData<Double> = _result
    fun setTemperature(value: Double){
        _temperature.value = value
    }
    fun setTempUnit1(unit: TemperatureUnit){
        _tempUnit1.value = unit
    }
    fun setTempUnit2(unit: TemperatureUnit){
        _tempUnit2.value = unit
    }

    fun setResult(value: Double){
        _result.value = value
    }

    fun convertTemperatureUnit(){
        temperatureConverter.convert(_tempUnit1.value!!, _tempUnit2.value!!)
    }

}