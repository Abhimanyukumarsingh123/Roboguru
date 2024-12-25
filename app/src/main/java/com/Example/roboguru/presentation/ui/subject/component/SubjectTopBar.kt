package com.Example.roboguru.presentation.ui.subject.component

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
import com.Example.roboguru.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun SubjectTopBar(modifier: Modifier) {

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
                painter = painterResource(id = R.drawable.backicon),
                contentDescription = null,
                modifier = Modifier.size(20.sdp)
            )
            Text(
                text = "MATHEMATICS", style = TextStyle(
                    color = Color.White,
                    fontSize = 20.ssp,
                    fontWeight = FontWeight.Bold,
                ), textAlign = TextAlign.Start
            )
            Image(
                painter = painterResource(id = R.drawable.profileicon),
                contentDescription = null,
                modifier = Modifier.size(30.sdp)
            )
        }
        Spacer(modifier = Modifier.padding(top = 15.sdp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Find All Your Solutions in \n" + "One Place", style = TextStyle(
                    color = Color.White,
                    fontSize = 20.ssp,
                ), textAlign = TextAlign.Center
            )
        }
    }

}