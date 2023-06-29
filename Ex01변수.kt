fun main() {
    // 실행시킬 코드는 main()함수 안에 작성

    // 데이터를 저장할 수 있는 공간 만들기
    // 1) val/var 선택
    // val(value) : 변경 불가능(immutable)한 변수, 초기화만 가능
    // var(variable) : 변경 가능(mutable)한 변수, 초기화/재할당 가능

    // 2)변수명
    // 3) : 자료형 = 데이터 값

    //이름을 저장 할 수 있는 변수 name을 만들어보자
    // val name : String = "윤영현"
    val name = "윤영현"
    println(name)
    // 자료형 확인하는 단축키 : ctrl + shift + p

    // Kotlin에서는 들어오는 데이터를 보고 자료형 추론이 가능하다
    // -> 변수를 선언할 때 자료형을 생략할 수 있다.

    var age = 20
    age = 21

    // int age; 선언
    // age = 21; 초기화
    // 코틀린에서 선언과 초기화를 분리하고 싶으면
    // 선언 코드에 반드시 자료형이 명시되어 있어야 한다
    val greet : String
    greet = "안녕하세요"

    println(greet)
}

