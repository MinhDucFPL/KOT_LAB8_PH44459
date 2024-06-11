package com.kot104.kot_lab8_ph44459.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

open class RetrofitService {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://652670da917d673fd76c444b.mockapi.io/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val movieService: MovieService by lazy {
        retrofit.create(MovieService::class.java)
    }
}
