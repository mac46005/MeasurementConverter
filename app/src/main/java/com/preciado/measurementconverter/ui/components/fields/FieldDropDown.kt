package com.preciado.measurementconverter.ui.components.fields

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun <T> FieldDropDown(
    modifier: Modifier = Modifier,
    dropDownList: List<T>,
    surfaceTextFieldModifier: Modifier = Modifier,
    surfaceTextFieldShape: Shape = RoundedCornerShape(10.dp),
    surfaceTextFieldColor: Color = Color.White,
    surfaceTextFieldContentColor: Color = Color.Black,
    surfaceTextFieldTonalElevation: Dp = 0.dp,
    surfaceTextFieldShadowElevation: Dp = 0.dp,
    surfaceTextFieldBorder: BorderStroke? = null,
    buttonModifier: Modifier = Modifier,
    buttonEnabled: Boolean = true,
    buttonShape: Shape = RoundedCornerShape(5.dp),
    buttonColors: ButtonColors = ButtonDefaults.buttonColors(),
    buttonElevation: ButtonElevation? = null,
    buttonBorder: BorderStroke? = null,
    buttonContentPadding: PaddingValues = PaddingValues(5.dp),
    buttonInteractionSource: MutableInteractionSource = MutableInteractionSource(),
    buttonContent: @Composable() (RowScope.() -> Unit),
    dropDownListItemBoxModifier: Modifier = Modifier,
    dropDownListItemBoxContentAlignment: Alignment = Alignment.CenterStart,
    dropDownListItemBoxPropagateMinConstraints: Boolean = false,
    dropDownListItemBoxContent: @Composable() (BoxScope.(T) -> Unit),
    placeHolder: @Composable (BoxScope.() -> Unit),
    selectedItemContent: @Composable (BoxScope.(T) -> Unit),
    onItemSelected: (T) -> Unit,
) {

    val selectedItemState = remember{
        mutableStateOf<T?>(null)
    }

    var isExpanded = remember{
        mutableStateOf(false)
    }

    Row(modifier) {


        Surface(
            modifier = surfaceTextFieldModifier,
            shape = surfaceTextFieldShape,
            color = surfaceTextFieldColor,
            contentColor = surfaceTextFieldContentColor,
            tonalElevation = surfaceTextFieldTonalElevation,
            shadowElevation = surfaceTextFieldShadowElevation,
            border = surfaceTextFieldBorder
        ) {
            if(selectedItemState.value != null){
                Box(
                    modifier = Modifier.height(30.dp),
                    contentAlignment = Alignment.Center
                ){
                    selectedItemContent(this, selectedItemState.value!!)
                }

            }else{
                Box(
                    modifier = Modifier.height(30.dp),
                    contentAlignment = Alignment.Center
                ){
                    placeHolder(this)
                }
            }
        }


        Button(
            onClick = { isExpanded.value = true },
            modifier = buttonModifier,
            enabled = buttonEnabled,
            shape = buttonShape,
            colors = buttonColors,
            elevation = buttonElevation,
            border = buttonBorder,
            contentPadding = buttonContentPadding,
            interactionSource = buttonInteractionSource
        ) {
            buttonContent(this)
        }
    }

    DropdownMenu(
        modifier = Modifier,
        expanded = isExpanded.value,
        onDismissRequest = {
            isExpanded.value = false
        }
    ) {
        for(item in dropDownList){
            Box(
                modifier =dropDownListItemBoxModifier.clickable {
                    selectedItemState.value = item
                    isExpanded.value = false
                    onItemSelected(selectedItemState.value!!)
                },
                contentAlignment = dropDownListItemBoxContentAlignment,
                propagateMinConstraints = dropDownListItemBoxPropagateMinConstraints
            ) {
                dropDownListItemBoxContent(this, item)
            }
        }
    }
}







@Preview
@Composable
fun PreviewFieldDropDown(

) {

    var state = remember{
        mutableStateOf<String?>(null)
    }

    FieldDropDown<String>(
        dropDownList = listOf(
            "Helllo"
        ),
        buttonContent = {

        },
        dropDownListItemBoxContent = {

        },
        placeHolder = {
            Text(text = "No item selected")
        },
        selectedItemContent = {

        }
    ) {

    }
}