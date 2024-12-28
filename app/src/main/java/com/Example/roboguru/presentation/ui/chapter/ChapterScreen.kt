package com.Example.roboguru.presentation.ui.chapter

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.Example.roboguru.R
import com.Example.roboguru.presentation.ui.chapter.component.ChapterTopBar
import com.Example.roboguru.presentation.ui.chapter.component.TopicBox
import com.Example.roboguru.presentation.ui.subject.component.SubjectTopBar
import com.Example.roboguru.presentation.ui.subject.component.CHapterBox

@Composable
fun ChapterScreen(){
    Box(
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxSize(),
    ) {
        Image(
            painter = painterResource(id = R.drawable.backgroundimg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            ChapterTopBar(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .weight(.2f)
            )
            TopicBox(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .weight(.8f)
            )
        }
    }

}