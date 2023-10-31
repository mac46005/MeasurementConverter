package com.preciado.measurementconverter.features.home.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.preciado.measurementconverter.R
import com.preciado.measurementconverter.ui.components.containers.FieldContainer

@Composable
fun MeasurementMenuItem(
    modifier:Modifier = Modifier,
    @DrawableRes id:  Int,
    onClick: () -> Unit
){
    FieldContainer(
        modifier = modifier.clickable {
                                      onClick()
        },
        height = 180.dp,
        width = 180.dp,
        contentAlignment = Alignment.Center
    ) {
        Column (
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Temperature")
            Divider(
                modifier = Modifier
                    .height(4.dp)
                    .fillMaxWidth(.8f)
                ,
                color = Color.White
            )
            Image(
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                painter = painterResource(id), contentDescription = ""
            )
        }
    }
}

@Preview
@Composable
fun PreviewMeasurementMenuItem(){
    MeasurementMenuItem(
        id = R.drawable.tempgauge
    ){

    }
}