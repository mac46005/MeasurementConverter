package com.preciado.measurementconverter.ui.components.containers

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.preciado.measurementconverter.R

@Composable
fun FieldContainer(
    modifier: Modifier = Modifier,
    width: Dp = 400.dp,
    height: Dp = 200.dp,
    content: @Composable (BoxScope.() -> Unit)
){
    Box(
        modifier = modifier
            .padding(5.dp)
            .width(width)
            .height(height)
            .border(1.dp, Color.Gray, RectangleShape)
    ){
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.metal_background),
            contentDescription = "metal background",
            contentScale = ContentScale.FillBounds
        )

        content(this)
    }
}

@Preview
@Composable
fun PreviewFieldContainer(){
    FieldContainer{
        Column() {
            Text(text = "TEXT")
        }
    }
}