package studio.daily.baseeball_quiz.feature.quiz.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import studio.daily.baseeball_quiz.core.data.repository.QuizRepository
import studio.daily.baseeball_quiz.core.model.Quiz
import studio.daily.baseeball_quiz.feature.createquiz.model.Difficulty

class QuizViewModel(difficulty: Difficulty): ViewModel() {

    private val _quizList = QuizRepository
        .getQuizzesByDifficulty(difficulty)
        .shuffled()
        .take(10)

    private val _currentIndex = MutableStateFlow(0)
    val currentIndex: StateFlow<Int> = _currentIndex

    val currentQuiz: Quiz
        get() = _quizList[_currentIndex.value]

    private val _selectedOption = MutableStateFlow<Int?>(null)
    val selectedOption: StateFlow<Int?> = _selectedOption

    private val _isAnswerRevealed = MutableStateFlow(false)
    val isAnswerRevealed: StateFlow<Boolean> = _isAnswerRevealed

    private var correctAnswerCount = 0

    fun selectOption(index: Int) {
        _selectedOption.value = index
    }

    fun revealAnswer() {
        if(!_isAnswerRevealed.value) {
            if(_selectedOption.value == currentQuiz.answerIndex) {
                correctAnswerCount++
            }
        }
        _isAnswerRevealed.value = true
    }

    fun nextQuestion() {
        if(_currentIndex.value < _quizList.size -1) {
            _currentIndex.value++
            _selectedOption.value = null
            _isAnswerRevealed.value = false
        }
    }

    fun getProgress(): Float {
        return (_currentIndex.value + 1).toFloat() / _quizList.size
    }

    fun getQuizNumberText(): String {
        return "문제 ${_currentIndex.value + 1}/${_quizList.size}"
    }
}