package com.preciado.measurementconverter.features.convert_lengths

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.preciado.measurementconverter.ui.components.containers.FieldContainer
import com.preciado.measurementconverter.ui.components.screens.MainScreen

@Composable
fun ConvertLengthsScreen(
    modifier: Modifier = Modifier,
){
    MainScreen() {
        FieldContainer() {
            
        }
    }
}

@Preview
@Composable
fun PreviewConvertLengthsScreen(){
    ConvertLengthsScreen()
}