package com.preciado.measurementconverter.ui.components.fields.theme

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DropDownTextContent (
    modifier:Modifier = Modifier,
    text: String
){
    Text(
        modifier = modifier.defaultMinSize(minWidth = 150.dp).height(30.dp),
        text = text,
        textAlign = TextAlign.Center
    )
}

@Preview
@Composable
fun PreviewDropDownTextContent(){
    DropDownTextContent(text = "HEllo")
}