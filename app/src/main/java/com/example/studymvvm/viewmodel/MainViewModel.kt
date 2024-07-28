package com.example.studymvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.studymvvm.model.Postagem
import com.example.studymvvm.model.PostagemAPI
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    val listaPostagens = MutableLiveData<List<Postagem>>()

    fun recuperarPostagens(){
        val postagemAPI = PostagemAPI()
        viewModelScope.launch {
            val postagens = postagemAPI.recuperarPostagens()
            listaPostagens.postValue(postagens)
        }
    }
}