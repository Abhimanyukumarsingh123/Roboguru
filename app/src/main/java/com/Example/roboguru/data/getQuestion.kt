package com.Example.roboguru.data

import androidx.compose.runtime.Composable
import com.Example.roboguru.R

@Composable
fun gerQuestion(): List<QuestionItem> {
    return listOf(
        QuestionItem(
            question = "What is the \n" +
                    "Pythagorean theorem? \n" +
                    "Give an example.",
            number = "1st"
        ),
        QuestionItem(

            question = "What are the \n" +
                    "properties of rational \n" +
                    "numbers?",
            number = "2nd"
        ),
        QuestionItem(
            question = "What are the \n" +
                    "diffrent types of \n" +
                    "angles? Explain.",
            number = "3rd"
        )
    )
}