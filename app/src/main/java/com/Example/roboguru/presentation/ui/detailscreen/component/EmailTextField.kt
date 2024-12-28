package com.Example.roboguru.presentation.ui.detailscreen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.DropdownMenu
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import com.Example.roboguru.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun EmailTextField() {
    var ChooseEmail by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    val classOptions = listOf("")


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 0.sdp, end = 10.sdp
            )

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent)
                .clickable { expanded = !expanded }, // Toggle dropdown on click
            verticalAlignment = Alignment.CenterVertically
        ) {

            Spacer(modifier = Modifier.width(8.sdp))

            // Text field to show selected gender
            BasicTextField(
                value = ChooseEmail,
                onValueChange = { ChooseEmail = it },
                singleLine = true,
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = 8.sdp),
                textStyle = TextStyle(
                    color = Color(0xff000000),
                    fontSize = 14.ssp,
                    textAlign = TextAlign.Start, // Ensures text is centered
                    fontFamily = FontFamily(Font(R.font.medium))
                ),
                cursorBrush = SolidColor(Color.White),
                decorationBox = { innerTextField ->
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        if (ChooseEmail.isEmpty()) {
                            Text(
                                text = "e.g john@sample.com",
                                style = TextStyle(
                                    color = Color(0x66000000),
                                    fontSize = 14.ssp,
                                    textAlign = TextAlign.Start, // Ensures text is centered
                                    fontFamily = FontFamily(Font(R.font.medium))
                                ),
                            )
                        }
                        innerTextField()
                    }
                }
            )

            androidx.compose.material3.Icon(
                imageVector = if (expanded) Icons.Default.KeyboardArrowDown else Icons.Default.KeyboardArrowUp,
                contentDescription = null,
                tint = Color(0xFFA5A3A3),
                modifier = Modifier
                    .padding(start = 8.sdp)
                    .size(20.sdp)
                    .clickable { expanded = !expanded }
                    .align(Alignment.CenterVertically)
            )
        }

        // Dropdown menu for gender options
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .fillMaxWidth(0.5f)

                .background(
                    color = Color.Transparent,
                    shape = RoundedCornerShape(
                        bottomStart = 20.sdp,
                        bottomEnd = 20.sdp
                    ) // Set the desired corner radius
                )
        ) {
            classOptions.forEach { gender ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = gender,
                            style = TextStyle(
                                fontFamily = FontFamily(Font(R.font.medium)),
                                fontSize = 14.ssp,
                                color = Color.Black
                            )
                        )
                    },
                    onClick = {
                        ChooseEmail = gender // Set selected gender
                        expanded = false // Close dropdown
                    }
                )
            }
        }

        // This Spacer acts as the underline
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.sdp)
                .background(Color(0xFFA5A3A3))
        )
    }
}