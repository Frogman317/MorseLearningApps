package dev.frogman.morse.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dev.frogman.morse.ui.component.BottomNavigationBar
import dev.frogman.morse.ui.navigation.MainNavigation

@Composable
fun HomeScreen() {

    val navController: NavHostController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),

        content = { innerPadding ->
            MainNavigation(
                modifier = Modifier.padding(innerPadding),
                navController = navController,
            )
        },

        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    )
}