package com.Example.roboguru.presentation.ui.otpScreen.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.runtime.Composable
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Example.roboguru.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun fillOtp(modifier: Modifier) {
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 15.sdp, start = 15.sdp, end = 0.sdp)
        ) {
            Text(
                text = "Let’s Break", style = TextStyle(
                    color = Color.Black,
                    fontSize = 18.ssp,
                    fontWeight = FontWeight.Bold,
                ), textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.padding(top = 5.sdp))
            Text(
                text = buildAnnotatedString {
                    append("The Barrier’s\nof ")
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold, color = Color(0xFF63A7D4)
                        )
                    ) {
                        append("Learning App")
                    }
                },
                fontWeight = FontWeight.Bold,
                color = Color(0xff000000),
                fontSize = 17.ssp,
                textAlign = TextAlign.Start,

                )
            Spacer(modifier = Modifier.padding(top = 20.sdp))
            Image(
                painter = painterResource(R.drawable.otpimg),
                contentDescription = "",
                modifier = Modifier.size(115.sdp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.sdp)
            ) {
                Column(modifier = Modifier.padding(top = 20.sdp)) {
                    Spacer(modifier = Modifier.padding(top = 10.sdp))
                    Text(
                        text = "Enter Number\nMobile Number", style = TextStyle(
                            color = Color.Black,
                            fontSize = 18.ssp,
                            fontWeight = FontWeight.Normal,
                        ), textAlign = TextAlign.Start
                    )
                    Text(
                        text = "+91 9572420215", style = TextStyle(
                            color = Color(0xFF63A7D4),
                            fontSize = 13.ssp,
                            fontWeight = FontWeight.Normal,
                        ), textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 10.sdp)
                    )
                    Text(
                        text = "ENTER OTP", style = TextStyle(
                            color = Color(0xFF000000),
                            fontSize = 15.ssp,
                            fontWeight = FontWeight.Normal,
                        ), textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 15.sdp)
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(bottom = 13.sdp),
                        contentAlignment = Alignment.BottomStart
                    ) {
                        OtpTextField()
                    }
                }
                Image(
                    painter = painterResource(R.drawable.robicon),
                    contentDescription = "",
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(bottom = 10.sdp)
                )
            }
            Spacer(modifier = Modifier.padding(top = 15.sdp))
            Button(
                onClick = {
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                ),
                modifier = Modifier
                    .padding(start = 5.sdp, end = 20.sdp)
                    .size(width = 310.sdp, height = 43.sdp)
                    .background(blueGradient, shape = RoundedCornerShape(30.sdp))
            ) {
                Text(
                    text = "SUBMIT", fontSize = 12.ssp, fontWeight = FontWeight.Bold
                )
            }
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
fun OtpTextField() {
    val otp = remember { mutableStateOf("") }
    val maxLength = 4
    Row(
        modifier = Modifier
            .fillMaxWidth(0.57f),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        for (i in 0 until maxLength) {
            Box(
                modifier = Modifier
                    .size(34.sdp) // Size of each box
                    .background(
                        Color(0xFFE0E0E0),
                        shape = RoundedCornerShape(1.sdp)
                    ) // Box background
                    .border(
                        width = 1.sdp,
                        color = if (i < otp.value.length) Color(0xffEAEAEA) else Color(0xffEAEAEA), // Active box border color
                        shape = RoundedCornerShape(1.sdp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = otp.value.getOrNull(i)?.toString() ?: "", // Show digit if exists
                    style = TextStyle(
                        fontSize = 16.ssp,
                        textAlign = TextAlign.Center,
                        color = Color.Black
                    )
                )
            }
        }
    }

    BasicTextField(
        value = otp.value,
        onValueChange = {
            if (it.length <= maxLength && it.all { char -> char.isDigit() }) {
                otp.value = it
            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number // Numeric keyboard
        ),
        cursorBrush = SolidColor(Color.Transparent), // Hide cursor
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.sdp) // Add spacing from the boxes
            .background(Color.Transparent), // Transparent background
        decorationBox = { innerTextField ->
            // Invisible container for proper interaction

        }
    )
}
