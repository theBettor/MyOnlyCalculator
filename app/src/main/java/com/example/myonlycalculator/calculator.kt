package com.example.myonlycalculator

fun main() {

    // Lv2
    //Lv1에서 만든 Calculator 클래스에 출력 이후 추가 연산을 가능하도록 코드를 추가하고, 연산 진행 후 출력하기

    // 해결 해야할 것
    // 1. Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
    // while문 안에서나 클래스에서 Int타입 말고 다른 타입의 값을 입력했을때 나오는 오류이다. 예외처리를 통해 처리해주면 좋겠다.
    // 추가로!!
    // 연산자 입력 받는 부분에도 예외처리를 해주면 좋겠다.

    // 2. 코드 마지막 부분, 계산기 클래스쪽에 return reulst가 있는데, 가끔 코테 연습하다보면 return이 생략될때가 있는데 return의 역할을 아직 잘 모르는 것같다.

    while (true) { // 1. 무한 반복문을 실행한다. 반복문을 사용하여 LV1 의 과정이 여러번 동작하도록 하라
        println("안녕하세요 연산을 시작합니다!")
        println("첫 번째 숫자를 입력 해주세요.")
        val firstNum: Int = readLine()!!.toInt()

        // 2. 연산자를 입력 받는데, 숫자로 받는다 ( 1번 +, 2번 -, 3번 *, 4번 /, 5번 % )
        println("연산자를 선택하여 주세요. \n[1]덧셈, [2]뺄셈, [3]곱셈, [4]나눗셈, [5]나머지.")
        val operate: Int = readLine()!!.toInt()
        println("두 번째 숫자를 입력 해주세요.")
        val secondNum: Int = readLine()!!.toInt()

        val cal = Calculator()

        // 6. Calculator 클래스를 이용하여 연산 결과를 출력한다.
        val calResult = cal.operate(firstNum, operate, secondNum) // Log를 쓰지 않으면서 변수가 쓰이지 않고 있었는데, 아래 print문에서 calReuslt를 사용할 수 있게 했다.
        println("결과는 $calResult 입니다.") // result 양 옆에 {} 안 붙혀줘도 됨.

        // 3. 그리고 -1을 입력 할 때까지 계산을 반복합니다.(-1 입력 시 반복 종료)
        if (firstNum == -1 || secondNum == -1) { // 반복문을 끝내는게 중요한데, 끝내려면 당연히 while문 안에 넣어줘야 한다.
            break
        }
        // 7. 추가 계산을 할 것인지 숫자를 받아본다 (0이 아닌 다른 숫자이면 break)
        println("추가 연산을 원하십니까? 원하시면 [0], 종료를 원하시면 아무거나 입력해주세요.")
        val addoperate: Int = readLine()!!.toInt()
        if (addoperate == 0) {
            continue
        } else {
            println("프로그램이 종료 됩니다.")
            break
        }
    }
}


class Calculator {
    fun operate(firstNum: Int, operate: Int, secondNum: Int): Int {
        var result: Int = 0;

        // 4. 콘솔에서 (1번 +, 2번 -, 3번 *, 4번 /, 5번 %)을 입력하면 연산 진행합니다.
        when (operate) {
            1 -> {
                result = firstNum + secondNum
            }

            2 -> {
                result = firstNum - secondNum
            }

            3 -> {
                result = firstNum * secondNum
            }

            4 -> {
                result = firstNum / secondNum
            }

            5 -> {
                result = firstNum % secondNum
            }

            else -> {} // //- 5. (선택적) 숫자,문자 유효성 검사 null 값이 있을 수 있다.
        }
        return result // 함수 내에 결과라는 변수를 만들어 줘서 리턴 값도 필요하다??
    }
}















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