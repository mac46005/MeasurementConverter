package com.preciado.measurementconverter.features.convert_temperatures

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.preciado.measurementconverter.data.factory.temperatures.TemperatureUnitFactory
import com.preciado.measurementconverter.data.models.temperatures.TemperatureConverter
import com.preciado.measurementconverter.features.convert_temperatures.domain.use_case.ValidateTemperature
import com.preciado.measurementconverter.features.convert_temperatures.domain.use_case.ValidationEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ConvertTemperaturesViewModel @Inject constructor(
    private val temperatureConverter: TemperatureConverter,
    private val temperatureUnitFactory: TemperatureUnitFactory,
    private val validateTemperature: ValidateTemperature
) : ViewModel(){

    var state by mutableStateOf(ConvertTemperatureFormState())
    private val validationEventChannel = Channel<ValidationEvent>()
    val validationEvents = validationEventChannel.receiveAsFlow()

    fun onEvent(event: ConvertTemperatureFormEvent){
        when(event){
            is ConvertTemperatureFormEvent.OnResultChanged -> {
                state = state.copy(result = event.result)
            }
            is ConvertTemperatureFormEvent.OnTemperatureChanged -> {
                state = state.copy(temperature = event.temperature)
            }
            is ConvertTemperatureFormEvent.OnUnit1Changed -> {
                state = state.copy(unit1 = event.tempUnit1)
            }
            is ConvertTemperatureFormEvent.OnUnit2Changed -> {
                state = state.copy(unit2 = event.tempUnit2)
            }
            ConvertTemperatureFormEvent.Submit -> {
                submit()
            }
        }
    }
    fun submit(){
        val temperatureResult = validateTemperature.execute(state.temperature)


        val hasError = listOf(
            temperatureResult
        ).any{
            !it.successful
        }

        if(hasError){
            state = state.copy(
                temperatureError = temperatureResult.errorMessage
            )

            return
        }

        viewModelScope.launch {
            validationEventChannel.send(ValidationEvent.Success)
        }

        val unit1 = temperatureUnitFactory.build(state.unit1)
        unit1.value = state.temperature.toDouble()
        val unit2 = temperatureConverter.convert(unit1, state.unit2)
        state = state.copy(result = unit2.value.toString())

    }
}