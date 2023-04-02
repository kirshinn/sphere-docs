package ru.letovo.sphere.docs.presentation.documents.list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun DocumentsListScreen(
    navController: NavHostController,
    viewModel: DocumentsListViewModel
) {

    val state = viewModel.state.collectAsState()
    val items = state.value.documentsList

    DocumentList(items)

}

@Composable
fun DocumentList(
    items: MutableList<Document>
) {
    LazyColumn(
        modifier = Modifier.padding(top = 20.dp)
    ) {
        items(items) { item ->
            Card(
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 4.dp)
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp)
                ) {
                    Text(
                        text = item.name,
                        modifier = Modifier
                            .align(Alignment.Center),
                        fontSize = 20.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DocumentsListScreenPreview(
    navController: NavHostController = rememberNavController()
) { }