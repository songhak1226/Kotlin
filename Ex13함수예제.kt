fun main() {
    result(24,24)
}

fun result(num1 : Int, num2 : Int) : Unit{
    if(num1 > num2){
        println(num1)
    } else if(num2 > num1){
        println(num2)
    } else {
        println(0)
    }
}