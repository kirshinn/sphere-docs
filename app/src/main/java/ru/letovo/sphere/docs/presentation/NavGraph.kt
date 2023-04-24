package ru.letovo.sphere.docs.presentation

import androidx.camera.core.ExperimentalGetImage
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import ru.letovo.sphere.docs.presentation.code.CodeScreen
import ru.letovo.sphere.docs.presentation.code.CodeViewModel
import ru.letovo.sphere.docs.presentation.documents.card.DocumentCardScreen
import ru.letovo.sphere.docs.presentation.documents.card.DocumentCardViewModel
import ru.letovo.sphere.docs.presentation.documents.list.DocumentsListScreen
import ru.letovo.sphere.docs.presentation.documents.list.DocumentsListViewModel
import ru.letovo.sphere.docs.presentation.home.HomeScreen
import ru.letovo.sphere.docs.presentation.home.HomeViewModel

@ExperimentalGetImage
@ExperimentalPermissionsApi
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
            route = Screen.Code.route
        ) {
            CodeScreen(navController = navController, viewModel = CodeViewModel())
        }

        composable(
            route = Screen.DocumentsList.route
        ) {
            DocumentsListScreen(navController = navController, viewModel = DocumentsListViewModel())
        }

        composable(
            route = Screen.DocumentCard.route
        ) {
            DocumentCardScreen(navController = navController, viewModel = DocumentCardViewModel())
        }

    }
}