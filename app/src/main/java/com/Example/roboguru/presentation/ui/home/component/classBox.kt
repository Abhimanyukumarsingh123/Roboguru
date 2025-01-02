package com.Example.roboguru.presentation.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.Example.roboguru.R
import com.Example.roboguru.data.getHomeSubject
import com.Example.roboguru.presentation.ui.home.dialogcomponent.ChangeProfile
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun ClassBox(modifier: Modifier) {
    var profileDialog by remember { mutableStateOf(false) }
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
                        .padding(start = 34.sdp, top = 11.sdp)
                        .size(40.sdp)
                )
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily(Font(R.font.ralextbold)),
                            )
                        ) {
                            append("Trending ")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Normal,
                                fontFamily = FontFamily(Font(R.font.ralsemibo))
                            )
                        ) {
                            append("Topics for you")
                        }
                    },
                    modifier = Modifier.padding(bottom = 0.sdp, top = 20.sdp),
                    color = Color(0xFF000000),
                    fontSize = 14.ssp,
                    textAlign = TextAlign.Center,
                )
            }
            ChatBox(modifier = Modifier)
            Spacer(modifier = Modifier.padding(top = 8.sdp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Higher Education | Class IX",
                        fontSize = 13.ssp,
                        color = Color(0xFF3A7FA9),
                        fontFamily = FontFamily(Font(R.font.ralsemibo))
                    )
                    Text(
                        text = "Empowering Learning with Ai Excellence",
                        fontSize = 10.ssp,
                        color = Color(0xFF454545),
                        fontFamily = FontFamily(Font(R.font.ralsemibo))
                    )
                }
                Button(
                    onClick = { profileDialog = true },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ), contentPadding = PaddingValues(0.dp), modifier = Modifier
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(Color(0xFCF295BE), Color(0xFF63A7D4))
                            ), shape = RoundedCornerShape(8.dp)
                        )
                        .size(width = 80.dp, height = 35.dp)
                ) {
                    Text(
                        text = "Change",
                        fontSize = 10.ssp,
                        fontFamily = FontFamily(Font(R.font.ralsemibo)),
                        color = Color.White
                    )
                }
            }
            Box(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.textimg),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 34.sdp, top = 11.sdp)
                        .size(40.sdp)
                )
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily(Font(R.font.ralextbold)),
                            )
                        ) {
                            append("Choose ")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Normal,
                                fontFamily = FontFamily(Font(R.font.ralsemibo))
                            )
                        ) {
                            append("a Subject to dive In")
                        }
                    },
                    modifier = Modifier.padding(bottom = 0.sdp, top = 20.sdp),
                    color = Color(0xFF000000),
                    fontSize = 14.ssp,
                    textAlign = TextAlign.Center,
                )
            }
            ClassCard(modifier = Modifier)

        }
        if (profileDialog) {
            ChangeProfile(
                onDismiss = { profileDialog = false }
            )
        }
    }
}

@Composable
fun ClassCard(modifier: Modifier) {
    val HomeSubjectItem = getHomeSubject()

    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // 2 cards per row
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp), // Add padding to the grid
        horizontalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(16.dp),
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(16.dp)
    ) {
        items(HomeSubjectItem) { homeitem ->
            MainClassBox(
                cardimg = homeitem.cardResId,
                Description = homeitem.description,
            )
        }
    }
}

@Composable
fun MainClassBox(Description: String, cardimg: Int) {
    Card(
        modifier = Modifier.size(120.sdp),// Fixed size for each card
        shape = RoundedCornerShape(18.sdp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xff6785C5))
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.7f)
                ) {
                    Image(
                        painter = painterResource(id = cardimg),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
                Text(
                    text = Description,
                    modifier = Modifier
                        .padding(
                            top = 3.sdp, start = 4.sdp, end = 4.sdp
                        ) // Tighter padding
                        .fillMaxWidth(),
                    color = Color.White,
                    lineHeight = 11.ssp,
                    fontSize = 10.ssp,
                    textAlign = TextAlign.Start,
                    maxLines = 2,
                    fontFamily = FontFamily(Font(R.font.ralmedium))
                )
            }
        }
    }
}


