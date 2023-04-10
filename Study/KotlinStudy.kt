fun main(args: Array<String>) {
    var a: Int = 123
    // 코틀린은 Null 값을 허용하지 않기 때문에 초기화를 꼭 해야한다
    println(a)



    // 코틀린의 자료형
    var intValue: Int = 1234
    var LongValue: Long = 1234L
    var intValueByHex: Int = 0x1af  // 16진수
    var intValueByBin: Int = 0b10110110 // 2진수
    // 코틀린은 8진수의 표기 지원 X
    // 실수의 기본은 Double형이며 소수점을 포함하여 쓰기
    var doubleValue: Double = 123.5
    var doubleValueWithExp: Double = 123.5e10   // 필요시 지수 표기법을 추가
    var floatValue: Float = 123.5f  // 16비트의 Float 표기법

    // 코틀린의 문자열은 글자 하나하나가 2bytes의 메모리 공간을 사용
    var charValue: Char = 'a'   // 작은 따옴표로 감싸서 표기

    // Boolean 값
    var booleanValue: Boolean = true

    // 문자열
    val stringValue = "탭 \t"
    val multiLineStringValue = """
        특수문자 /(!@*($* 그대로 사용 가능
        \r 첫 열로 커서 옮김
        \n 개행
        \n 백스페이스
        \' 작은 따옴표
        \" 큰 따옴표
        \\ 역슬래스
        \$
        \uxxxx 유니코드 문자
    """.trimIndent()

    
}

