package dev.frogman.morse.ui.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dev.frogman.morse.ui.navigation.MainDestination

private data class TopLevelRoute<T : Any>(val name: String, val route: T, val icon: ImageVector)

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val topLevelRoutes = listOf(
        TopLevelRoute("Home",MainDestination.Home,Icons.Filled.Home),
        TopLevelRoute("Info",MainDestination.Learn,Icons.Filled.Info),
        TopLevelRoute("Setting",MainDestination.Setting,Icons.Filled.Settings),
    )

    NavigationBar {
        topLevelRoutes.forEach { topLevelRoute ->
            NavigationBarItem(
                icon = { Icon(topLevelRoute.icon, topLevelRoute.name) },
                label = { Text(topLevelRoute.name) },
                selected = currentDestination?.hasRoute(topLevelRoute.route::class) == true,
                onClick = {
                    navController.navigate(topLevelRoute.route) {
                        launchSingleTop = true
                        popUpTo(MainDestination.Home)
                    }
                }
            )
        }
    }
}

@Preview
@Composable
private fun BottomNavigationBarPreview() {
    BottomNavigationBar(rememberNavController())
}