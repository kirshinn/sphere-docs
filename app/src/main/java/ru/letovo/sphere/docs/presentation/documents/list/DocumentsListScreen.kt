package ru.letovo.sphere.docs.presentation.documents.list

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.letovo.sphere.docs.presentation.Screen

@Composable
fun DocumentsListScreen(
    navController: NavHostController,
    viewModel: DocumentsListViewModel,
) {

    val state = viewModel.state.collectAsState()
    val items = state.value.documentsList

    DocumentList(navController, items)

}

@Composable
fun DocumentList(
    navController: NavHostController,
    items: MutableList<Document>
) {

    val context = LocalContext.current

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

                    IconButton(
                        onClick = {
                            navController.navigate(route = Screen.DocumentCard.route)
                        }) {
                        Icon(
                            imageVector = Icons.Filled.Info,
                            contentDescription = item.title,
                            modifier = Modifier
                                .size(40.dp),
                        )
                    }

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