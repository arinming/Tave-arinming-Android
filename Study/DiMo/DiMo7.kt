package DiMo


// #7 흐름제어와 논리연산자

// 흐름제어 키워드
// return : 함수를 종료하고, 값을 반환하는 키워드
// break : 반복문 내의 구문이 실행되는 중간에 즉시 반복문을 종료하고 다음 구문으로 넘어가는 역할
// continue : 다음 반복 조건으로 즉시 넘어가는 역할

fun main() {

    for (i in 1..10) {
        if (i == 3) break
        println(i)
    }
    // i가 3이 되는 시점에 반복 즉시 중단
    // 즉, 1과 2가 찍힌 후 정지된다

    for (j in 1..10) {
        if (j == 3) continue
        println(j)
    }
    // i가 3이 되는 시점에는 출력하지 않고 바로 for문으로 돌아가서 다음 반복 조건인 4로 진행된다

    // 코틀린의 차별점
    // label을 통해 다중 반복문에서 break나 continue가 적용되는 반복문을 지정할 수 있다

    loop@for (i in 1..10) {
        for (j in 1..10) {
            // i == 1, j == 2면 모든 반복문 종료
            if(i == 1 && j == 2) break@loop
            println("i : $i, j : $j")
        }
    }
    // 1. 외부 반복문에 레이블이름 + @기호 달기 -> loop@
    // 2. break 또는 continue문에서 @기호 + 레이블이름 달기
    // 레이블이 달린 반복문을 기준으로 즉시 break 또는 continue

    // 따옴표 안에서 변수를 출력할 때, 변수명 앞에 달러표기 -> 변수내용으로 대체되어 출력된다



    // 논리연산자 : 논리 값을 연산하여 새로운 논리값을 도출할 때 쓰는 연산자
    // && : and 연산자
    // || : or 연산자
    // ! : not 연산자

    println(true && false)
    println(true || false)
    println(!true)
    println(!false)

    var a = 6
    var b = 4
    println(a > 5 && b > 5)
}