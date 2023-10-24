package com.preciado.measurementconverter.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.preciado.measurementconverter.data.factory.TemperatureUnitFactory
import com.preciado.measurementconverter.data.models.temperatures.TemperatureConverter
import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnits
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ConvertTemperaturesViewModel @Inject constructor(
    private val temperatureConverter: TemperatureConverter,
    private val temperatureUnitFactory: TemperatureUnitFactory
) : ViewModel(){



    val _result: MutableLiveData<Double> = MutableLiveData(0.0)
    val result: LiveData<Double> = _result

    fun submit(unit1Enum: TemperatureUnits, unit2Enum: TemperatureUnits, value: String){
        val unit1 = temperatureUnitFactory.build(unit1Enum)
        unit1.value = value.toDouble()
        val unit2 = temperatureConverter.convert(unit1, unit2Enum)
        _result.value = unit2.value
    }
}