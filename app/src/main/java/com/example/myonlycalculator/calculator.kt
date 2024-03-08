package com.example.myonlycalculator

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    var calc = Calculator()

    calc.add(a, b)
    calc.sub(a, b)
    calc.multiply(a, b)
    calc.divide(a, b)
    calc.remainder(a, b)
}

class Calculator {

    fun add(a: Int, b: Int): Int {
        var addresult = a + b
        println(("정수 덧셈결과: ${addresult}"))
        return addresult
    }
    fun sub(a: Int, b: Int): Int {
        var subresult = a - b
        println("정수 뺄셈결과: ${subresult}")
        return subresult
    }
    fun multiply(a: Int, b: Int): Int {
        var multiplyresult = a * b
        println("정수 곱셈결과: ${multiplyresult}")
        return multiplyresult
    }
    fun divide(a: Int, b: Int): Int {
        var divideresult = a / b
        println("정수 나눗셈결과: ${divideresult}")
        return divideresult
    }
    fun remainder(a: Int, b: Int): Int {
        var remainderresult = a % b
        println("정수 나머지결과: ${remainderresult}")
        return a % b
    }
}