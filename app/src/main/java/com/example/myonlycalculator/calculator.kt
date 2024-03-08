package com.example.myonlycalculator

fun main() {
    var calc = Calculator()

    while(true) {
        println("연산을 시작합니다! 원하시는 연산을 선택하여 주십시오.")
        println("[1]덧셈, [2]뺄셈, [3]곱셈, [4]나눗셈, [5]나머지, [0]종료")
        val select = readLine()!!.toInt()
        if (select == 0) {
            break
        }

        println("첫 번째 숫자를 입력 해주세요.")
        val num1 = readLine()!!.toInt()

        println("두 번째 숫자를 입력 해주세요.")
        val num2 = readLine()!!.toInt()

        if(select == 1) {
            calc.add(num1, num2)
        } else if(select == 2) {
            calc.sub(num1, num2)
        } else if(select == 3) {
            calc.multiply(num1, num2)
        } else if(select == 4) {
            calc.divide(num1, num2)
        } else if(select == 5) {
            calc.remainder(num1, num2)
        }
    }
    println("연산이 종료 되었습니다.")

}

class Calculator {

    fun add(num1: Int, num2: Int): Int {
        var addresult = num1 + num2
        println(("정수 덧셈결과: ${addresult}"))
        return addresult
    }
    fun sub(num1: Int, num2: Int): Int {
        var subresult = num1 - num2
        println("정수 뺄셈결과: ${subresult}")
        return subresult
    }
    fun multiply(num1: Int, num2: Int): Int {
        var multiplyresult = num1 * num2
        println("정수 곱셈결과: ${multiplyresult}")
        return multiplyresult
    }
    fun divide(num1: Int, num2: Int): Int {
        var divideresult = num1 / num2
        println("정수 나눗셈결과: ${divideresult}")
        return divideresult
    }
    fun remainder(num1: Int, num2: Int): Int {
        var remainderresult = num1 % num2
        println("정수 나머지결과: ${remainderresult}")
        return remainderresult
    }
}