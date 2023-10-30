package com.preciado.measurementconverter.ui.components.bars

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.preciado.measurementconverter.ui.theme.MeasurementConverterTheme

@Composable
fun TitleBar(
    modifier: Modifier = Modifier,
    subTitle: String? = null
) {
    MeasurementConverterTheme() {
        Surface() {
            Box(modifier = modifier){
                Row {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(.7f)
                            .drawBehind {
                                val y = size.height
                                val x = size.width

                                drawLine(
                                    color = Color.Gray,
                                    start = Offset(x, 0f),
                                    end = Offset(x, y),
                                    strokeWidth = 6f
                                )

                                drawLine(
                                    color = Color.Gray,
                                    start = Offset(0f, y),
                                    end = Offset(x, y),
                                    strokeWidth = 6f
                                )
                            },
                        contentAlignment = Alignment.Center
                    ){

                        Column(
                        ) {
                            Text(
                                text = "Measurement Converter",
                                fontSize = 25.sp,
                            )

                            if(subTitle != null){
                                Divider()
                                Text(text = subTitle)
                            }
                        }
                    }



                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Bottom)
                            .padding(start = 5.dp),
                    ) {
                        FadingDivider(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(4.dp)
                                .padding(bottom = 2.dp)
                            ,
                            color = Color.Red
                        )
                        Divider(
                            Modifier.height(2.dp)
                        )
                    }




                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewTitleBar(){
    TitleBar(
    )
}