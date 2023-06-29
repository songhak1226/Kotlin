fun main() {

    // 기본 자료형
    // Int, Float, Double, Char, Boolean.. 대문자로 써야함
    var age : Int = 20
    // 선언할때는 객체 자료형으로 선언하지만
    // 저장하는 값을 보고 기본자료형임을 추론해서 정적인 공간 (int)에 저장

    // 참조 자료형
    // String..
    // + String?, Int?, Float?...
    // String? --> 해당 변수에는 문자열이 저장 될 수도 있고 Null값이 저장 될 수도 있음

    val name : String? = null
    // String : 무조건 문자열만 들어갈 수 있다. null X
    // String? : 문자열/null
    println(name?.length)
    // null을 허용하는 순간 해당 변수에 대해 아래쪽에서 null처리를 해줘야 한다.
    // 1) name? (safe-call) : 세이프콜
    // name?.length - name.length가 가져오는 결과값이 null일 수도 있다.
    // 만약에 null이라면 null을 그대로 출력해라

    // --> ReclerView에서 View를 리턴할때
    // !!를 사용하면 반드시 이유를 작성해줘야 한다.
    // 2) !! (non-null asserted) : 단정기호
    // name!!.length - name.length는 절대로 null일 수가 없음을 단정
    // null이 들어와버리면 NPE를 발생시킨다.

    // 3) ?: (Elvis 연산자) 삼항연산자와 비슷함
    println(name?.length ?: "이름이 null 입니다.")
    // name/length가 null 값을 가져오면 ?: 기본값 이 출력된다.
}