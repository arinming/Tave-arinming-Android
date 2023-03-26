// Intent 사용방법

// val intent = Intent(현재 액티비티의 Context, 호출 할 Activity)
// startActivity(intent)


// val intent = Intent(this, SecondActivity::class.java)
// startActivity(intent)



// Intent를 통해 데이터 전달하기

// val intent = Intent(this, SecondActivity::class.java)
// intent.putExtra("key", value)
// startActivity(intent)


// 데이터 받기
// val getIntentValue = intent.getStringExtra("key")


// 암시적 인텐트

// 웹브라우저 인텐트 호출

// val intent = Intent(Intent.ACTION_VIEW, Uri.parse("www.naver.com"))
// startActivity(intent)

// 이메일 전달하는 인텐트 호출

// val intent = Intent(Intent.ACTION_SEND)
// intent.type = "text/plain"
// intent.putExtra(Intent.EXTRA_EMAIL, "example.example.com")
// intent.putExtra(Intent.EXTRA_SUBJECT, "전달할 이메일 제목")
// intent.putExtra(Intent.EXTRA_TEXT, "전달할 내용")
// startActivity(Intent.createChooser(intent, "Choose Email"))

// 전화걸기 인텐트 호출

// val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-0000-0000"))
// startActivity(intent)