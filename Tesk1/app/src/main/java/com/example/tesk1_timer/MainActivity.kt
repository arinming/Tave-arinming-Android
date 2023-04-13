package com.example.tesk1_timer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tesk1_timer.databinding.ActivityMainBinding
import java.util.Timer
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var isRunning = false   // 실행 여부 확인용 변수
    var timer: Timer? = null
    var time = 0

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

    private fun start() {
        binding.btnStart.text = "일시정지"

    }
}