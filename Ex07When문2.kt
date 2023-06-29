fun main() {
    // 사용자로부터 국어, 영어, 수학, 과탐 점수를 입력받는다
    // 국어 점수 >>
    // 영어 점수 >>
    // 수학 점수 >>
    // 과탐 점수 >>

    // 평균을 구하고 , 총합을 구해서
    // Run창에
    // 평균 : 90
    // 총합 : 350

    // 평균의 값에 따라서 등급 출력 : when문 사용하기!
    // 90이상 'A'
    // 80이상 'B'
    // 70이상 'C'
    // 60이상 'D'
    // 그외 'F'

    // 출력 형태 -->  등급 : 'A'

    print("국어점수 >> ")
    val num1 : Int = readln().toInt()
    print("영어점수 >> ")
    val num2 : Int = readln().toInt()
    print("수학점수 >> ")
    val num3 : Int = readln().toInt()
    print("과탐점수 >> ")
    val num4 : Int = readln().toInt()

    val sum : Int = num1 + num2 + num3 + num4
    val avg = (sum/4)

    println("평균 : $sum")
    println("총합 : $avg")

    when(avg){
        in 90..100 -> println("A")
        in 80..90 -> println("B")
        in 70..80 -> println("C")
        in 60..70 -> println("D")
        else -> println("F")
    }
}