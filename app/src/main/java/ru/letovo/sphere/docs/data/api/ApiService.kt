package ru.letovo.sphere.docs.data.api

import retrofit2.Retrofit

class ApiService {
    private val retrofit: Retrofit? = Retrofit.Builder()
        .baseUrl("https://fakestoreapi.com/")
        .build()

    val service: IApiService = retrofit?.create(IApiService::class.java) as IApiService
}