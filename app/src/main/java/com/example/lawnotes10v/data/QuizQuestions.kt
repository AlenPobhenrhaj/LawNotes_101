package com.example.lawnotes10v.data

data class QuizQuestion(
    val question: String,
    val options: MutableList<String>, // Mutable to shuffle later
    val correctAnswer: String,
    val explanation: String
)
object QuizRepository {
    val quizQuestions = mutableListOf(
        QuizQuestion(
            question = "Criminal Law is designed to:",
            options = mutableListOf(
                "Compensate victims",
                "Control behaviors of citizens",
                "Regulate international trade",
                "Something else"
            ),
            correctAnswer = "Control behaviors of citizens",
            explanation = "Criminal Law sets standards for permissible behavior within a society."
        ),
        QuizQuestion(
            question = "In Criminal Law, who prosecutes the defendant?",
            options = mutableListOf(
                "The victim",
                "A jury",
                "The State",
                "None of the above"
            ),
            correctAnswer = "The State",
            explanation = "In criminal proceedings, the state is responsible for prosecuting individuals accused of crimes."
        ),
        QuizQuestion(
            question = "Actus reus refers to:",
            options = mutableListOf(
                "The guilty mind",
                "The criminal act",
                "The legal duty",
                "None of the above"
            ),
            correctAnswer = "The criminal act",
            explanation = "Actus reus is the physical act of committing a crime, a fundamental component of criminal liability."
        )
        // Add the rest of your questions here...
    )
}
