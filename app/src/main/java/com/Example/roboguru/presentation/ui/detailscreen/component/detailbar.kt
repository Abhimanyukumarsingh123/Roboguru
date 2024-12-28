package com.Example.roboguru.presentation.ui.detailscreen.component

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import com.Example.roboguru.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

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
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(190.sdp)
            ) {
                Column(modifier = Modifier.padding( start = 10.sdp)) {
                    Box() {
                        Image(
                            painter = painterResource(R.drawable.addimg),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(end = 60.sdp, top = 20.sdp)
                        )
                        Text(
                            text = "Profile Image", style = TextStyle(
                                color = Color(0xff6A6A6A),
                                fontSize = 14.ssp,
                            ), textAlign = TextAlign.Center,
                            fontFamily = FontFamily(Font(R.font.medium)),
                            modifier = Modifier.padding(top = 5.sdp, end = 10.sdp).align(Alignment.Center)
                        )
                    }
                    Spacer(modifier = Modifier.padding(top = 10.sdp))
                    Text(
                        text = "E N T E R  N A M E", style = TextStyle(
                            color = Color(0x99000000),
                            fontSize = 11.ssp,
                            fontWeight = FontWeight.Normal,
                        ), textAlign = TextAlign.Start,
                        fontFamily = FontFamily(Font(R.font.medium)),
                        modifier = Modifier.padding(top = 15.sdp)
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(bottom = 13.sdp),
                        contentAlignment = Alignment.BottomStart
                    ) {
                        NameTextField()
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
            Column(modifier = Modifier.padding(end = 10.sdp, start = 10.sdp)) {

                Text(
                    text = "E D U C A T I O N  L E V E L", style = TextStyle(
                        color = Color(0x99000000),
                        fontSize = 11.ssp,
                        fontWeight = FontWeight.Normal,
                    ), textAlign = TextAlign.Start,
                    fontFamily = FontFamily(Font(R.font.medium)),
                    modifier = Modifier.padding(top = 6.sdp)
                )
                Spacer(modifier = Modifier.padding(top =10.sdp))
                EDUCATIONTextField()
                Text(
                    text = "C H O O S E  C L A S S", style = TextStyle(
                        color = Color(0x99000000),
                        fontSize = 11.ssp,
                        fontWeight = FontWeight.Normal,
                    ), textAlign = TextAlign.Start,
                    fontFamily = FontFamily(Font(R.font.medium)),
                    modifier = Modifier.padding(top = 6.sdp)
                )
                Spacer(modifier = Modifier.padding(top = 10.sdp))
                ClassTextField()
                Text(
                    text = "S E L E C T  L A N G U A G E", style = TextStyle(
                        color = Color(0x99000000),
                        fontSize = 11.ssp,
                        fontWeight = FontWeight.Normal,
                    ), textAlign = TextAlign.Start,
                    fontFamily = FontFamily(Font(R.font.medium)),
                    modifier = Modifier.padding(top = 6.sdp)
                )
                Spacer(modifier = Modifier.padding(top = 10.sdp))
                LanguageTextField()
                Text(
                    text = "E M A I L  I D", style = TextStyle(
                        color = Color(0x99000000),
                        fontSize = 11.ssp,
                        fontWeight = FontWeight.Normal,
                    ), textAlign = TextAlign.Start,
                    fontFamily = FontFamily(Font(R.font.medium)),
                    modifier = Modifier.padding(top = 6.sdp)
                )
                Spacer(modifier = Modifier.padding(top = 10.sdp))
                EmailTextField()
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
                        text = "SUBMIT", fontSize = 12.ssp,
                        fontFamily = FontFamily(Font(R.font.medium))

                    )
                }
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

