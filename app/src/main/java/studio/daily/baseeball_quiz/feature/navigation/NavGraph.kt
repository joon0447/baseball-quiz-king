package studio.daily.baseeball_quiz.feature.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import studio.daily.baseeball_quiz.feature.createquiz.model.Difficulty
import studio.daily.baseeball_quiz.feature.createquiz.view.CreateQuizScreen
import studio.daily.baseeball_quiz.feature.home.view.HomeScreen
import studio.daily.baseeball_quiz.feature.quiz.view.QuizScreen
import studio.daily.baseeball_quiz.feature.result.view.ResultScreen

object Routes {
    const val HOME = "home"
    const val CREATE_QUIZ = "create_quiz"
    const val QUIZ = "quiz"
    const val PARAM_DIFFICULTY = "difficulty"
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
                onNextClick = { difficulty -> navController.navigate("${Routes.QUIZ}/${difficulty.name}")}
            )
        }

        composable(
            route = "${Routes.QUIZ}/{${Routes.PARAM_DIFFICULTY}}",
            arguments = listOf(navArgument(Routes.PARAM_DIFFICULTY) {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            val difficultyStr = backStackEntry.arguments?.getString(Routes.PARAM_DIFFICULTY)
            val difficulty = Difficulty.valueOf(difficultyStr ?: Difficulty.NORMAL.name)
            QuizScreen(
                difficulty = difficulty,
                onBackClick = { navController.popBackStack() },
                onQuizFinished = {correctCount, totalCount ->
                    navController.navigate("result?correct=$correctCount&total=$totalCount")
                }
            )
        }

        composable(
            route = "result?correct={correct}&total={total}",
            arguments = listOf(
                navArgument("correct") { type = NavType.IntType },
                navArgument("total") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val correct = backStackEntry.arguments?.getInt("correct") ?: 0
            val total = backStackEntry.arguments?.getInt("total") ?: 10
            ResultScreen(
                correctCount = correct,
                totalCount = total,
                onRetryClick = { navController.navigate("quiz?difficulty=medium") },
                onHomeClick = { navController.popBackStack("home", inclusive = false) }
            )
        }
    }
}
