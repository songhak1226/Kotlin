fun main() {
    // 입력받은 숫자로 팩토리얼 구하기

    //숫자를 입력하세요 : 5
    // 결과값 : 120

    print("숫자를 입력하세요 >> ")
    var num : Int? = readLine()?.toInt()

    //num = 5 --> 5*4*3*2*1
    var factorial = 1

    while (true){
        // num --> Int?
        // 4) 조건식을 사용해서 null값을 처리
        if(num!=null){
            factorial*=num
            num--
        }
        //num이 0이 되면 while문을 break
        if(num==0){
            break
        }
    }
    print("결과값 : $factorial")
}