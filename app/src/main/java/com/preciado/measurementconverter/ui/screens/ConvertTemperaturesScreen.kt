package com.preciado.measurementconverter.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.preciado.measurementconverter.R
import com.preciado.measurementconverter.data.models.TemperatureUnit
import com.preciado.measurementconverter.data.models.TemperatureUnits
import com.preciado.measurementconverter.ui.components.bars.TopBar
import com.preciado.measurementconverter.ui.components.fields.theme.TemperatureFieldDropDown
import com.preciado.measurementconverter.ui.components.fields.theme.TextField

@Composable
fun ConvertTemperaturesScreen(
    navController: NavController,
    modifier: Modifier = Modifier,

){
    Column (modifier = modifier.fillMaxSize()){
        TopBar()
        Text(text = "Temperature")
        Text(text = "From")







        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Value")

            val textState = remember{
                mutableStateOf("")
            }
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
        Row() {
            val selectedItem = remember{
                mutableStateOf(TemperatureUnits.CELSIUS)
            }
            Text(text = selectedItem.value.name)
            val isExpanded = remember{ mutableStateOf(false) }
            Button(
                onClick = { isExpanded.value = true }
            ) {
                Icon(painter = painterResource(id = R.drawable.baseline_arrow_drop_down_24), contentDescription = "Icon ")
            }

            DropdownMenu(expanded = isExpanded.value, onDismissRequest = { isExpanded.value = false }) {
                for(item in TemperatureUnits.values()){
                    Box(
                        modifier = Modifier.clickable {
                            selectedItem.value = item
                        }
                    ){
                        Text(text = item.name)
                    }
                }
            }
        }





        Button(
            onClick = {

            }
        ) {
            Text(text = "Convert")
        }


        Text(text = "Result")
        Text(text = "3.33")
        Text(text = "1 Celsius = 33.8")
    }
}

@Preview
@Composable
fun PreviewConvertTemperatures(){
    ConvertTemperaturesScreen(
        navController = rememberNavController(),
    )
}