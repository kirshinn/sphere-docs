package ru.letovo.sphere.docs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.letovo.sphere.docs.presentation.SetupNavGraph
import ru.letovo.sphere.docs.ui.theme.SphereDocsTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SphereDocsTheme {
                navController = rememberNavController()
                SphereDocsApp(navController)
            }
        }
    }
}

@Composable
fun SphereDocsApp(navController: NavHostController) {
    SetupNavGraph(navController = navController)
}