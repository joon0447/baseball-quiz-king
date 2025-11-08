package studio.daily.baseeball_quiz.feature.result.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ResultScreen(
    correctCount: Int,
    totalCount: Int,
    onRetryClick: () -> Unit,
    onHomeClick: () -> Unit,
) {
    val score = correctCount * 10
    val successColor = Color(0xFF00C853)
    val softGreen = Color(0xFFE8F5E9)

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF00C853))
            .padding(top = 48.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
//        Icon(
//            Icons.Default.PlayArrow,
//        )
        Text(
            text = "퀴즈 완료!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(Modifier.height(32.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(Color.White)
                .padding(vertical = 32.dp),
            contentAlignment = Alignment.Center
        ) {
            Column (horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "최종 점수", fontSize = 14.sp, color = Color.Gray)
                Spacer(Modifier.height(8.dp))
                Text(text = "${score}점", fontSize = 40.sp, fontWeight = FontWeight.Bold, color = Color(0xFF00C853))
                Spacer(Modifier.height(24.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(softGreen)
                        .padding(horizontal = 24.dp, vertical = 12.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.CheckCircle,
                            contentDescription = "정답",
                            tint = successColor,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(Modifier.width(8.dp))
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("정답", fontSize = 14.sp, color = Color.Black)
                            Text("$correctCount/$totalCount", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }

        Spacer(Modifier.height(32.dp))

        Button(
            onClick = onRetryClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            shape = RoundedCornerShape(12.dp),
            elevation = ButtonDefaults.elevatedButtonElevation(0.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Refresh,
                contentDescription = "다시 도전",
                tint = Color(0xFF00C853)
            )
            Spacer(Modifier.width(8.dp))
            Text(
                text = "다시 도전하기",
                color = Color(0xFF00C853),
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(Modifier.height(16.dp))

        Button(
            onClick = onHomeClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF424242)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "홈으로",
                tint = Color.White
            )
            Spacer(Modifier.width(8.dp))
            Text(
                text = "홈으로",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}