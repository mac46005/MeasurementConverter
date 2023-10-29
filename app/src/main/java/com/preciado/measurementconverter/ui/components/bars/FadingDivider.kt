package com.preciado.measurementconverter.ui.components.bars

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FadingDivider(
    modifier: Modifier = Modifier,
    color: Color = Color.Red
) {
    Canvas(modifier = modifier){
        val startPoint = Offset(0f, size.height / 2)
        val endPoint = Offset(size.width, size.height / 2)

        val gradient = Brush.horizontalGradient(
            colors = listOf(
                color,
                color.copy(.75f),
                color.copy(.5f),
                color.copy(.25f),
                color.copy(alpha = 0f)
            ),
            startX = 0f,
            endX = size.width
        )

        drawLine(
            brush = gradient,
            start = startPoint,
            end = endPoint,
            strokeWidth = size.height
        )
    }
}

@Preview
@Composable
fun PreviewFadingDivider(){
    FadingDivider(
        Modifier.fillMaxWidth().height(10.dp)
    )
}