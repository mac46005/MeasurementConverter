package com.preciado.measurementconverter.ui.components.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.preciado.measurementconverter.ui.components.containers.FieldContainer

@Composable
fun <T> MeasurementConverterScreen(
    modifier: Modifier = Modifier,
    subTitle: String? = null
){
    MainScreen(
        subTitle = subTitle
    ) {
        FieldContainer() {
            Text(text = "TO")

            Text(text = "VALUE")

        }

        FieldContainer() {
            Text(text = "FROM")

        }
    }
}

@Preview
@Composable
fun PreviewMeasurementConverterScreen(){
    MeasurementConverterScreen()
}