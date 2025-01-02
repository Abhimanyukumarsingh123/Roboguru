package com.Example.roboguru.presentation.ui.startup2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import com.Example.roboguru.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun StartupScreen2() {
    val blueGradient = Brush.horizontalGradient(
        colors = listOf(Color(0xff63A7D4), Color(0xffF295BE))
    )
    Box(
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxSize()
            .drawBehind {
                drawRect(blueGradient)
            }, contentAlignment = Alignment.Center
    ) {
        // Background Image

        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            // Top Section with Rounded Corners
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.86f)
                    .clip(RoundedCornerShape(bottomStart = 22.sdp, bottomEnd = 22.sdp))
                    .background(color = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.startuptwo),
                    contentDescription = "Decorative Background",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Skip Button
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.TopEnd
                    ) {
                        Text(
                            text = "Skip >>",
                            color = Color.Black,
                            fontFamily = FontFamily(Font(R.font.ralsemibo)),
                            fontSize = 16.ssp,
                            modifier = Modifier.padding(end = 15.sdp, top = 15.sdp)
                        )
                    }

                    Spacer(modifier = Modifier.height(12.sdp))

                    // Centered Content
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.the),
                            contentDescription = "Logo",
                            modifier = Modifier
                                .padding(start = 30.sdp)
                                .size(150.sdp, 25.sdp)
                        )
                        Text(
                            text = buildAnnotatedString {
                                append("Explore ")
                                withStyle(
                                    style = SpanStyle(
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black,
                                        fontFamily = FontFamily(Font(R.font.ralbold))
                                    )
                                ) {
                                    append("Topics ")
                                }
                                append("and\n" +
                                        "Chapters")
                            },
                            fontFamily = FontFamily(Font(R.font.ralrag)),
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontSize = 22.ssp,
                            textAlign = TextAlign.Center
                        )
                    }

                    Spacer(modifier = Modifier.height(20.sdp))

                    // Bottom Text
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Text(
                            text = "Dive into academic subjects\n" +
                                    "tailored to your class or grade,\n" +
                                    " with clear explanations and \n" +
                                    "key concepts.",
                            color = Color(0xB3000000),
                            fontFamily = FontFamily(Font(R.font.ralsemibo)),
                            fontSize = 15.ssp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(bottom = 80.sdp)
                        )
                    }
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.BottomCenter
            ) {
                Text(
                    text = "STILL WITHOUT ACCOUNT? CREATE NOW!",
                    color = Color(0xFFFFFFFF),
                    fontFamily = FontFamily(Font(R.font.ralbold)),
                    fontSize = 10.ssp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 15.sdp)
                )
            }
        }
    }
}
