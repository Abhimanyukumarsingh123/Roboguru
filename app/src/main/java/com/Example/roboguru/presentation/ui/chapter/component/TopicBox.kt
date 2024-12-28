package com.Example.roboguru.presentation.ui.chapter.component

import android.widget.Space
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.Example.roboguru.R
import com.Example.roboguru.data.gerQuestion
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopicBox(modifier: Modifier) {

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
            modifier = Modifier.fillMaxSize()
        ) {
            question(modifier)
        }
    }
}

@Composable
fun question(modifier: Modifier) {
    val QuestionItem = gerQuestion()


    LazyColumn(
        modifier = modifier.fillMaxWidth(),
    ) {
        items(QuestionItem) { questionItem ->
            MainChatBox(
                question = questionItem.question, Number = questionItem.number
            )
        }
    }
}


@Composable
fun MainChatBox(question: String, Number: String) {
    Box(modifier = Modifier.fillMaxSize()) {

        Card(
            modifier = Modifier
                .padding(top = 15.sdp, start = 15.sdp)
                .height(155.sdp)
                .width(100.sdp),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xffF4F4F4))
        ) {


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.1f))
                        )
                    )
                    .padding(top = 10.sdp, start = 10.sdp)
            ) {
                Text(
                    text = Number,
                    color = Color(0x33000000),
                    fontSize = 20.ssp,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(4.dp), // Optional padding
                    fontFamily = FontFamily(Font(R.font.ralbold)),
                    )
                Spacer(modifier = Modifier.padding(top = 30.sdp))
                Image(
                    painter = painterResource(
                        id = R.drawable.arrowicon,
                    ),
                    contentDescription = "",
                    modifier = Modifier
                    .padding(start = 20.sdp) .
                        size(25.sdp)
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.sdp, start = 90.sdp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = question,
                color = Color(0xff5C5C5C),
                fontSize = 16.ssp,
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily(Font(R.font.ralsemibo))
            )
        }
        Row(
            modifier = Modifier
                .padding(end = 10.sdp, bottom = 10.sdp)
                .align(Alignment.BottomEnd),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { /* Handle Chat button click */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .border(
                    1.sdp,
                    Color(0xff63A7D4),
                    shape = RoundedCornerShape(7.sdp)
                )
            ) {
                Row {
                    Image(
                        painter = painterResource(
                            id = R.drawable.chaticon,
                        ),
                        contentDescription = "",
                        modifier = Modifier.size(13.sdp)
                    )
                    Spacer(modifier = Modifier.padding(start = 4.sdp))
                    Text(
                        text = "Chat",
                        color = Color.Black,
                        fontSize = 11.ssp,
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily(Font(R.font.ralsemibo))
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.sdp)) // Optional spacing between buttons
            Button(
                onClick = { /* Handle Voice button click */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier.border(
                    1.sdp,
                    Color(0xff63A7D4),
                    shape = RoundedCornerShape(7.sdp)
                )
            ) {
                Row {
                    Image(
                        painter = painterResource(
                            id = R.drawable.pikeicon,
                        ),
                        contentDescription = "",
                        modifier = Modifier.size(13.sdp)
                    )
                    Spacer(modifier = Modifier.padding(start = 3.sdp))
                    Text(
                        text = "Voice",
                        color = Color.Black,
                        fontSize = 11.ssp,
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily(Font(R.font.ralsemibo))
                    )
                }
            }
        }
    }

}

