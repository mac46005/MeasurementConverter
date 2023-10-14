package com.preciado.measurementconverter.ui.components.fields.theme

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.preciado.measurementconverter.R
import com.preciado.measurementconverter.data.interfaces.IMeasurementUnit
import com.preciado.measurementconverter.data.models.Temperatures
import com.preciado.measurementconverter.ui.components.fields.FieldDropDown

@Composable
fun MeasurementFieldDropDown(
    modifier: Modifier = Modifier,
    dropDownList: List<IMeasurementUnit>,
    selectedMeasurementUnitState: MutableState<IMeasurementUnit?>
) {
    FieldDropDown<IMeasurementUnit>(
        modifier = modifier,
        dropDownList = dropDownList,
        selectedItemState = selectedMeasurementUnitState,
        surfaceTextFieldShape = RoundedCornerShape(topStart = 5.dp, bottomStart = 5.dp),
        buttonModifier = Modifier.height(30.dp),
        buttonShape = RoundedCornerShape(topEnd = 5.dp, bottomEnd = 5.dp),
        buttonContent = {
                       Icon(painter = painterResource(id = R.drawable.baseline_arrow_drop_down_24), contentDescription = "Drop down icon")
        },
        dropDownItemBoxContent = {

        },
        placeHolder = {
            DropDownTextContent(
                modifier = Modifier.padding(5.dp),
                text = "Please select a measurement unit"
            )
        }
    ) {
        DropDownTextContent(
            modifier = Modifier.padding(5.dp),
            text = it.name
        )
    }
}

@Preview
@Composable
fun PreviewMeasurementFieldDropDown(){

    val muState = remember {
        mutableStateOf<IMeasurementUnit?>(null)
    }

    MeasurementFieldDropDown(
        dropDownList = listOf(
            Temperatures.TemperatureUnit.Celsius(),
            Temperatures.TemperatureUnit.Fahrenheit(),
            Temperatures.TemperatureUnit.Kelvin()
        ),
        selectedMeasurementUnitState = muState
    )
}