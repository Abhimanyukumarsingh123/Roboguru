package com.Example.roboguru.presentation.ui.subject.component

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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.Example.roboguru.data.getChapterNumber
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun CHapterBox(modifier: Modifier) {

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
                    .padding(top = 0.sdp, start = 15.sdp, end = 15.sdp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.textimg),
                    contentDescription = null,
                    modifier = Modifier
                        .size(70.sdp)
                        .padding(start = 12.sdp)
                )
                Text(
                    text = buildAnnotatedString {
                        append("Choose ")
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
                            append("a Topic to Dive In")
                        }
                    },
                    modifier = Modifier.padding(bottom = 0.sdp, top = 20.sdp),
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF000000),
                    fontSize = 16.ssp,
                    textAlign = TextAlign.Center,
                )
            }
            Topic(modifier)

        }
    }
}


@Composable
fun Topic(modifier: Modifier) {
    val TopicItem = getChapterNumber()

    LazyColumn(
        modifier = modifier.fillMaxWidth(),
    ) {
        items(TopicItem) { topicItem ->
            MainChatBox(
                Chapter = topicItem.chapter,
                timeH = topicItem.time,
                topicName = topicItem.topicName,
                Colordata = topicItem.Colorabc
            )
        }
    }
}

@Composable
fun MainChatBox(Chapter: String, topicName: String, timeH: String, Colordata: Int) {
    val blueGradient = Brush.verticalGradient(
        colors = listOf(Color(0xff63A7D4), Color(0xffF295BE))
    )
    val blueGradient1 = Brush.verticalGradient(
        colors = listOf(Color(0xffF295BE), Color(0xff63A7D4))
    )

    Card(
        modifier = Modifier
            .padding(bottom = 10.sdp, start = 20.sdp, end = 20.sdp)
            .height(80.sdp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(blueGradient)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 10.sdp)
                    .background(color = Color(Colordata))
            )

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

                Row(modifier = Modifier.fillMaxWidth()) {
                    Spacer(modifier = Modifier.padding(start = 5.sdp, top = 5.sdp))
                    Image(
                        painter = painterResource(
                            id = R.drawable.abcimg,
                        ),
                        contentDescription = "",
                        modifier = Modifier.size(12.sdp)
                    )
                    Spacer(modifier = Modifier.padding(start = 5.sdp))
                    Text(
                        text = Chapter,
                        color = Color.Black,
                        fontSize = 14.ssp,
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Italic, // Set text style to italic
                        modifier = Modifier.weight(1f) // Push the icon to the end

                    )
                    Text(
                        text = timeH,
                        color = Color.Black,
                        fontSize = 9.ssp,
                        modifier = Modifier
                            .padding(end = 20.sdp),
                        textAlign = TextAlign.End,
                    )

                }
                Text(
                    text = topicName,
                    color = Color.Black,
                    fontSize = 14.ssp,
                    modifier = Modifier
                        .padding(start = 7.sdp, end = 5.sdp),
                    textAlign = TextAlign.Start,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.padding(top = 5.sdp))
                Text(
                    text = "Get Solution Now >>",
                    style = TextStyle(
                        brush = blueGradient1,
                        fontSize = 14.ssp,
                        textAlign = TextAlign.Start
                    ),
                    modifier = Modifier
                        .padding(start = 7.sdp, end = 5.sdp)
                        .clickable { /* Handle click here */ }
                )

            }
        }
    }
}
