package com.Example.roboguru.data

import androidx.compose.runtime.Composable
import com.Example.roboguru.R

@Composable
fun getChatItems(): List<TrendingItem> {
    return listOf(
        TrendingItem(
            R.drawable.classlaptopimg,
            name = "The World of Living \n" +
                    "Things",
            Classes = "Unlocking the Secrets of Arithmetic, \n" +
                    "Algebra, and Geometry",
            subject = "Science: Class VII"
        ),
        TrendingItem(
            R.drawable.classlaptopimg,
            name = "The World of Living \n" +
                    "Things",
            Classes = "From Cells to Ecosystems:Understanding \n" +
                    "Life on Earth",
            subject = "Science: Class VII"

        ),
    )
}