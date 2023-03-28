package ru.letovo.sphere.docs.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.letovo.sphere.docs.presentation.documents.list.DocumentsListScreen
import ru.letovo.sphere.docs.presentation.home.HomeScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.DocumentsList.route
        ) {
            DocumentsListScreen(navController = navController)
        }
    }
}