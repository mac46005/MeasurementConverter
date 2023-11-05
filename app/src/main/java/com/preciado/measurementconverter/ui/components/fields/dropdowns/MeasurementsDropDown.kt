package com.preciado.measurementconverter.ui.components.fields.dropdowns

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.preciado.measurementconverter.data.interfaces.IMeasurementType
import com.preciado.measurementconverter.data.interfaces.IMeasurementUnits

@Composable
fun<T: IMeasurementType> MeasurementsDropDown(
    modifier: Modifier,
    lengthUnits: IMeasurementUnits<T>
){
    val isExpanded = remember {
        mutableStateOf(false)
    }
   Row() {
       Text(text = "")
       Button(
           onClick = {
               isExpanded.value = true
           }
       ) {

       }

       DropdownMenu(
           expanded = isExpanded.value,
           onDismissRequest = {
               isExpanded.value = false
           }
       ) {

       }
   }

}