public class Person constructor(name : String, age : Int) { // 주 생성자 만들때 constructor 생략가능

    // 프로퍼티 (Property)
    // : 필드 + getter/setter = 프로퍼티
    // - 모든 프로퍼티는 고정된 초깃값을 가져야한다.

//    val name : String = "굥"
//    var age : Int = 0

    val name : String
    var age : Int

    init {
        this.name = name
        this.age = age
    }

    init {
        // 새로운 생성자 만드는게 가능하다
    }

    // init : 객체 생성과 동시에 가장 먼저 실행이 되는 코드, 딱 한번 실행이 되는 코드

    // 1. 프로퍼티를 val로 선언할 경우 getter만 생성된다.
    // 2. 프로퍼티를 var로 선언할 경우 가변할 수 있기 때문에
    //      getter와 setter가 같이 생성된다.

    // 주 생성자를 만들게 되면 getter/setter(프로퍼티)의 역할도 함께함
}
