package com.Example.roboguru.presentation.ui.detailscreen

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
import com.Example.roboguru.presentation.ui.detailscreen.component.DetailBar
import com.Example.roboguru.presentation.ui.detailscreen.component.DetailsTopBar
import com.Example.roboguru.presentation.ui.number.component.NumberTopBar
import com.Example.roboguru.presentation.ui.number.component.fillNumber

@Composable
fun DetailScreen(){
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
            DetailsTopBar(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .weight(.1f)
            )
            DetailBar(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .weight(.9f)
            )
        }
    }
}
