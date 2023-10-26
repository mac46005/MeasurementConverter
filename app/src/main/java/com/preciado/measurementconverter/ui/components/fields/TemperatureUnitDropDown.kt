package com.preciado.measurementconverter.ui.components.fields

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.preciado.measurementconverter.R
import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnits

@Composable
fun TemperatureUnitDropDown(
    selectedItem: TemperatureUnits,
    onValueChange: (TemperatureUnits) -> Unit
) {
    Row() {
        val selectedItemState = remember{
            mutableStateOf(selectedItem)
        }
        Text(text = selectedItemState.value.name)
        val isExpanded = remember{ mutableStateOf(false)}
        Button(
            onClick = {
                isExpanded.value = true
            }
        ) {
            Icon(painter = painterResource(id = R.drawable.baseline_arrow_drop_down_24), contentDescription = "")
        }  
        DropdownMenu(expanded = isExpanded.value, onDismissRequest = {
            isExpanded.value = false
        }) {
            for(item in TemperatureUnits.values()){
                Box(modifier = Modifier.clickable {
                    selectedItemState.value = item
                    onValueChange(item)
                    isExpanded.value = false
                }){
                    Text(text = item.name)
                }
            }
        }
    }
    
    
}