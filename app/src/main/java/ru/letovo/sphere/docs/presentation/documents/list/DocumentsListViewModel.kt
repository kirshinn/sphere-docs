package ru.letovo.sphere.docs.presentation.documents.list

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class DocumentsListViewModel @Inject constructor(
) : ViewModel() {

    private val _state = MutableStateFlow(DocumentsListScreenState())
    val state = _state.asStateFlow()

}