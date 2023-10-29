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
import androidx.compose.ui.graphics.Color
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
                            .border(1.dp, Color.Gray)
                            .fillMaxWidth(.7f)
                    ){

                        Column(Modifier.padding(start = 30.dp, end = 5.dp)) {
                            Text(
                                text = "Measurement Converter",
                                fontSize = 25.sp,
                            )
                            Divider()
                            if(subTitle != null){
                                Text(text = subTitle)
                            }
                        }
                    }
                    Column(
                        modifier = Modifier.fillMaxWidth().align(Alignment.Bottom),
                    ) {
                        FadingDivider(
                            modifier = Modifier.fillMaxWidth().height(2.dp),
                            color = Color.Red
                        )
                        Divider()
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