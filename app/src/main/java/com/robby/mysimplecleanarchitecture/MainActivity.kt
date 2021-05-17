package com.robby.mysimplecleanarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.robby.mysimplecleanarchitecture.databinding.ActivityMainBinding
import com.robby.mysimplecleanarchitecture.presentation.MainViewModel
import com.robby.mysimplecleanarchitecture.presentation.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = MainViewModelFactory.getInstance()
        val mainViewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        mainViewModel.setName("Robby Alamsyah")
        mainViewModel.message.observe(this, {
            binding.tvWelcome.text = it.welcomeMessage
        })
    }
}