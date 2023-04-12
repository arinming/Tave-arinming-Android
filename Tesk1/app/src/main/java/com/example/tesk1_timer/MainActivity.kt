package com.example.tesk1_timer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tesk1_timer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnStart.setOnClickListener {
            if (binding.btnStart.text == "시작") {
                binding.btnStart.text = "일시정지"
            } else {
                binding.btnStart.text = "시작"
            }
        }
    }
}