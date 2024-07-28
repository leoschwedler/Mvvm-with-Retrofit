package com.example.studymvvm.model

import com.example.studymvvm.api.RetrofitService

class PostagemAPI {
    suspend fun recuperarPostagens(): List<Postagem> {
        val jsonPlace = RetrofitService.recuperarJsonPlaceHolder()
        try {
            val retorno = jsonPlace.recuperarPostagens()
            if (retorno.isSuccessful) {
                retorno.body()?.let {
                    return it
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return emptyList()
    }
}