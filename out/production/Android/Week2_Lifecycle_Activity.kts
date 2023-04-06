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


// 액티비티가 RESUMED 상태로 바뀔 때 발행되는 ON_RESUME 이벤트를
// LifeCycleObserver가 수신하게 될 때 수행할 수 있는 동작 중 하나


// 액티비티가 RESUMED 상태가 될 때마다 카메라를 초기화하는 코드

class CameraComponent: LifeCycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun initCamera() {
        if (camera == null) {
            getCamera()
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun releaseCamera() {
        camera?.release()
        camera = null
    }
}

// PAUSED 상태가 되면 다른 앱과 시스템 자원 공유를 위해 메모리에서 카메라를 해제한다.
// 다시 액티비티가 RESUMED 되는 겨우 카메라가 메모리 상에 존재하지 않는다
// 따라서, 다시 초기화 한다.


// --- onStop()은 UI 관련 작업을 수행하기에 적절
// CPU를 비교적 많이 소모하는 작업을 종료해야 한다 - DB 저장 타이밍을 모르겠다면 onStop() 상태일 때 저장

override fun onStop() {
    super.onStop()

    val values = ContentValues().apply {
        put(NotePad.Notes.COLUMN_NAME_NOTE, getCurrentNoteText())
        put(NotePad.Notes.COLUMN_NAME_TITLE, getCurrentNoteTitle())
    }

    asyncQueryHandler.startUpdate(
        token,
        null,
        uri,
        values,
        null,
        null
    )
}

