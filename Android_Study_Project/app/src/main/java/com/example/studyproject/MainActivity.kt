package com.example.studyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"    // 변하지 않는 값은 val로 선언

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


       var myNumber = "1,2,3,4,5,6"
       var thisWeekNumbers = "5,6,7,8,9,10"
       if(myNumber == thisWeekNumbers) {
           Log.d(TAG, "당첨되었습니다")
       } else {
           Log.d(TAG, "당첨되지 않았습니다")
       }

       for(index in 1..10) {    // 1..10 => 1부터 10까지 반복, 키워드를 변수명으로 쓰지 말기
           Log.d(TAG, "현재 숫자는 ${index}입니다") // 문자열 표시에 $ 표시 쓸 때는 한 칸 띄어쓰기
            // $ 표시를 띄어쓰지 않고 표기하려면 변수명에 {}
       }
    }
}




