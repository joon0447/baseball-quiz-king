package studio.daily.baseeball_quiz.feature.createquiz.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import studio.daily.baseeball_quiz.feature.createquiz.model.Difficulty

class CreateQuizViewModel : ViewModel() {

    private val _selectedDifficulty = MutableStateFlow(Difficulty.NORMAL)
    var selectedDifficulty: StateFlow<Difficulty> = _selectedDifficulty

    fun selectDifficulty(difficulty: Difficulty) {
        _selectedDifficulty.value = difficulty
    }
}