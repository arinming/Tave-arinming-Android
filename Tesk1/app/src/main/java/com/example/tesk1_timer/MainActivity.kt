package com.example.tesk1_timer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tesk1_timer.databinding.ActivityMainBinding
import java.util.Timer
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity(), View.OnClickListener {
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

    override fun onClick(v: View?) {
        when(binding.root) {
            binding.btnStart -> {
                if (isRunning) {
                    pause()
                } else {
                    start()
                }
            }
            binding.btnReset -> {
                refresh()
            }
        }
    }

    private fun start() {
        binding.btnStart.text = "일시정지"
        isRunning = true    // 실행상태 변경

        // 스톱워치를 시작하는 로직
        timer = timer(period = 10) {
            time++  // 10밀리초 단위 타이머

            // 시간 계산
            val milli_second = time % 100
            val second = (time % 6000) / 100
            val minute = time / 6000

            // 밀리초
            binding.tvTimeMil.text = if (milli_second < 10) ".0${milli_second}"
            else ".${milli_second}"

            // 초
            binding.tvTimeSec.text = if (second < 10) ":0${second}"
            else ":${second}"

            // 분
            binding.tvTimeMin.text = "${minute}"

        }
    }

    private fun pause() {

    }

    private fun refresh() {
        
    }
}