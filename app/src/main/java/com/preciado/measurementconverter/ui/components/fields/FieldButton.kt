package com.preciado.measurementconverter.ui.components.fields

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FieldButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable (RowScope.() -> Unit)
){
    Button(
        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
        shape = RectangleShape,
        onClick = onClick
    ) {
        content(this)
    }
}

@Preview
@Composable
fun PreviewFieldButton(){
    FieldButton(onClick = {}){
        Text(text = "Submit")
    }
}