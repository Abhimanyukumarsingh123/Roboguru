package com.Example.roboguru.presentation.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import com.Example.roboguru.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun TopBar(modifier: Modifier) {
    val name = remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 15.sdp, end = 15.sdp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.sdp),
            verticalAlignment = Alignment.CenterVertically, // Align items vertically
            horizontalArrangement = Arrangement.SpaceBetween // Space out items
        ) {
            Image(
                painter = painterResource(id = R.drawable.homemenu),
                contentDescription = null,
                modifier = Modifier
                    .size(20.sdp)
            )
            Text(
                text = "ROBO GURU",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 20.ssp,
                    fontWeight = FontWeight.Bold,
                ),
                textAlign = TextAlign.Start
            )
            Image(
                painter = painterResource(id = R.drawable.bellicon),
                contentDescription = null,
                modifier = Modifier
                    .size(20.sdp)
            )
        }
        Spacer(modifier = Modifier.padding(top = 10.sdp))
        Text(
            text = "Good Afternoon, Alisha",
            style = TextStyle(
                color = Color.White,
                fontSize = 13.ssp,

            ),
            textAlign = TextAlign.Start
        )
        Text(
            text = "Ready to Explore New Topics?",
            style = TextStyle(
                color = Color.White,
                fontSize = 19.ssp,

                ),
            textAlign = TextAlign.Start
        )
        Spacer(modifier = Modifier.padding(top = 20.sdp))

        Column(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .padding(start = 1.sdp, end = 1.sdp)
                    .size(width = 310.sdp, height = 42.sdp)
                    .background(color = Color(0xffF6F6F6), shape = RoundedCornerShape(30.sdp))
                    .padding(start = 8.sdp, end = 5.sdp) // Padding for text and end image
            ) {
                if (name.value.text.isEmpty()) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically, // Align items vertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.searchicon),
                            contentDescription = null,
                            modifier = Modifier
                                .size(15.sdp)
                                .padding(start = 5.sdp)
                        )
                        Text(
                            text = "Search for topics, chapters, or subjects...",
                            fontSize = 10.ssp,
                            color = Color(0xFFA7A7A7),
                            modifier = Modifier.padding(start = 7.sdp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.mikeicon),
                            contentDescription = null,
                            modifier = Modifier
                                .size(15.sdp)
                                .padding(start = 5.sdp)
                        )

                    }
                }
                BasicTextField(
                    value = name.value,
                    onValueChange = { name.value = it },
                    textStyle = TextStyle(
                        color = Color(0xFFA6A6A6),
                        fontSize = 12.ssp
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 15.sdp),
                    singleLine = true
                )

            }
        }

    }
}