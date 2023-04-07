package ru.letovo.sphere.docs.data.api

import retrofit2.http.GET
import ru.letovo.sphere.docs.presentation.documents.list.Document

interface IApiService {

    @GET("products")
    suspend fun getDocuments(): MutableList<Document>
}