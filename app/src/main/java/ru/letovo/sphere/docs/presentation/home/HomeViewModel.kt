package ru.letovo.sphere.docs.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
): ViewModel() {

    private val _state = MutableStateFlow(HomeScreenState())
    val state = _state.asStateFlow()

    fun startScanning() {
        viewModelScope.launch {
//            repo.startScanning().collect{
//                if (!it.isNullOrBlank()){
//                    _state.value = state.value.copy(
//                        details = it
//                    )
//                }
//            }
        }
    }
}