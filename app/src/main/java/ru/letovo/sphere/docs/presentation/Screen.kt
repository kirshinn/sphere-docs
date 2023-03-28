package ru.letovo.sphere.docs.presentation

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object DocumentsList: Screen(route = "documents_list_screen")
}