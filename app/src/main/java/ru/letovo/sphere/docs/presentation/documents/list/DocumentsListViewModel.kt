package ru.letovo.sphere.docs.presentation.documents.list

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import ru.letovo.sphere.docs.data.api.ApiService
import javax.inject.Inject

class DocumentsListViewModel @Inject constructor(
) : ViewModel() {

    private val _state = MutableStateFlow(DocumentsListScreenState())
    val state = _state.asStateFlow()

    init {
        CoroutineScope(Dispatchers.Default).launch {
            val documents = ApiService().service.getDocuments()
            withContext(Dispatchers.Main) {
                _state.value = _state.value.copy(documentsList = documents)
            }
        }
    }

}