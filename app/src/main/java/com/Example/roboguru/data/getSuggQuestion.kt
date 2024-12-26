package com.Example.roboguru.data

import androidx.compose.runtime.Composable

@Composable
fun getSuggQuestion(): List<suggestionQueItem> {
    return listOf(
        suggestionQueItem(
            SuggQue = "How do I Create a New Topic of Robo Guru?"
        ),
        suggestionQueItem(
            "CBSE Class 9 Mathematics",
        ),
        suggestionQueItem(
            "Physics Sample Questions",
        ),
        suggestionQueItem(
            "Chapter 5: Electric Current",
        ),
        suggestionQueItem(
            "What is Robotics?"
        ),
    )
}