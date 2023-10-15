package com.preciado.measurementconverter.ui.components.fields.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.math.min

@Composable
fun TextField(
    modifier: Modifier = Modifier,
    value: String,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = TextStyle(),
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
    keyboardActions: KeyboardActions = KeyboardActions(),
    singleLine: Boolean = false,
    maxLines: Int = 3,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    interactionSource: MutableInteractionSource = MutableInteractionSource(),
    cursorBrush: Brush = Brush.verticalGradient(listOf(Color.Black)),
    surfaceModifier: Modifier = Modifier,
    surfaceShape: Shape = RoundedCornerShape(5.dp),
    surfaceColor: Color = Color.White,
    surfaceContentColor: Color = Color.Black,
    surfaceTonalElevation: Dp = 0.dp,
    surfaceShadowElevation: Dp = 0.dp,
    surfaceBorder: BorderStroke? = null,
    boxModifier: Modifier = Modifier,
    boxContentAlignment: Alignment = Alignment.CenterStart,
    boxPropagateMinConstraints: Boolean = false,
    onValueChange: (String) -> Unit
) {
    BasicTextField(
        modifier = modifier.defaultMinSize(minWidth = 150.dp).padding(vertical = 5.dp),
        value = value,
        onValueChange = onValueChange,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = singleLine,
        maxLines = maxLines,
        visualTransformation = visualTransformation,
        onTextLayout = onTextLayout,
        interactionSource = interactionSource,
        cursorBrush = cursorBrush,
        decorationBox = { field ->

            Surface(
                modifier = surfaceModifier,
                shape = surfaceShape,
                color = surfaceColor,
                contentColor = surfaceContentColor,
                tonalElevation = surfaceTonalElevation,
                shadowElevation = surfaceShadowElevation,
                border = surfaceBorder
            ) {
                Box(
                    modifier = boxModifier.padding(3.dp),
                    contentAlignment = boxContentAlignment,
                    propagateMinConstraints = boxPropagateMinConstraints
                ){
                    field()
                }

            }
        }
    )
}

@Preview
@Composable
fun PreviewTextField(){
    TextField(value = "This is a value", onValueChange = { })
}