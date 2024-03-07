package com.example.myonlycalculator

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    var calc = Calculator()

    var addresult = calc.add(a, b)
    var subresult = calc.sub(a, b)
    var multiplyresult = calc.multiply(a, b)
    var divideresult = calc.divide(a, b)
    var remainderresult = calc.remainder(a, b)

    println("정수 뺄셈결과: ${subresult}")
    println("정수 뺄셈결과: ${subresult}")
    println("정수 곱셈결과: ${multiplyresult}")
    println("정수 나눗셈결과: ${divideresult}")
    println("정수 나머지결과: ${remainderresult}")

}

class Calculator {
<<<<<<< HEAD

    fun add(a: Int, b: Int): Int {
        return a + b
    }
    fun sub(a: Int, b: Int): Int {
        return a - b
    }
    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
    fun divide(a: Int, b: Int): Int {
        return a / b
    }
    fun remainder(a: Int, b: Int): Int {
        return a % b
    }
}






=======
    var addition:String = ""
    var hairColor:String = ""
    var height:Double = 0.0
    var age:Int = 0
    var gender:String = ""
}.
>>>>>>> orgin/master
