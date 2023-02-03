package com.example.month5_lesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.month5_lesson4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: Model by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
        logicButtons()
    }
    private fun init() {
        viewModel.snackBar.observe(this){snack ->
            binding.increase.showSnackBar(snack.toString())
            binding.reduce.showSnackBar(snack.toString())
        }
        viewModel.count.observe(this) { count ->
            binding.tv.text = count.toString()
        }

    }

    private fun logicButtons() {
        binding.increase.setOnClickListener {
            viewModel.increase()
        }
        binding.reduce.setOnClickListener {
            viewModel.reduce()
        }
    }
}