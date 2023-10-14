package com.preciado.measurementconverter.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.preciado.measurementconverter.data.interfaces.IMeasurementUnit
import com.preciado.measurementconverter.data.models.TemperatureConverter
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ConvertTemperaturesViewModel @Inject constructor(
    temperatureConverter: TemperatureConverter
) {
    val _unit1: MutableLiveData<IMeasurementUnit?> = MutableLiveData(temperatureConverter.Unit1)
    val unit1: LiveData<IMeasurementUnit?> = _unit1

    val _unit2: MutableLiveData<IMeasurementUnit?> = MutableLiveData(temperatureConverter.Unit2)
    val unit2: LiveData<IMeasurementUnit?> = _unit2





}