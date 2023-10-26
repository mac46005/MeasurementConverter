package com.preciado.measurementconverter.features.convert_temperatures

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnits
import com.preciado.measurementconverter.ui.components.bars.TopBar
import com.preciado.measurementconverter.ui.components.fields.TemperatureUnitDropDown
import com.preciado.measurementconverter.ui.components.fields.theme.TextField
import kotlinx.coroutines.channels.Channel

@Composable
fun ConvertTemperaturesScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    submit: (TemperatureUnits, TemperatureUnits, String) -> Unit,
    result: LiveData<Double>
){
    Column (modifier = modifier.fillMaxSize()){
        TopBar()
        Text(text = "Temperature")
        Text(text = "From")

        val unit1State = remember{
            mutableStateOf(TemperatureUnits.FAHRENHEIT)
        }
        TemperatureUnitDropDown(selectedItem = unit1State)

        val textState = remember{
            mutableStateOf("")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Value")
            val result = Channel<String>()

            //TODO Find out how i can catch NumberFormatException
            TextField(
                value = textState.value,
                onValueChange = {
                    textState.value = it
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                )
            )
        }



        Text(text = "To")

        val unit2State = remember{
            mutableStateOf(TemperatureUnits.CELSIUS)
        }
        TemperatureUnitDropDown(selectedItem = unit2State)





        Button(
            onClick = {
                submit(unit1State.value, unit2State.value, textState.value)
            }
        ) {
            Text(text = "Convert")
        }

        val resultState by result.observeAsState()
        Text(text = "Result")
        Text(text = resultState.toString())
        Text(text = "1 Celsius = 33.8")
    }
}

@Preview
@Composable
fun PreviewConvertTemperatures(){
    ConvertTemperaturesScreen(
        navController = rememberNavController(),
        submit = { temp1, temp2, temp ->

        },
        result = MutableLiveData()
    )
}