package com.example.lawnotes10v.data

data class QuizQuestion(
    val question: String,
    val options: MutableList<String>, // Mutable to shuffle later
    val correctAnswer: String,
    val explanation: String
)
