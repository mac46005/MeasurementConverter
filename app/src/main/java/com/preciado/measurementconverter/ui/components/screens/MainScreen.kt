package com.preciado.measurementconverter.ui.components.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.preciado.measurementconverter.ui.components.bars.TitleBar
import com.preciado.measurementconverter.ui.theme.MeasurementConverterTheme

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    subTitle: String? = null,
    content: @Composable (ColumnScope.() -> Unit)
){
    MeasurementConverterTheme() {
        Surface() {
            Column(modifier = modifier) {
                TitleBar(
                    subTitle = subTitle
                )
                content(this)
            }
        }
    }
}

@Preview
@Composable
fun PreviewTopTitleScreen(){
    MainScreen(){

    }
}