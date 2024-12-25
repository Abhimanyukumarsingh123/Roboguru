package com.Example.roboguru.presentation.ui.detailscreen.component

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import com.Example.roboguru.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun DetailBar(modifier: Modifier) {
    val blueGradient = Brush.linearGradient(
        colors = listOf(Color(0xff63A7D4), Color(0xffF295BE))
    )
    Box(
        modifier = modifier
            .statusBarsPadding()
            .fillMaxSize()
            .background(
                color = Color(0xFFFFFFFF),
                shape = RoundedCornerShape(topEnd = 20.sdp, topStart = 20.sdp)
            )
    ) {

        Image(
            painter = painterResource(R.drawable.robicon),
            contentDescription = "",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 15.sdp)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 0.sdp, start = 15.sdp, end = 0.sdp),
        ) {
            Box(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(R.drawable.addimg),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(top = 5.sdp, end = 25.sdp)
                        .size(135.sdp)
                        .align(Alignment.Center)
                )
            }

            Column(modifier = Modifier.padding(top = 20.sdp)) {
                Spacer(modifier = Modifier.padding(top = 36.sdp))
                Text(
                    text = "Enter Name", style = TextStyle(
                        color = Color.Black,
                        fontSize = 14.ssp,
                        fontWeight = FontWeight.Normal,
                    ), textAlign = TextAlign.Start
                )
                Spacer(modifier = Modifier.padding(top = 13.sdp))
                NameTextField()
                Spacer(modifier = Modifier.padding(top = 15.sdp))
                Text(
                    text = "CHOOSE CLASS", style = TextStyle(
                        color = Color.Black,
                        fontSize = 14.ssp,
                        fontWeight = FontWeight.Normal,
                    ), textAlign = TextAlign.Start
                )
                Spacer(modifier = Modifier.padding(top = 13.sdp))
                NameTextField()
                Spacer(modifier = Modifier.padding(top = 15.sdp))
                Text(
                    text = "SELECT LANGUAGE", style = TextStyle(
                        color = Color.Black,
                        fontSize = 14.ssp,
                        fontWeight = FontWeight.Normal,
                    ), textAlign = TextAlign.Start
                )
                Spacer(modifier = Modifier.padding(top = 13.sdp))
                NameTextField()
                Spacer(modifier = Modifier.padding(top = 15.sdp))
                Text(
                    text = "EMAIL ID", style = TextStyle(
                        color = Color.Black,
                        fontSize = 14.ssp,
                        fontWeight = FontWeight.Normal,
                    ), textAlign = TextAlign.Start
                )
                Spacer(modifier = Modifier.padding(top = 13.sdp))
                NameTextField()

            }
            Spacer(modifier = Modifier.padding(top = 15.sdp))
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ) {
                Text(
                    text = buildAnnotatedString {
                        append("Sponsored & Promote by ")
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Normal,
                                color = Color(0xFF0074D6)
                            )
                        ) {
                            append("ERAM LABS")
                        }
                    },
                    modifier = Modifier.padding(bottom = 0.sdp),
                    color = Color(0xFF878787),
                    fontSize = 10.ssp,
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "copyright © Mobirizer 2024",
                    modifier = Modifier.padding(bottom = 15.sdp),
                    style = TextStyle(
                        color = Color(0xff878787), fontSize = 10.ssp,
                    ),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}


@Composable
fun NameTextField() {
    val name = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(start = 0.sdp, end = 55.sdp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.sdp)
        ) {
            BasicTextField(value = name.value,
                onValueChange = { name.value = it },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.sdp), // Padding above the line
                textStyle = TextStyle(
                    color = Color(0xff000000),
                    fontSize = 14.ssp,
                    textAlign = TextAlign.Center // Ensures text is centered
                ),
                cursorBrush = SolidColor(Color.Black),
                decorationBox = { innerTextField ->
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.CenterStart // Centers placeholder text
                    ) {
                        if (name.value.isEmpty()) {
                            Text(
                                text = "Name", // Placeholder text
                                style = TextStyle(color = Color(0xFF000000), fontSize = 14.ssp),
                                textAlign = TextAlign.Start
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
