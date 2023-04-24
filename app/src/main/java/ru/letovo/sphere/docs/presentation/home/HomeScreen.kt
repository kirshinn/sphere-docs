package ru.letovo.sphere.docs.presentation.home

import android.Manifest
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberPermissionState
import ru.letovo.sphere.docs.presentation.Screen

@ExperimentalPermissionsApi
@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel
) {

    val state = viewModel.state.collectAsState()
    val cameraPermissionState = rememberPermissionState(permission = Manifest.permission.CAMERA)

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
                cameraPermissionState.launchPermissionRequest()
                navController.navigate(route = Screen.Code.route)
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