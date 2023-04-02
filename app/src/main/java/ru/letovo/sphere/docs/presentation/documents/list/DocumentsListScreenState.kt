package ru.letovo.sphere.docs.presentation.documents.list

data class DocumentsListScreenState(
    val documentsListScreenName : String = "список документов",
    val documentsList: MutableList<Document> = mutableListOf(
        Document(name = "документ 1"),
        Document(name = "документ 2"),
        Document(name = "документ 3"),
    )
)

class Document(
    val name : String
)