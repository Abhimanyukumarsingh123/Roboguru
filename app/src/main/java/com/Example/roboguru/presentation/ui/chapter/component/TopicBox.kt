package com.Example.roboguru.presentation.ui.chapter.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
            modifier = Modifier
                .fillMaxSize()
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
                question = questionItem.question,
                Number = questionItem.number
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
                .height(150.sdp)
                .width(100.sdp),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xffD9D9D9))
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
                    color = Color.Black,
                    fontSize = 15.ssp,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(4.dp) // Optional padding
                )

            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.sdp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = question,
                color = Color.Black,
                fontSize = 14.ssp,
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.Bold,
            )
            Row (modifier = Modifier.align(Alignment.BottomEnd)){
                Text(
                    text = "Hrllo",
                    color = Color.Black,
                    fontSize = 14.ssp,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "sdfmnf",
                    color = Color.Black,
                    fontSize = 14.ssp,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    }

}

