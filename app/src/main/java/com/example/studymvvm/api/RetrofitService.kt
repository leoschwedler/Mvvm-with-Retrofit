package com.example.studymvvm.api

import com.example.studymvvm.util.Const
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    fun recuperarJsonPlaceHolder():JsonPlaceAPI {
        return Retrofit.Builder()
            .baseUrl(Const.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(JsonPlaceAPI::class.java)
    }
}