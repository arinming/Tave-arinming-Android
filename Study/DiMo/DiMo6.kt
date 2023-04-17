fun main() {
    var a = 0

    while(a < 5) {
        println(a++)    // 후위 증가 연산자, 화면에 출력된 후 증가값 반영
    }

    var b = 0

    while(b < 5) {
        println(++b)    // 전위 증가 연산자, 해당 구문에서 증가된 값을 즉시 반영
    }

    // do .. while : 최초 한번은 조건 없이 do 에서 구문을 실행
    do
    {
        println(a++)
    } while(a < 5)


    // for문 : 기본적으로 값을 1씩 증가
    for(i in 'a'..'e') { // index로 사용할 변수는 var 등을 생략해도 된다
        print(i)    // print는 println과 달리, 줄을 떼지 않고 붙여서 출력
    }

    for(j in 0..9 step 3) { // step 3 = 3씩 증가
        print(j)
    }

    for(z in 9 downTo 0 step 2) {  // 9부터 0까지 2씩 감소
        print(z)
    }


}