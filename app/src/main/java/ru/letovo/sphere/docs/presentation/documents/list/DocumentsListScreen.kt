package ru.letovo.sphere.docs.presentation.documents.list

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        modifier = Modifier.padding(vertical = 20.dp)
    ) {
        items(items) { item ->
            Card(
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 4.dp)
                    .fillMaxWidth()
            ) {

                Row(modifier = Modifier.padding(all = 8.dp)) {

                    Icon(
                        imageVector = Icons.Filled.AddCircle,
                        contentDescription = "",
                        modifier = Modifier
                            .size(40.dp)
                    )

//                    AsyncImage(
//                        model = item.image,
//                        contentDescription = null,
//                        modifier = Modifier
//                            .size(40.dp)
//                            .clip(CircleShape)
//                            .border(1.5.dp, MaterialTheme.colorScheme.secondary, CircleShape)
//                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Column {
                        Text(
                            text = item.category,
                            color = MaterialTheme.colorScheme.secondary
                        )

                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = item.title,
                        )
                    }
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