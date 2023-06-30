fun main() {
    // 실행코드
    println(sum(1, 2))
    printSum(5,3)
}

// main 밖에서 함수 선언
// 숫자 2개를 받아서 더한 결과값을 돌려주는 함수를 만들어보자
// 1) fun(function)
// 2) 함수명, 호출명
// 3) (매개변수)
// 4) : 리턴타입
// 5) {body}
//fun sum(num1: Int, num2: Int): Int {
//    return num1 + num2
//}

// 함수 간략화 하기
// 1. {}(body)가 한 줄이면 중괄호와 return문을 생략할 수 있다
//fun sum(num1: Int, num2: Int): Int = num1 + num2

// 2. 매개변수 Int 두개를 더한 결과값을 리턴하고 있는 걸 통해
//    결과값 데이터 타입이 Int라는 걸 추론할 수 있는 상태
// -> 리턴타입이 생략이 가능하다
fun sum(num1: Int, num2: Int) = num1 + num2
fun sub(num1: Int, num2: Int) = num1 - num2
fun mul(num1: Int, num2: Int) = num1 * num2
fun div(num1: Int, num2: Int) = num1 / num2

// 출력하는 기능을 가진 함수를 만들기
// void ---> Unit
//fun printSum(num1 : Int, num2 : Int) : Unit{
//    println(num1+num2)
//}
fun printSum(num1 : Int, num2 : Int) = println(num1+num2) // 간략화 가능


