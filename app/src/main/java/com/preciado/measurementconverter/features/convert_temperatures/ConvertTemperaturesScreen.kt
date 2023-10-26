package com.preciado.measurementconverter.features.convert_temperatures

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnits
import com.preciado.measurementconverter.features.convert_temperatures.domain.use_case.ValidationEvent
import com.preciado.measurementconverter.ui.components.bars.TopBar
import com.preciado.measurementconverter.ui.components.fields.TemperatureUnitDropDown
import com.preciado.measurementconverter.ui.components.fields.theme.TextField
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

@Composable
fun ConvertTemperaturesScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    state: ConvertTemperatureFormState,
    validationEvents: Flow<ValidationEvent>,
    onEvent: (ConvertTemperatureFormEvent) -> Unit,
){

    val context = LocalContext.current
    LaunchedEffect(key1 = context){
        validationEvents.collect{event ->
            when(event){
                is ValidationEvent.Success -> {
                    Toast.makeText(
                        context,
                        "Successfully converted ${state.unit1.name} to ${state.unit2.name}",
                        Toast.LENGTH_LONG
                    ).show()
                }

                is ValidationEvent.UnSuccessful -> {
                    Toast.makeText(
                        context,
                        "There are errors in the form",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }
    }

    Column (modifier = modifier.fillMaxSize()){
        TopBar()
        Text(text = "Temperature")
        Text(text = "From")


        TemperatureUnitDropDown(
            selectedItem = state.unit1,
            onValueChange = {
                onEvent(ConvertTemperatureFormEvent.OnUnit1Changed(it))
            }
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Value")

            TextField(
                value = state.temperature,
                onValueChange = {
                    onEvent(ConvertTemperatureFormEvent.OnTemperatureChanged(it))
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                )
            )
        }



        Text(text = "To")

        TemperatureUnitDropDown(
            selectedItem = state.unit2,
            onValueChange = {
                onEvent(ConvertTemperatureFormEvent.OnUnit2Changed(it))
            }
        )





        Button(
            onClick = {
                onEvent(ConvertTemperatureFormEvent.Submit)
            }
        ) {
            Text(text = "Convert")
        }

        Text(text = "Result")
        Text(text = state.result)
        Text(text = "1 Celsius = 33.8")
    }
}

@Preview
@Composable
fun PreviewConvertTemperatures(){
    ConvertTemperaturesScreen(
        navController = rememberNavController(),
        Modifier,
        ConvertTemperatureFormState(),
        emptyFlow()
    ){
        when(it){
            is ConvertTemperatureFormEvent.OnResultChanged -> TODO()
            is ConvertTemperatureFormEvent.OnTemperatureChanged -> TODO()
            is ConvertTemperatureFormEvent.OnUnit1Changed -> TODO()
            is ConvertTemperatureFormEvent.OnUnit2Changed -> TODO()
            ConvertTemperatureFormEvent.Submit -> TODO()
        }
    }
}