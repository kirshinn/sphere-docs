package ru.letovo.sphere.docs.presentation.documents.card

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavHostController

@Composable
fun DocumentScreen(
    navController: NavHostController,
    viewModel: DocumentViewModel,
) {

    val state = viewModel.state.collectAsState()
    
    Document()

}

@Composable
fun Document() {
    Text(text = "Document")
}