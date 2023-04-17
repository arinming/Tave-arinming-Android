fun main() {
    // 명시적 형변환 : 변환될 자료형을 개발자가 직접 지정함

    var a: Int = 54321
    var b: Long = a.toLong()    // int -> long 형변환

    // 코틀린은 암시적 형변환(자료형을 지정하지 않아도 자동으로 형변환됨) 지원하지 않음


    // 배열
    var intArr = arrayOf(1, 2, 3, 4, 5)
    // 특정한 크기의 공간을 가지는 비어있는 배열
    // 꺾쇄 안에 배열에 할당할 자료형을 지정(제너릭)
    var nullArr = arrayOfNulls<Int>(5)

    intArr[2] = 8   // index 위치에 값을 할당,
    println(intArr[2])
    println(intArr[4])
}