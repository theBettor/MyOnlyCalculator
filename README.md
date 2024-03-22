## 1단계. 문제 해결 능력
: 연산 클래스들을 AbstractOperation 라는 클래스명으로 만들어 사용하여 추상화하자. = Kotlin 추상화 클래스 만드는 법을 이용하여 더하기, 뺄셈, 곱하기 나눗셈 클래스를 수정한다
<br>  
1. Calculator 클래스의 내부 코드를 변경합니다.<br>  
  = 각 연산 클래스는 Calculator 클래스를 상속 받지 않는다<br>  
  = Calculator 는 지금까지 첫번째 숫자, 두번째 숫자, 연산자 를 받아서 결과를 반환한다.<br>  
  = 연산자가 숫자가 아닌 추상화 하여 만든 연산자 클래스를 받아야 한다.<br>  
  = 연산자 클래스는 더하기, 뺄셈, 곱하기, 나눗셈 4가지 있는 이를 하나로 통일이 필요하다.<br>  
<br>
* hint. 클래스간의 결합도, 의존성(의존성역전원칙) -> 위 이론을 적용하게 되면 결합도와 의존성에 대해 이해할 수 있다.
<br>
<br>

## 2단계. 필요 개념 찾기, 이해하기 : 의존성역전원칙를 준수한 추상화 인스턴스 사용
<br>

**원시 타입, 참조 타입에 대한 이해가 필요**

```kotlin
val calculator: Calculator = Calculator()
val sumResult = calculator.operate(operation)
```
calculator 는 param으로 operation 를 전달, 이렇게 함으로써 의존성 역전 원칙이 성립 한다 왜 그럴까? 자료형 타입이 OO 이기 때문에 어떤 클래스가 생성이 되었는지 만든 Calculator 클래스 코드에서는 알 길이 없다.<br>
operation 안에 뭐가 있는지 AbstractOperation 에 선언된 추상화 함수만 안다. 즉, AddOperation 이 아닌 SubstractOperation 인스턴스도 calculator.operate() 파라미터로 전달할 수 있다.<br>

```kotlin
val subOperation: AbstractOperation = SubstractOperation()
val subResult = calculator.operate(subOperation)
```
operation, subOperation 은 같은 자료형 AbstractOperation 이지만 다른 Class로 생성되었다 그러므로 Calculator 클래스는 AbbOperation 인지 SubstractOperation 인지 특정 한 클래스에 의존하지 않는다 = 의존성 역전 원칙

///
