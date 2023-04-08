package com.example.studyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"    // 변하지 않는 값은 val로 선언언

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myName = "김아린"
        Log.d(TAG, "my name = $myName")
        myName = "아린"   // var는 선언한 뒤 값을 변경할 수 있다
        Log.d(TAG, "my name = $myName")

        val PI = 3.141592   // val은 선언한 뒤 값을 변경할 수 없다
        // 변하지 않는 상수를 정의할 때 사용
       Log.d(TAG, "pi= $PI")
    }
}




