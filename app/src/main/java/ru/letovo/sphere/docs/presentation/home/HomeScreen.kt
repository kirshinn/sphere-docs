package ru.letovo.sphere.docs.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.letovo.sphere.docs.R
import ru.letovo.sphere.docs.presentation.Screen

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel
) {

    val state = viewModel.state.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = state.value.homeScreenName,
            style = TextStyle(
                fontSize = 36.sp
            )
        )
        Button(
            modifier = Modifier.padding(vertical = 24.dp),
            onClick = {
                navController.navigate(route = Screen.DocumentsList.route)
            }
        ) {
            Text(
                text = state.value.homeScreenButton,
                style = TextStyle(
                    fontSize = 16.sp
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(
    navController: NavHostController = rememberNavController()
) { }