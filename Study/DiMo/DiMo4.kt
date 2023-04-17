fun main() {
    // 타입추론
    var a = 1234    // int형으로 추론
    var b = 1234L   // long 추론
    var c = 12.45   // double 추론
    var d = 12.45   // float 추론
    // 16진수와 2진수는 int 형으로 추론
    var e = 0xABCD
    var f = 0b010101

    var g = true    // Boolean 추론
    var h = 'c'     // Char 추론

    // 특정한 자료형으로 지정하는 것이 아니면 타입추론으로 코드량을 줄일 수 있다


    // 함수
    println(add(5, 6, 7))
    // 단일 표현식 함수
    println(add2(3, 4, 5))

}

fun add(a: Int, b: Int, c: Int): Int {  // 마지막 Int는 반환형, 반환값이 없다면 생략 가능
    return a + b + c    // 함수 안에서 return은 뒤에 오는 값을 반환하는 키워드
    // 함수의 중간이더라도 return을 만나면 값을 반환하고 함수를 종료해야 한다
}

// 단일 표현식 함수 : 반환형의 타입추론이 가능하므로 반환형 생략 가능
fun add2(a: Int, b: Int, c: Int) = a + b + c