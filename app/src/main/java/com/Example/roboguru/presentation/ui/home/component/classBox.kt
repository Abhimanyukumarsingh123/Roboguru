package com.Example.roboguru.presentation.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import com.Example.roboguru.data.getChatItems
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun ClassBox(modifier: Modifier) {

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
                .padding(top = 0.sdp, start = 15.sdp, end = 15.sdp)
        ) {
            Box(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.textimg),
                    contentDescription = null,
                    modifier = Modifier
                        .size(70.sdp)
                        .padding(start = 12.sdp)
                )
                Text(
                    text = buildAnnotatedString {
                        append("Trending ")
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
                            append("Topics for You")
                        }
                    },
                    modifier = Modifier.padding(bottom = 0.sdp, top = 20.sdp),
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF000000),
                    fontSize = 16.ssp,
                    textAlign = TextAlign.Center,
                )
            }
            ChatBox(modifier = Modifier)
            Box(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.textimg),
                    contentDescription = null,
                    modifier = Modifier
                        .size(70.sdp)
                        .padding(start = 12.sdp)
                )
                Text(
                    text = buildAnnotatedString {
                        append("Explore ")
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
                            append("Your Class Journey")
                        }
                    },
                    modifier = Modifier.padding(bottom = 0.sdp, top = 20.sdp),
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF000000),
                    fontSize = 16.ssp,
                    textAlign = TextAlign.Center,
                )
            }

        }
    }
}


@Composable
fun ChatBox(modifier: Modifier) {
    val TrendingItem = getChatItems()

    LazyRow(
        modifier = modifier.fillMaxWidth(),
    ) {
        items(TrendingItem) { chatItem ->
            MainChatBox(
                imageResId = chatItem.backgroundResId,
                name = chatItem.name,
                Classes = chatItem.Classes,
                Subject=chatItem.subject
            )
        }
    }
}

@Composable
fun MainChatBox(
    imageResId: Int, name: String, Classes: String, Subject: String,
) {
    Card(
        modifier = Modifier
            .padding(start = 10.sdp, end = 10.sdp)
            .height(155.sdp)
            .width(250.sdp),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(10.dp), // Optional: Set elevation if needed
        colors = CardDefaults.cardColors(containerColor = Color(0xffffffff))
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
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
                Text(
                    text = name,
                    color = Color.Black,
                    fontSize = 17.ssp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start,
                    overflow = TextOverflow.Ellipsis

                )
                Spacer(modifier = Modifier.padding(top = 20.dp))

                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(14.sdp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .padding(bottom = 8.sdp)
                        .align(Alignment.Start)
                        .background(color = Color.White, shape = RoundedCornerShape(20.sdp))
                        .size(width = 80.sdp, height = 30.sdp)

                ) {
                    Text(
                        text = "Try now",
                        modifier = Modifier.fillMaxSize(),
                        color = Color(0xff468CBA),
                        fontSize = 10.ssp
                    )
                }
                Spacer(modifier = Modifier.padding(top = 4.dp))
                Text(
                    text = Classes,
                    color = Color.Black,
                    fontSize = (13.ssp),
                    modifier = Modifier.padding(start = 5.sdp, end = 5.sdp),
                    style = TextStyle(fontStyle = FontStyle.Italic)
                )
                Text(
                    text = Subject,
                    color = Color.Black,
                    fontSize = (13.ssp),
                    modifier = Modifier.padding(start = 5.sdp, end = 5.sdp),
                    style = TextStyle(fontStyle = FontStyle.Italic)
                )
            }
        }
    }
}