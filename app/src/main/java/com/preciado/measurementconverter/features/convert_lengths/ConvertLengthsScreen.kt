package com.preciado.measurementconverter.features.convert_lengths

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.preciado.measurementconverter.ui.components.bars.TitleBar
import com.preciado.measurementconverter.ui.components.screens.TopTitleScreen
import com.preciado.measurementconverter.ui.theme.MeasurementConverterTheme

@Composable
fun ConvertLengthsScreen(
    modifier: Modifier = Modifier,
    content: @Composable (ColumnScope.() -> Unit)
){
    TopTitleScreen() {
        content(this)
    }
}

@Preview
@Composable
fun PreviewConvertLengthsScreen(){
    ConvertLengthsScreen {
        Text(text = "Your a bitch")
        Text(text = "Another bitch")
    }
}