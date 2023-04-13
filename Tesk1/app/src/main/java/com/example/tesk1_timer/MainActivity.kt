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
            if (isRunning) {
                pause()
            } else {
                start()
            }
        }

        binding.btnReset.setOnClickListener {
            refresh()
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

            runOnUiThread { // UI 스레드 생성
                if (isRunning) {    // UI 업데이트 조건 설정
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
        }
    }

    private fun pause() {
        binding.btnStart.text = "시작"

        isRunning = false   // 멈춤 상태로 전환
        timer?.cancel() // 타이머 멈추기
    }

    private fun refresh() {
        timer?.cancel() // 백그라운드 타이머 멈추기

        binding.btnStart.text = "시작"

        isRunning = false   // 멈춤 상태로 변경

        // 타이머 초기화

        time = 0
        binding.tvTimeMil.text = ".00"
        binding.tvTimeSec.text = ":00"
        binding.tvTimeMin.text = "0"
    }
}