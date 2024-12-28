package com.Example.roboguru.data

import androidx.compose.runtime.Composable
import com.Example.roboguru.R

@Composable
fun getHomeSubject(): List<HomeSubjectItem> {
    return listOf(
        HomeSubjectItem(
            cardResId = R.drawable.imagecard,
            description = "Solve, Analyze, and Explore " +
                    "Numbers"
        ),
        HomeSubjectItem(
            cardResId = R.drawable.backgroundimg,
            description = "Solve, Analyze, and Explore " +
                    "Numbers"
        ),
        HomeSubjectItem(
            cardResId = R.drawable.imagecard,
            description = "Solve, Analyze, and Explore " +
                    "Numbers"
        ),
        HomeSubjectItem(
            cardResId = R.drawable.imagecard,
            description = "Solve, Analyze, and Explore " +
                    "Numbers"
        ),
        HomeSubjectItem(
            cardResId = R.drawable.cardclassimg,
            description = "Solve, Analyze, and Explore " +
                    "Numbers"
        ),
        HomeSubjectItem(
            cardResId = R.drawable.cardclassimg,
            description = "Solve, Analyze, and Explore " +
                    "Numbers"
        ),
        HomeSubjectItem(
            cardResId = R.drawable.cardclassimg,
            description = "Solve, Analyze, and Explore " +
                    "Numbers"
        ),
        HomeSubjectItem(
            cardResId = R.drawable.cardclassimg,
            description = "Solve, Analyze, and Explore\n" +
                    "Numbers"
        ),
    )
}