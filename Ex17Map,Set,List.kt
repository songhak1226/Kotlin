fun main() {

    // Map
    // python dictionary, Json과 비슷함 key, value값으로 이루어짐
    val K = mutableMapOf<Int, String>()
    // 데이터를 입력하는 기능 : put
    // put : key, value
    K.put(1,"예진")
    K.put(2,"자연")
    K.put(3,"예호")

    // key값만 확인해보기
    // value값만 확인해보기
    // key와 value 확인해보기
    for(i in K){
        println(i)
        println(i.key)
        println(i.value)
    }

    // Set : 중복되는 데이터를 없애주는 기능을 가지고 있음
    val list = mutableSetOf("a","b","c")
    // add
    list.add("d")
    list.add("a")
    list.add("b")
    println(list)


}