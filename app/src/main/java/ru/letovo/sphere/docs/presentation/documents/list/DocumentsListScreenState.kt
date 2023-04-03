package ru.letovo.sphere.docs.presentation.documents.list

data class DocumentsListScreenState(
    val documentsListScreenName : String = "список документов",
    val documentsList: MutableList<Document>
)

data class Document(
    val id: Int,
    val title: String,
    val price: String,
    val category: String,
    val description: String,
    val image: String
)