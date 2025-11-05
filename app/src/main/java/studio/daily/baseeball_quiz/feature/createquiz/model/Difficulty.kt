package studio.daily.baseeball_quiz.feature.createquiz.model

import studio.daily.baseeball_quiz.R

enum class Difficulty(val label: String, val description: String, val iconResId: Int) {
    EASY("쉬움", "야구에 관심이 생기기 시작할 때", R.drawable.easy),
    NORMAL("보통", "야구 팬이라면 이 정도는 기본!", R.drawable.normal),
    HARD("어려움", "당신의 야구 지식은 어디까지 인가요?", R.drawable.hard)
}