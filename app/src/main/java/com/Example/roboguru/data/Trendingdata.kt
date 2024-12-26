package com.Example.roboguru.data

data class TrendingItem(
    val backgroundResId: Int,
    val name: String,
    val Classes: String,
    val subject: String

)


data class TopicItem(
    val chapter: String,
    val time: String,
    val topicName: String,
    val Colorabc: Int // Adding color property
)

data class QuestionItem(
    val question: String,
    val number:String
)

data class suggestionQueItem(
    val SuggQue: String
)