package com.example.myonlycalculator

// 해결 해야할 것
// 1. Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
// while문 안에서나 클래스에서 Int타입 말고 다른 타입의 값을 입력했을때 나오는 오류이다. 예외처리를 통해 처리해주면 좋겠다.
// 추가로!!
// 연산자 입력 받는 부분에도 예외처리를 해주면 좋겠다.



// 3. 33-34번줄, 81번줄 잘 이해한게 맞는지 수정 혹은 첨언 부탁 드립니다.

// 4. 80번줄 inline variable 할 수 있다는데 어떻게 할까?

fun main() {

    while (true) {
        println("안녕하세요 연산을 시작합니다!")
        println("첫 번째 숫자를 입력 해주세요.")
        val firstNum: Int = readLine()!!.toInt()


        println("연산자를 선택하여 주세요. \n[1]덧셈, [2]뺄셈, [3]곱셈, [4]나눗셈")
        val operate: Int = readLine()!!.toInt()
        println("두 번째 숫자를 입력 해주세요.")
        val secondNum: Int = readLine()!!.toInt()

        val cal = Calculator()

        var result: Int = 0

        when (operate) {
            1 -> {
                val add = AddOperation()
                result = add.operate(firstNum, secondNum)
            }
            2 -> {
                val sub = SubtractOperation()
                result = sub.operate(firstNum, secondNum)
            }
            3 -> {
                val mul = MultiplyOperation()
                result = mul.operate(firstNum, secondNum)
            }
            4 -> {
                val div = DivideOperation()
                result = div.operate(firstNum, secondNum)
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
// operate 파라미터는 왜 빼야했던 걸까? 일단 파라미터에 뺏으니까 위에 메인에서 처리하는게 아니라 온전히 연산 클래스에서 처리하겠다는 느낌인가?



open class Calculator {
    // 2. 추상연산 클래스가 생기고 연산 클래스들이 추상연산 클래스를 상속 받으면서, 계산기 클래스의 역할이 사라졌다.
        // 단일책임원칙 : 더하기든 뺄셈이 하나의 연산을 하자. -> 목표
        // 연산자가 없어졌다. -> 하위 클래스에서 override하면서 연산자를 썻었는데 이제는 없어졌다.
        // 해결방법은 operation이라는 새로운 파라미터를 만들어서 추상화연산 클래스를 쓸거다.
    open fun operate(operation: AbstractOperation, firstNum: Int, secondNum: Int): Int {
//        val result: Int = 0
//        return result //

        // class가 생성되면 = 인스턴스가 된다.
        // = val operation = AbstractOperation
        // -> 위의 operation 파라미터와 동일하다. -> 파라미터에 인스턴스를 가져올 수 있다.
        // operation은 인스턴스이다. 즉, AddOpertaion 클래스에서 공개된 변수와 함수를 사용할 수 있다.

        // 추상화란 이런거다...
        // operation 더하기인지 뭔진 몰, operate 연산만 추상화 클래스가 있다는것만 알고 그 안에 뭐가 있고 뭐가 들었는지 모른다.
        // 연산자는 모르지 아래 코드에서 알아서 연산을 할 수 있다.
        return operation.operate(firstNum, secondNum)
//        val result: Int = operation.operate(firstNum, secondNum)
//        return result
        // 위 두줄의 코드를 한줄로 줄인게 그 위에 코드다.
    }
}

// 1. 추상 클래스를 만들었고 아래 연산 클래스들은 모두 AbstractOperation이기 떄문에 계산기 상속 받던걸 AbstractOperation으로 바꿔준다.
// 더하기 빼기 모두다 = AbstractOperation이다.
abstract class AbstractOperation {
    abstract fun operate(firstNum: Int, secondNum: Int): Int
}


class AddOperation: AbstractOperation() {
    override fun operate(firstNum: Int, secondNum: Int): Int {
        return firstNum + secondNum
    }
}

class SubtractOperation: AbstractOperation() {
    override fun operate(firstNum: Int, secondNum: Int): Int {
        return firstNum - secondNum
    }
}

class MultiplyOperation: AbstractOperation() {
    override fun operate(firstNum: Int, secondNum: Int): Int {
        return firstNum * secondNum
    }
}

class DivideOperation: AbstractOperation() {
    override fun operate(firstNum: Int, secondNum: Int): Int {
        return firstNum / secondNum
    }
}