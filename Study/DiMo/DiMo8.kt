package DiMo
// 클래스 : '값'과 그 값을 사용하는 '기능'들을 묶어놓은 것
// 클래스는 고유의 특징적인 값을 담는 변수인 속성 + 기능을 구현한 함수 로 이루어져 있다
// '인스턴스'를 만드는 틀이다
// 인스턴스 : 클래스를 이용해서 만들어내는 서로 다른 속성의 객체를 지칭하는 용어

// 사람의 이름과 출생년도를 관리하는 클래스
fun main() {

    // 인스턴스 만들기
    // 변수를 선언하고 할당 연산자 쓰기 => 클래스 이름과 속성 순서대로 값 쓰기
    var a = Person("박보영", 1990)
    var b = Person("전정국", 2004)
    var c = Person("장원영", 2004)

    // 인스턴스를 담은 변수를 사용하기
    // 참조연산자 '.' 을 찍는다.  >> 변수명.속성명 <<

    println("안녕하세요, ${a.birthYear}년생 ${a.name}입니다.")

    a.introduce()
    b.introduce()
    c.introduce()
}

// 괄호 안에 클래스가 가지는 속성으로 이름과 출생년도를 쉼표로 구분하여 나열
// 박보영, 전정국, 장원영 : 3개의 인스턴스를 1개의 Person 클래스로 만들 수 있다
class Person (var name: String, val birthYear: Int) { // 함수 없이 속성만 갖춘 클래스는 이것 만으로 구현할 수 있다
    fun introduce() {
        // 클래스 내부에서는 변수명.속성명이 아닌 속성이름만 사용한다
        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }
}


// 자주 사용하는 공통적인 기능은 클래스 내에 함수로 추가한다