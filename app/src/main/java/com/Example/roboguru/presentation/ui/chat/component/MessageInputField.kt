package com.Example.roboguru.presentation.ui.chat.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Example.roboguru.R
import com.Example.roboguru.data.getSuggQuestion
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MessageInputField() {
    val message = remember { mutableStateOf("") }

    val trendingItems = getSuggQuestion() // Use camelCase for variable names

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color(0xFFFFFFFF),
                shape = RoundedCornerShape(topEnd = 20.sdp, topStart = 20.sdp)
            )
            .padding(horizontal = 14.sdp),
        horizontalArrangement = Arrangement.spacedBy(6.sdp)
    ) {
        items(trendingItems) { question ->
            QuestionBox(
                question1=question.SuggQue
            )
        }
    }

    Spacer(modifier = Modifier.padding(top = 7.sdp))
    TextField(
        value = message.value,
        onValueChange = { message.value = it },
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding()
            .imePadding(),
        textStyle = TextStyle(
            color = Color(0x80000000),
            fontSize = 13.ssp,
            fontFamily = FontFamily(Font(R.font.ralsemibo))
        ),
        placeholder = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 4.sdp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.scanicon),
                    contentDescription = "Scan icon",
                    modifier = Modifier.clickable { }
                )
                Spacer(modifier = Modifier.width(7.sdp))
                Text(
                    text = "Type something",
                    style = TextStyle(
                        color = Color(0x80000000),
                        fontSize = 13.ssp,
                    ),
                    fontFamily = FontFamily(Font(R.font.ralsemibo))
                )
            }
        },
        trailingIcon = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.sdp),
                modifier = Modifier.padding(end = 8.sdp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.mikeimg),
                    contentDescription = "Mic icon 1",
                    modifier = Modifier.clickable { }
                )
                Spacer(modifier = Modifier.padding(start = 5.sdp))
                Image(
                    painter = painterResource(id = R.drawable.chatgptmic),
                    contentDescription = "Mic icon 2",
                    modifier = Modifier.clickable { }
                )
            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Done
        ),
        singleLine = true,
        shape = RoundedCornerShape(50),
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color(0xFFDBDBDB),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
        )
    )
}


@Composable
fun QuestionBox(question1: String) {

    Text(
        text = question1,
        style = TextStyle(
            color = Color(0xCC000000),
            fontSize = 12.ssp
        ),
        fontFamily = FontFamily(Font(R.font.ralsemibo)),
        modifier = Modifier
            .clip(RoundedCornerShape(7.sdp))
            .background(Color(0x3363A7D4))
            .border(
                1.sdp,
                Color(0xff63A7D4),
                shape = RoundedCornerShape(7.sdp),
            )
            .padding(horizontal = 11.sdp, vertical = 6.sdp)
            .clickable {

            }
    )
}