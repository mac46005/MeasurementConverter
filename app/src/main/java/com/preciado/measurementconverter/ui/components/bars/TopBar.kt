package com.preciado.measurementconverter.ui.components.bars

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun TopBar(
    modifier: Modifier = Modifier
) {
    Surface(
        
    ) {
        Box(modifier = modifier.fillMaxWidth()){
            Row() {
                Text(text = "Measurement Converter")
            }
            Divider(modifier = Modifier.align(Alignment.BottomCenter))
        }
    }
}