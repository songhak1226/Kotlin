data class PokeMon(var name : String, var type : String)
// 데이터 클래스
// 프로퍼티
// toString, equals, hashCode, copy()
// toString : 초기화되어있는 값을 리턴
// equals : 변수의 값이 같은지 판단

val p1 = PokeMon("피카츄", "번개")
val p2 = PokeMon("피카츄", "번개")

// hashCode : 안에 초기화 되어있는 프로퍼티의 값이 같은가
