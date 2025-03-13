/*

    ### 예시 1: `&&` (AND) 연산자

```java
boolean A = false;
boolean B = true;

if (A && B) {
    System.out.println("이 코드는 실행되지 않아요.");
}
    ```

이 코드에서 `A && B`는 `false && true`입니다. `A`가 `false`이므로, 전체 조건은 `false`가 됩니다. 그래서 `B`는 평가되지 않고, `if`문 내부의 코드는 실행되지 않습니다.

### 예시 2: `||` (OR) 연산자

```java
boolean A = true;
boolean B = false;

if (A || B) {
    System.out.println("이 코드는 실행돼요.");
}

이 코드에서 `A || B`는 `true || false`입니다. `A`가 `true`이므로, 전체 조건은 `true`가 됩니다. 따라서 `B`는 평가되지 않고, `if`문 내부의 코드가 실행됩니다.

    ### 핵심
- `&&`에서는 첫 번째 조건이 `false`면 두 번째 조건을 평가하지 않고 바로 `false`로 결과가 확정됩니다.
- `||`에서는 첫 번째 조건이 `true`면 두 번째 조건을 평가하지 않고 바로 `true`로 결과가 확정됩니다.

이러한 방식이 **쇼트 서킷 평가**입니다.*/