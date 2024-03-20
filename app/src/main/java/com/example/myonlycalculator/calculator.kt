package com.example.myonlycalculator

// 조건!
// 변수, 해당 변수는 어떤 연산(문법)을 사용해야 하는지, 결과를 나타내는 변수는 무엇인지
//
// 주어진 변수는 무엇인지? = 입력할 파라미터가 무엇인지
// 어떤 연산을 할 것인지? = 함수 안에 들어갈 내용
// 마지막에 결과를 나타내는 변수는 무엇인지? = 함수의 리턴 값

// 1. 일단 다 적고, 어떤 순서대로 해야하는지 나열해보자.
// 2. 동작 시켰을때 예상대로 나오는지, 아니라면 무엇이 문제인지 알아내 수정해 나가자.
// 3. 그래야 질문 받는 입장에서도 명확하게 가이드를 줄 수 있다.
// 4. 해결 후에는 더 좋은 문법이 있는지 찾아보며 바꿔 나가면 된다.

import android.util.Log
// Log는 Activity에서만 돌아가는 것 같다.
fun main() {
    // mainactivity에서 main으로 바꿨다. 튜터님이 권하기도 했고 이 방법밖에 없었다. 콘솔 쓰려면 액티비티 쓰지마 그냥.
    // Lv1
// - 연산을 수행할 수 있는 Calculator 클래스를 만들고, 클래스를 이용하여 연산을 진행하고 출력하기


    println("안녕하세요 연산을 시작합니다! 원하시는 연산을 선택하여 주십시오.")
    println("[1]덧셈, [2]뺄셈, [3]곱셈, [4]나눗셈, [5]나머지, [0]종료")
    // 1. 첫번째 숫자를 입력 받는다
    println("첫 번째 숫자를 입력 해주세요.")
    val firstNum: Int = readLine()!!.toInt()
    // 2. 연산자를 입력 받는다, 단 ( +, -, /, * ) 만 입력 할 수 있다.
    val operate: String = readLine()!!
    // 3. 두번째 숫자를 입력 받는다
    println("두 번째 숫자를 입력 해주세요.")
    val secondNum: Int = readLine()!!.toInt()

    //- Calculator 클래스를 이용하여 연산 결과를 출력한다.
    // 9. 클래스의 인스턴스는 calc이며 Calculator 실행을 위해 인스턴스를 만들어준 것이다.
    var cal = Calculator()

    //- 10. Calculator 함수를 실행한다.
    val calResult = cal.operate(firstNum, operate, secondNum)

//    Log.d("Mytag", "call result $calResult")
}


class Calculator { // 여기 operator는 같을 필요 없다. 명확하게 다르다. 함수명은 약속일분이다.
    // 4. Calculator 엔 연산을 할 수 있는 함수가 있고,  연산을 하기 위해선 숫자 두개와 연산자를 입력 받아야 한다.
    fun operate(firstNum: Int, operate: String, secondNum: Int): Int { // 함수명은 calculoator 내에서 만들어진 함수명이고, 파라미터 operate는 메인에서 사용하는 입력받는 프로퍼티다. 결과값이 숫자로 나와야하니까 operate함수는 Int으로 지정.
        var result: Int = 0; // 5.Calculator 함수엔 연산결과를 출력한다.
        // 6. 어떤 연산자를 쓸 것이냐
        // 연산자를 파악하는 문은 조건문! 연산자 4개를 구분할 수 있어야 한다.
        // char -'' string -"" 차는 한글자 스트링은 문자열 연산자는 한글짜니까 char로 쓸 수 있으니까 선택의 여지

        when (operate) { // 7. 파악 후 두 숫자를 연산한다
            "+" -> {
                result = firstNum + secondNum
            }

            "-" -> {
                result = firstNum - secondNum
            }

            "*" -> {
                result = firstNum * secondNum
            }

            "/" -> {
                result = firstNum / secondNum
            }

            else -> {} // 아무동작도 안함, 대입연산자 였다면 else가 필수지만, 해당 코드는 대입식이 아니므로 필요가 없다.
        }
        return result // 8. 결과를 출력한다
    }
}








//        if (firstNum == 0) {
//            break
//        }
//
//
//
//    }
//    println("연산이 종료 되었습니다.")











//
//    fun sub(num1: Int, num2: Int): Int {
//        var subresult = num1 - num2
//        println("정수 뺄셈결과: ${subresult}")
//        return subresult
//    }
//    fun multiply(num1: Int, num2: Int): Int {
//        var multiplyresult = num1 * num2
//        println("정수 곱셈결과: ${multiplyresult}")
//        return multiplyresult
//    }
//    fun divide(num1: Int, num2: Int): Int {
//        var divideresult = num1 / num2
//        println("정수 나눗셈결과: ${divideresult}")
//        return divideresult
//    }
//    fun remainder(num1: Int, num2: Int): Int {
//        var remainderresult = num1 % num2
//        println("정수 나머지결과: ${remainderresult}")
//        return remainderresult
//    }