package ru.letovo.sphere.docs.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiService {
    private val retrofit: Retrofit? = Retrofit.Builder()
        .baseUrl("https://fakestoreapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: IApiService = retrofit?.create(IApiService::class.java) as IApiService
}