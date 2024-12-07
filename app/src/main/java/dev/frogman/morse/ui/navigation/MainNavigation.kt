package dev.frogman.morse.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun MainNavigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Route.Execute.name
    ) {
        composable(Route.Execute.name) {

        }
        composable(Route.Learning.name) {

        }
        composable(Route.Setting.name) {

        }
    }
}

enum class Route {
    Execute,
    Learning,
    Setting,
}