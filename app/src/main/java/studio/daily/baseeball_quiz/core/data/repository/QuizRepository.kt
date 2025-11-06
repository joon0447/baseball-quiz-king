package studio.daily.baseeball_quiz.core.data.repository

import studio.daily.baseeball_quiz.core.model.Quiz
import studio.daily.baseeball_quiz.feature.createquiz.model.Difficulty

object QuizRepository {

    private val quizList: List<Quiz> = buildList {
        addAll(easyQuizList)
        addAll(normalQuizList)
        addAll(hardQuizList)
    }

    fun getAllQuizzes(): List<Quiz> = quizList

    fun getQuizzesByDifficulty(difficulty: Difficulty): List<Quiz> {
        return quizList.filter { it.difficulty == difficulty }
    }
}