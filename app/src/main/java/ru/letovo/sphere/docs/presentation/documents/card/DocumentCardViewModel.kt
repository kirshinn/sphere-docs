package ru.letovo.sphere.docs.presentation.documents.card

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class DocumentCardViewModel @Inject constructor(
) : ViewModel() {

    private val _state = MutableStateFlow(DocumentCardScreenState())
    val state = _state.asStateFlow()

}