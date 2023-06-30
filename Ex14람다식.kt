fun main() {
    // 이름이 없는 함수를 람다식으로 선언한 형태
    {x:Int, y:Int -> x + y}
    // 더하기 기능을 필요할 때마다 사용하려면 어딘가에 저장해야함 : 변수
    // 작성 방법
    // 변수 선언 : (매개변수의 자료형) -> 리턴값의 자료형 = 이름없는 함수
    val sum1 : (Int,Int) -> Int = {x:Int, y:Int -> x + y}
    // 람다식 간략화 하기
    // 1. 람다식의 매개변수에 자료형이 지정되어 있다면 변수에 자료형은 생략할 수 있다.
    val sum2 : (Int,Int) -> Int = {x, y -> x + y}
    // 2. 변수에 매개변수의 자료형이 지정되어 있다면 람다식의 매개변수 자료형이 생략될 수 있다.
    val sum3 = {x:Int, y:Int -> x + y}
    // 단, 1번과 2번 둘다 쓸수는 없음
    // -> 자료형 추론이 불가능한 상태가 되어버리기 때문

    // "Hello Kotlin"을 출력하는 기능을 가진 람다식 함수 선언
    // greet라는 변수에 함수를 담아주기

//    fun greet():Unit {
//        print("hello kotlin")
//    }

    val greet : () -> Unit = { println("hello kotlin")}
    greet()

    // 정사각형의 넓이를 구하는 람다식 함수 선언
    // square라는 변수에 함수를 담아주기 (매개변수 - 한변의 길이)

//    fun square(x:Int):Int{
//        return x*x
//    }
    
    val square : (Int) -> Int = {x:Int -> x*x}
    println(square(3))
    
    
    // 람다식의 장단점
    // 장점 : 코드의 간략화, 함수를 변수처럼 사용가능
    // 단점 : 함수에 사용되는 매개변수를 다 알고 있어야 함
}