package studio.daily.baseeball_quiz.feature.quiz.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import studio.daily.baseeball_quiz.feature.createquiz.model.Difficulty
import studio.daily.baseeball_quiz.feature.quiz.viewmodel.QuizViewModel
import studio.daily.baseeball_quiz.ui.theme.Blue20
import studio.daily.baseeball_quiz.ui.theme.Blue80
import studio.daily.baseeball_quiz.ui.theme.Pretendard



@Composable
fun QuizScreen(difficulty: Difficulty, onBackClick: () -> Unit) {
    val viewModel = remember { QuizViewModel(difficulty) }
    val selectedOption by viewModel.selectedOption.collectAsState()
    val currentIndex by viewModel.currentIndex.collectAsState()

    val quiz = viewModel.currentQuiz
    val statusBarHeight = WindowInsets.statusBars.asPaddingValues().calculateTopPadding()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .navigationBarsPadding()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Blue20)
                .padding(top = statusBarHeight)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = onBackClick) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "뒤로가기", tint = Color.White)
                }
                Spacer(Modifier.width(8.dp))
                Text("문제",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Pretendard,
                    color = Color.White)
            }
        }
        Column (
            modifier = Modifier.padding(28.dp)
        ){
            Spacer(Modifier.height(16.dp))


            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Text(text = viewModel.getQuizNumberText())
                Spacer(Modifier.weight(1f))
                Text(text = "진행률: ${(viewModel.getProgress() * 100).toInt()}%")
            }

            // 진행률 바
            LinearProgressIndicator(
                progress = viewModel.getProgress(),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(6.dp)
                    .clip(RoundedCornerShape(3.dp)),
                color = Color(0xFF1976D2)
            )

            Spacer(Modifier.height(24.dp))

            // 문제
            Text(
                text = quiz.question,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(Modifier.height(24.dp))

            // 보기들
            quiz.options.forEachIndexed { index, option ->
                val isSelected = selectedOption == index
                val borderColor = if (isSelected) Color(0xFF2196F3) else Color.LightGray
                val bgColor = if (isSelected) Color(0xFFE3F2FD) else Color(0xFFF8F9FA)

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(8.dp))
                        .background(bgColor)
                        .border(1.dp, borderColor, RoundedCornerShape(8.dp))
                        .clickable { viewModel.selectOption(index) }
                        .padding(16.dp)
                ) {
                    Text("${'A' + index}. $option", fontSize = 16.sp)
                }

                Spacer(Modifier.height(12.dp))
            }

            Spacer(modifier = Modifier.weight(1f))

            // 정답 확인하기
            Button(
                onClick = {
                    // TODO: 정답 확인 후 다음 문제 or 정답 해설로 이동
                    viewModel.nextQuestion()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3))
            ) {
                Text(
                    text = "정답 확인하기",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(Modifier.height(24.dp))
        }


    }
}