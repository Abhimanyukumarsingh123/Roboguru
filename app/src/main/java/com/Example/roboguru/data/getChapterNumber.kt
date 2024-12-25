package com.Example.roboguru.data

import androidx.compose.runtime.Composable
import com.Example.roboguru.R

@Composable
fun getChapterNumber(): List<TopicItem> {
    return listOf(
        TopicItem(
            chapter = "Chapter 1",
            time = "2h",
            topicName = "Introduction to Euclid’s Geometry Questions",
            Colorabc = 0xffFFEBEB.toInt()

        ),
        TopicItem(
            chapter = "Chapter 2",
            time = "5h",
            topicName = "Linear Equations in Two Variables Questions",
            Colorabc = 0xffFFF5EB.toInt()
        ),
        TopicItem(
            chapter = "Chapter 3",
            time = "4m",
            topicName = "Lines and Angles Questions",
            Colorabc = 0xFFFFEBEB.toInt() // Example ARGB color

        ),
        TopicItem(
            chapter = "Chapter 4",
            time = "4h",
            topicName = "Surface Areas and Volumes Questions",
            Colorabc = 0xffEEFFEB.toInt()
        ),
        TopicItem(
            chapter = "Chapter 5",
            time = "15m",
            topicName = "Heron’s Formula Questions",
            Colorabc = 0xffEBFCFF.toInt()
        ),
        TopicItem(
            chapter = "Chapter 6",
            time = "5h",
            topicName = "Linear Equations in Two Variables Questions",
            Colorabc = 0xffEDEBFF.toInt()

        ),
        TopicItem(
            chapter = "Chapter 7",
            time = "5h",
            topicName = "Linear Equations in Two Variables Questions",
            Colorabc = 0xffFDEBFF.toInt()
        ),
        TopicItem(
            chapter = "Chapter 8",
            time = "14m",
            topicName = "Linear Equations in Two Variables Questions",
            Colorabc = 0xffEDEBFF.toInt()
        ),
    )
}