import java.util.Scanner

fun main() {
    val sc: Scanner = Scanner(System.`in`)

    print("Enter the number : ")
    // var input = readLine()?.toInt() // Int? 
    var input = readln().toInt() // Int (readln 사용)
    if (input > 0) {
        println("양수 값")
    } else if (input < 0) {
        println("음수 값")
    } else if (input == 0) {
        println(0)
    } else {
        print("숫자를 입력하세요")
    }
    
    // 코틀린에서는 null값이 발생하는 경우에 대해 조치를 취해줘야 함
}