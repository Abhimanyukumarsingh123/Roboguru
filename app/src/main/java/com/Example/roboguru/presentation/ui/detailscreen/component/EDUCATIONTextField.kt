package com.Example.roboguru.presentation.ui.detailscreen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.text.style.TextAlign
import com.Example.roboguru.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp


@Composable
fun EDUCATIONTextField() {
    val education = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(start = 0.sdp, end = 10.sdp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.sdp)
        ) {
            BasicTextField(value = education.value,
                onValueChange = { education.value = it },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.sdp), // Padding above the line
                textStyle = TextStyle(
                    color = Color(0xff000000),
                    fontSize = 14.ssp,
                    textAlign = TextAlign.Start, // Ensures text is centered
                    fontFamily = FontFamily(Font(R.font.medium))
                ),
                cursorBrush = SolidColor(Color.Black),
                decorationBox = { innerTextField ->
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.CenterStart // Centers placeholder text
                    ) {
                        if (education.value.isEmpty()) {
                            Text(
                                text = "Education Level", // Placeholder text
                                style = TextStyle(color = Color(0xFF000000), fontSize = 14.ssp),
                                textAlign = TextAlign.Start,
                                fontFamily = FontFamily(Font(R.font.medium))
                            )
                        }
                        innerTextField() // This is where the input text will be displayed
                    }
                })
        }
        // This Spacer acts as the underline
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.sdp) // Thickness of the underline
                .background(Color(0xFFA5A3A3)) // Color of the underline
        )
    }
}
