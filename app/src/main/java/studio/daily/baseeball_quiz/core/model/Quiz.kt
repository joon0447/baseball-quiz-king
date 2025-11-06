package studio.daily.baseeball_quiz.core.model

import studio.daily.baseeball_quiz.feature.createquiz.model.Difficulty

data class Quiz(
    val id: Int,
    val difficulty: Difficulty,
    val question: String,
    val options: List<String>,
    val answerIndex: Int,
    val explanation: String
)