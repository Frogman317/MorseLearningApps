package dev.frogman.morse.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

sealed interface MainDestination {
    @Serializable data object Home: MainDestination
    @Serializable data object Learn: MainDestination
    @Serializable data object Setting: MainDestination
}

@Composable
fun MainNavigation(
    modifier: Modifier,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = MainDestination.Home
    ) {
        composable<MainDestination.Home> {

        }
        composable<MainDestination.Learn> {

        }
        composable<MainDestination.Setting> {

        }
    }
}

