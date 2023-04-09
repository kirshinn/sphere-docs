package ru.letovo.sphere.docs.presentation.documents.card

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavHostController

@Composable
fun DocumentCardScreen(
    navController: NavHostController,
    viewModel: DocumentCardViewModel,
) {

    val state = viewModel.state.collectAsState()
    
    DocumentCard()

}

@Composable
fun DocumentCard() {
    Text(text = "Document")
}