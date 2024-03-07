package com.example.myonlycalculator

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    var calc = Calculator()

    var addresult = calc.add(a, b)
    var subresult = calc.sub(a, b)
    var multiplyresult = calc.multiply(a, b)
    var divideresult = calc.divide(a, b)

    println("정수 덧셈결과: ${addresult}")
    println("정수 뺄셈결과: ${subresult}")
    println("정수 곱셈결과: ${multiplyresult}")
    println("정수 나눗셈결과: ${divideresult}")
}

class Calculator {

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
        return a
    }
}






