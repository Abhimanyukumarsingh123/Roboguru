package com.Example.roboguru.presentation.ui.chat.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Example.roboguru.R
import com.Example.roboguru.data.ChatMesssage
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun MessageBox(message: ChatMesssage) {
    // Access the isMe property correctly from the message object
    val textColor = if (message.isMe) Color.White else Color(0xCC000000)

    val backgroundModifier = if (message.isMe) {
        Modifier
            .padding(start = 11.sdp, end = 6.sdp)
            .defaultMinSize(minHeight = 40.sdp)
            .clip(RoundedCornerShape(topEnd = 15.sdp, topStart = 15.sdp, bottomStart = 15.sdp))
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xff63A7D4),
                        Color(0xff63A7D4),
                    )
                )
            )
    } else {
        Modifier
            .padding(start = 7.sdp, end = 11.sdp)
            .defaultMinSize(minHeight = 40.sdp)
            .clip(RoundedCornerShape(topEnd = 15.sdp, bottomStart = 15.sdp, bottomEnd = 15.sdp))
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFEAEAEA),
                        Color(0xFFEAEAEA),
                    )
                )
            )
    }

    val boxArrangement = if (message.isMe) Alignment.CenterEnd else Alignment.CenterStart

    Box(
        modifier = Modifier
            .padding(vertical = 7.sdp)
            .fillMaxWidth(),
        contentAlignment = boxArrangement
    ) {
        Row(
            verticalAlignment = Alignment.Bottom,
        ) {
            Column(modifier = Modifier) {
                Box(
                    modifier = backgroundModifier,
                    contentAlignment = Alignment.TopStart
                ) {
                    Column(
                        modifier = Modifier.padding(6.sdp),
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Center

                    ) {
                        Text(
                            text = message.message,
                            style = TextStyle(
                                color = textColor, // Use the dynamic text color
                                fontSize = 13.ssp,
                            ),
                            fontFamily = FontFamily(Font(R.font.ralsemibo))
                        )
                        Spacer(modifier = Modifier.height(7.sdp))

                    }
                }
                Text(
                    text = message.time,
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 9.ssp,
                    ),
                    fontFamily = FontFamily(Font(R.font.ralsemibo)),
                            modifier = Modifier
                        .padding(horizontal = 8.sdp)
                        .align(if (message.isMe) Alignment.End else Alignment.Start) // Dynamic alignment
                )
            }
        }
    }
}
