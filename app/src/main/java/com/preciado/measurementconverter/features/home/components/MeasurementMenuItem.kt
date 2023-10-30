package com.preciado.measurementconverter.features.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import com.preciado.measurementconverter.ui.components.containers.FieldContainer

@Composable
fun MeasurementMenuItem(
    modifier:Modifier = Modifier
){
    FieldContainer(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(text = "Temperature")
            Divider()
            Image(painter = , contentDescription = )
        }
    }
}

@Preview
@Composable
fun PreviewMeasurementMenuItem(){
    MeasurementMenuItem()
}