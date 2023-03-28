package ru.letovo.sphere.docs.presentation.documents.list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.letovo.sphere.docs.presentation.Screen
import ru.letovo.sphere.docs.presentation.home.HomeViewModel

@Composable
fun DocumentsListScreen(
    viewModel: DocumentsListViewModel = hiltViewModel(),
    navController: NavHostController
) {

    val state = viewModel.state.collectAsState()

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.Home.route)
            },
            text = state.value.documentsListScreenName
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DocumentsListScreenPreview(
    viewModel: HomeViewModel = hiltViewModel(),
    navController: NavHostController = rememberNavController()
) { }