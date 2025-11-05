package studio.daily.baseeball_quiz.feature.createquiz.view

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import studio.daily.baseeball_quiz.feature.createquiz.model.Difficulty
import studio.daily.baseeball_quiz.feature.createquiz.viewmodel.CreateQuizViewModel
import studio.daily.baseeball_quiz.ui.theme.Pretendard

@Composable
fun CreateQuizScreen(
    viewModel: CreateQuizViewModel = CreateQuizViewModel(),
    onBackClick: () -> Unit,
    onNextClick: () -> Unit
) {
    val selectedDifficulty by viewModel.selectedDifficulty.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 28.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = onBackClick) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "문제 생성", fontFamily = Pretendard, fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "문제 난이도를 선택해주세요.",
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF111827),
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "생성될 문제의 난이도를 선택해주세요.",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF6B7280),
        )
        Spacer(modifier = Modifier.height(32.dp))

        Difficulty.values().forEach { difficulty ->
            val isSelected = difficulty == selectedDifficulty
            DifficultyOptionCard(
                difficulty = difficulty,
                isSelected = isSelected,
                onClick = { viewModel.selectDifficulty(difficulty) }
            )
            Spacer(modifier = Modifier.height(16.dp))
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = onNextClick, modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3))
        ) {
            Text(text = "다음으로", color = Color.White, fontWeight = FontWeight.Bold, fontFamily = Pretendard)
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
private fun DifficultyOptionCard(
    difficulty: Difficulty,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val borderColor = if (isSelected) Color(0xFFFF9800) else Color.LightGray
    val backgroundColor = if (isSelected) Color(0xFFFFF3E0) else Color(0xFFF7F7F7)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(backgroundColor)
            .clickable { onClick }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = difficulty.iconResId),
            contentDescription = difficulty.label,
            modifier = Modifier.size(40.dp)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(text = difficulty.label, fontWeight = FontWeight.Bold, fontFamily = Pretendard)
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = difficulty.description,
                fontWeight = FontWeight.Medium,
                fontFamily = Pretendard
            )
        }

        RadioButton(
            selected = isSelected, onClick = onClick
        )
    }
}