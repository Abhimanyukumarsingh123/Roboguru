package com.Example.roboguru.presentation.ui.number.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
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
import com.Example.roboguru.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun fillNumber(modifier: Modifier) {
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
            Image(painter = painterResource(R.drawable.dialicon), contentDescription = "")
            Row(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(top = 20.sdp)) {
                    Text(
                        text = "Enter Number\nMobile Number", style = TextStyle(
                            color = Color.Black,
                            fontSize = 18.ssp,
                            fontWeight = FontWeight.Normal,
                        ), textAlign = TextAlign.Start
                    )
                    Text(
                        text = "We are always helping you!", style = TextStyle(
                            color = Color(0xFF63A7D4),
                            fontSize = 13.ssp,
                            fontWeight = FontWeight.Normal,
                        ), textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 20.sdp)
                    )
                    Text(
                        text = "ENTER NUMBER", style = TextStyle(
                            color = Color(0xFF000000),
                            fontSize = 15.ssp,
                            fontWeight = FontWeight.Normal,
                        ), textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 30.sdp)
                    )

                }
                Image(painter = painterResource(R.drawable.robicon), contentDescription = "")
            }
            CustomTextField()
            Spacer(modifier = Modifier.padding(top = 10.sdp))
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
                    text = "GET OTP", fontSize = 12.ssp, fontWeight = FontWeight.Bold
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
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Normal, color = Color(0xFF0074D6))) {
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
fun CustomTextField() {
    val name = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(start = 0.sdp, end = 100.sdp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.sdp)
        ) {
            BasicTextField(value = name.value,
                onValueChange = {
                    if (it.all { char -> char.isDigit() }) {
                        name.value = it
                    }
                },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 2.sdp), // Padding above the line
                textStyle = TextStyle(
                    color = Color(0xff000000),
                    fontSize = 15.ssp,
                    textAlign = TextAlign.Start
                ),
                cursorBrush = SolidColor(Color.Black),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number // Numeric keyboard
                ),
                decorationBox = { innerTextField ->
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.CenterStart // Centers placeholder text
                    ) {
                        if (name.value.isEmpty()) {
                            Text(
                                text = "+91 98xx xxx782", // Placeholder text
                                style = TextStyle(color = Color(0xFF000000), fontSize = 15.ssp),
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
                .background(Color(0xFf000000)) // Color of the underline
        )
    }
}