package com.preciado.measurementconverter.features.home.domain

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.preciado.measurementconverter.R
import com.preciado.measurementconverter.ui.components.bars.TitleBar
import com.preciado.measurementconverter.ui.components.bars.TopBar
import com.preciado.measurementconverter.ui.navigation.Screen
import com.preciado.measurementconverter.ui.theme.MeasurementConverterTheme

@Composable
fun Home(
    navController: NavController,
    modifier: Modifier = Modifier
){
    MeasurementConverterTheme() {
        Surface() {
            Column(
                modifier = modifier.fillMaxSize()
            ) {
                TitleBar()
                Column(modifier = Modifier.fillMaxWidth()) {

                    Row(modifier) {
                        Card(
                            modifier =
                            Modifier
                                .height(200.dp)
                                .width(200.dp)
                                .clickable {
                                    navController.navigate(Screen.ConvertTemperatures.fullRoute())
                                }
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_action_temp),
                                contentDescription = "Temp icon",
                                modifier = Modifier.height(100.dp).width(100.dp)
                            )
                            Text(text = "Temperature")
                        }
                    }

                }
            }
        }
    }

}

@Preview
@Composable
fun PreviewHome(){
    Home(
        navController = rememberNavController()

    )
}