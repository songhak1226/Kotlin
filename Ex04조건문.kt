import java.util.Random
import java.util.Scanner

fun main() {
    // Scanner sc = new Scanner(System.in);
    // 자료형 레퍼런스 변수명 = 생성자;

    // val/var 변수명 : 자료형 = 데이터값
    val sc : Scanner = Scanner(System.`in`)
    val rd : Random = Random()
    // 내부적으로 설계되어있는 입력기능
    // var input = readLine() // String?
    // Int로 바꿔서 정답인지 아닌지 판단
    val num1 : Int = rd.nextInt(50)+1
    val num2 = rd.nextInt(50)+1

    // Kotlin에서는 서로 다른 자료형끼리의 연산이 불가능
    // val str = num1 + ""
    println("$num1 + $num2 = ?")
    print("Enter the Answer : ")
    var input = readLine()?.toInt()
//    if(input == num1 + num2){
//        println("결과 : 정답입니다.")
//    } else {
//        println("결과 : 오답입니다.")
//    }

    val result = if(input == num1 + num2) println("결과 : 정답입니다.") else println("결과 : 오답입니다.")
    println(result)

}