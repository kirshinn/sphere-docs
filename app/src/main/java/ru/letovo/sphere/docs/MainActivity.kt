package ru.letovo.sphere.docs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import ru.letovo.sphere.docs.presentation.home.HomeScreen
import ru.letovo.sphere.docs.ui.theme.SphereDocsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SphereDocsTheme {
                SphereDocsApp()
            }
        }
    }
}

@Composable
fun SphereDocsApp() {
    var shouldShowOnboarding by remember { mutableStateOf(true) }

    if (shouldShowOnboarding) {
        HomeScreen(onContinueClicked = { shouldShowOnboarding = false })
    } else {
        //
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SphereDocsTheme {
        SphereDocsApp()
    }
}