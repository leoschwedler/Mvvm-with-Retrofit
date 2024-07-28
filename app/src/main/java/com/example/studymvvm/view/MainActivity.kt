package com.example.studymvvm.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.studymvvm.databinding.ActivityMainBinding
import com.example.studymvvm.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.listaPostagens.observe(this){
            var listaResultado = ""
            it.forEach {
                listaResultado += "${it.id} - ${it.title} \n"
            }
            binding.textViewResultado.text = listaResultado
        }
    }

    override fun onStart() {
        super.onStart()
        mainViewModel.recuperarPostagens()
    }
}