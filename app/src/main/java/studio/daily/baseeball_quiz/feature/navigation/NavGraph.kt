package studio.daily.baseeball_quiz.feature.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import studio.daily.baseeball_quiz.feature.createquiz.view.CreateQuizScreen
import studio.daily.baseeball_quiz.feature.home.view.HomeScreen

object Routes {
    const val HOME = "home"
    const val CREATE_QUIZ = "create_quiz"
}

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.HOME,
        enterTransition = { fadeIn(animationSpec = tween(0)) },
        exitTransition = { fadeOut(animationSpec = tween(0)) }) {
        composable(Routes.HOME) {
            HomeScreen(onStartQuizClick = { navController.navigate(Routes.CREATE_QUIZ) })
        }

        composable(Routes.CREATE_QUIZ) {
            CreateQuizScreen(
                onBackClick = { navController.popBackStack() },
                onNextClick = {}
            )
        }
    }
}
