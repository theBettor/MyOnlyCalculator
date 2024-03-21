package com.example.myonlycalculator

// 해결 해야할 것
// 1. Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
// while문 안에서나 클래스에서 Int타입 말고 다른 타입의 값을 입력했을때 나오는 오류이다. 예외처리를 통해 처리해주면 좋겠다.
// 추가로!!
// 연산자 입력 받는 부분에도 예외처리를 해주면 좋겠다.



// 3. 33-34번줄, 81번줄 잘 이해한게 맞는지 수정 혹은 첨언 부탁 드립니다.

// 4. 80번줄 inline variable 할 수 있다는데 어떻게 할까?

fun main() {

// Lv 3. 단일책임원칙? = 클래스는 오직 하나의 책임만 가져야한다

    while (true) {
        println("안녕하세요 연산을 시작합니다!")
        println("첫 번째 숫자를 입력 해주세요.")
        val firstNum: Int = readLine()!!.toInt()


        println("연산자를 선택하여 주세요. \n[1]덧셈, [2]뺄셈, [3]곱셈, [4]나눗셈")
        val operate: Int = readLine()!!.toInt()
        println("두 번째 숫자를 입력 해주세요.")
        val secondNum: Int = readLine()!!.toInt()

        val cal = Calculator()

        // 2. 연산자가 +, -, *, / 중 어떤 것인지 파악해야한다
        var result: Int = 0 // 이게 없어서 계속 무슨 연산을 해도 결과값이 0으로 나왔다. 아마 그 0은 계산기 클래스 안의 operate 함수 안에 있는 result값인것 같고 계산은 여기서 하니까 결과 변수를 계싼 이전에 만들어주고
                            // 연산 후 밑에서 결과값읏 출력해준다.
        when (operate) {
            1 -> {
                val add = AddOperation()
                result = add.operate(firstNum, operate, secondNum)
            }
            2 -> {
                val sub = SubtractOperation()
                result = sub.operate(firstNum, operate, secondNum)
            }
            3 -> {
                val mul = MultiplyOperation()
                result = mul.operate(firstNum, operate, secondNum)
            }
            4 -> {
                val div = DivideOperation()
                result = div.operate(firstNum, operate, secondNum)
            }
            else -> {}
        }


        println("결과는 $result 입니다.")



        if (firstNum == -1 || secondNum == -1) {
            break
        }

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



// 1. 연산 클래스를 만든 후 클래스간의 관계를 고려하여 Calculator 클래스와 관계를 맺기
open class Calculator { // 3. 계산기 클래스는 계산과 반환하는 1가지의 역할.
    open fun operate(firstNum: Int, operate: Int, secondNum: Int): Int { // class도 opeate도 자식 클래스에서 사용하고, 자식 클래스에서 operate를 사용하기 위해 override를 하기 때문에 앞에 각각 open을 붙힌다.
        val result: Int = 0
        return result // operate로 뭔가 할건데 그에 대한 결과를 변수를 선언해서 결과에 담겠다는 뜻?
    }
}

// 4. 연산은 아래 4가지의 클래스들이 나눠서 맡는다.  operate를 상속 받아서 잘 쓰는중.
class AddOperation: Calculator() {
    override fun operate(firstNum: Int, operate: Int, secondNum: Int): Int {
        return firstNum + secondNum
    }
}

class SubtractOperation: Calculator() {
    override fun operate(firstNum: Int, operate: Int, secondNum: Int): Int {
        return firstNum - secondNum
    }
}

class MultiplyOperation: Calculator() {
    override fun operate(firstNum: Int, operate: Int, secondNum: Int): Int {
        return firstNum * secondNum
    }
}

class DivideOperation: Calculator() {
    override fun operate(firstNum: Int, operate: Int, secondNum: Int): Int {
        return firstNum / secondNum
    }
}