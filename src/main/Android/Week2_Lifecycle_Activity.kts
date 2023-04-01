/* ----- 공식문서에서 보여주는 onCreate() 구현 예시 ----- */

lateinit var textView: TextView

var gameState: String? = null


// onCreate() : 시스템이 액티비티를 생성할 때 실행되는 메서드
// 다른 콜백 메서드들과 다르게, 반드시 오버라이딩으로 구현해야 한다
// 액티비티 전체 생명 주기 동안 딱 한 번만 동작되는 초기화 및 시작 로직을 실행한다
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    // onCreate()는 액티비티의 이전 저장 상태가 포함된 Bundle 객체인 savedInstanceState 매개변수를 수신한다
    // 처음 생성된 액티비티의 Bundle 객체 값은 null
    // 이를 이용해 이전 상태를 복원하여 화면에 표시할 수 있다

    gameState = savedInstanceState?.getString(GAME_STATE_KEY)

    // setContentView()를 통해 XML 레이아웃 파일을 넘겨줌으로써 화면에 해당 레이아웃을 그린다
    setContentView(R.layout.activity_main)
    // setContentView()는 onCreate()에 종속적인 메서드이다. 반드시 해당 콜백 메서드 안에 구현해야 한다.

    textView = findViewById(R.id.text_view)
}

// onCreate()의 동작이 끝나도 액티비티가 종료되는 것이 아니고,
// 액티비티는 STARTED 상태에 진입하게 되어 시스템은 onStart()와 onResume()을 연달아 호출한다


override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
    textView.text = savedInstanceState?.getString(TEXT_VIEW_KEY)
}

override fun onSaveInstanceState(outState: Bundle?) {
    outState?.run {
        putString(GAME_STATE_KEY, gameState)
        putString(TEXT_VIEW_KEY, textView.text.toString())
    }

    super.onSaveInstanceState(outState)
}
