package ru.letovo.sphere.docs.presentation.code

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class CodeViewModel @Inject constructor(
) : ViewModel() {

    private val _state = MutableStateFlow(CodeScreenState())
    val state = _state.asStateFlow()

}