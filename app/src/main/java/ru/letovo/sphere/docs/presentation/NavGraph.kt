package ru.letovo.sphere.docs.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.letovo.sphere.docs.presentation.documents.card.DocumentScreen
import ru.letovo.sphere.docs.presentation.documents.card.DocumentViewModel
import ru.letovo.sphere.docs.presentation.documents.list.DocumentsListScreen
import ru.letovo.sphere.docs.presentation.documents.list.DocumentsListViewModel
import ru.letovo.sphere.docs.presentation.home.HomeScreen
import ru.letovo.sphere.docs.presentation.home.HomeViewModel

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
            HomeScreen(navController = navController, viewModel = HomeViewModel())
        }

        composable(
            route = Screen.DocumentsList.route
        ) {
            DocumentsListScreen(navController = navController, viewModel = DocumentsListViewModel())
        }

        composable(
            route = Screen.Document.route
        ) {
            DocumentScreen(navController = navController, viewModel = DocumentViewModel())
        }

    }
}