package com.Example.roboguru.presentation.ui.chat.component


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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import com.Example.roboguru.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun ChatTopBar(modifier: Modifier) {

    Column(
        modifier = modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.5f),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.sdp, end = 10.sdp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.backicon),
                    contentDescription = null,
                    modifier = Modifier.size(20.sdp)
                )
                Text(
                    text = "CHAPTER 1",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 20.ssp,
                        fontWeight = FontWeight.Bold,
                    ),
                    textAlign = TextAlign.Start,
                    fontFamily = FontFamily(Font(R.font.ralextbold)),

                    )
                Image(
                    painter = painterResource(id = R.drawable.shareicon),
                    contentDescription = null,
                    modifier = Modifier.size(20.sdp)
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.sdp)
                    .background(color = Color(0x33000000)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "What is the Pythagorean theorem\n" +
                            "Give an example", style = TextStyle(
                        color = Color.White,
                        fontSize = 13.ssp,
                    ), textAlign = TextAlign.Center,
                    fontFamily = FontFamily(Font(R.font.ralsemibo))
                )

            }
        }
    }

}