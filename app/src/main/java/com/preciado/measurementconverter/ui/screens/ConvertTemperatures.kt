package com.preciado.measurementconverter.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.preciado.measurementconverter.R
import com.preciado.measurementconverter.ui.components.bars.TopBar
import com.preciado.measurementconverter.ui.navigation.Screen

@Composable
fun ConvertTemperatures(
    navController: NavController,
    modifier: Modifier = Modifier
){
    Column (modifier = Modifier.fillMaxSize()){
        TopBar()
        Text(text = "Temperature")
        Text(text = "From")







        //TODO Make this a separate composable
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                color = Color.Gray
            ) {
                Text(
                    modifier = Modifier
                        .height(30.dp)
                        .fillMaxWidth(.5f),
                    text = "Celsius",
                    style = TextStyle(textAlign = TextAlign.Center)
                )
            }
            Button(
                modifier = Modifier.height(30.dp),
                shape = RoundedCornerShape(topEnd = 5.dp, bottomEnd = 5.dp),
                onClick = { /*TODO*/ }
            ) {
                Icon(painter = painterResource(id = R.drawable.baseline_arrow_drop_down_24), contentDescription = "Drop down menu" )
            }
        }






        Text(text = "Result")
        Text(text = "33.6")
        Text(text = "1 Celsius = 33.8")
    }
}

@Preview
@Composable
fun PreviewConvertTemperatures(){
    ConvertTemperatures(navController = rememberNavController())
}