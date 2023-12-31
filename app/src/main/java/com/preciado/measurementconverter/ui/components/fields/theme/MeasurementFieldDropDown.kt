package com.preciado.measurementconverter.ui.components.fields.theme

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.preciado.measurementconverter.R
import com.preciado.measurementconverter.data.interfaces.IMeasurementType
import com.preciado.measurementconverter.ui.components.fields.FieldDropDown

@Composable
fun MeasurementFieldDropDown(
    modifier: Modifier = Modifier,
    dropDownList: List<IMeasurementType>,
    onSelectedItem: (IMeasurementType) -> Unit,
) {
    FieldDropDown<IMeasurementType>(
        modifier = modifier,
        dropDownList = dropDownList,
        surfaceTextFieldShape = RoundedCornerShape(topStart = 5.dp, bottomStart = 5.dp),
        buttonModifier = Modifier.height(30.dp),
        buttonShape = RoundedCornerShape(topEnd = 5.dp, bottomEnd = 5.dp),
        buttonContent = {
                       Icon(painter = painterResource(id = R.drawable.baseline_arrow_drop_down_24), contentDescription = "Drop down icon")
        },
        dropDownListItemBoxContent = { 
                                     DropDownTextContent(text = it.name)
                                     },
        placeHolder = {
            DropDownTextContent(
                modifier = Modifier.padding(5.dp),
                text = "Please select a measurement unit"
            )
        },
        selectedItemContent = {
            DropDownTextContent(
                modifier = Modifier.padding(5.dp),
                text = it.name
            )
        }
    ) {
        onSelectedItem(it)
    }
}

@Preview
@Composable
fun PreviewMeasurementFieldDropDown(){

    val muState = remember {
        mutableStateOf<IMeasurementType?>(null)
    }

    MeasurementFieldDropDown(
        dropDownList = listOf(),
        onSelectedItem = {}
    )
}