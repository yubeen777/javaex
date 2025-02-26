package array;

public class max_main_Array {
  public static void main(String[] args) {
    // 1. 배열 선언 및 초기화
    int[] arr = {3, 5, 1, 9, 2};

    // 2. 초기값 설정 (배열의 첫 번째 값을 초기값으로 설정)
    int maxValue = arr[0];
    int minValue = arr[0];

    // 3. 배열을 순회하면서 최대값과 최소값 찾기
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > maxValue) {
        maxValue = arr[i];  // 최대값 갱신
      }
      if (arr[i] < minValue) {
        minValue = arr[i];  // 최소값 갱신
      }
    }

    // 4. 결과 출력
    System.out.println("최대값: " + maxValue);
    System.out.println("최소값: " + minValue);
  }
}
/*
예시 배열: `[3, 5, 1, 9, 2]`
    ### 처리 과정

1. **배열 선언 및 초기화**:
    - 배열 `arr`는 `{3, 5, 1, 9, 2}`로 초기화됩니다.

    2. **초기값 설정**:
    - `maxValue`와 `minValue`를 배열의 첫 번째 값으로 설정합니다. 즉, `maxValue = 3`, `minValue = 3`이 됩니다.

    3. **배열 순회**:
    - 배열의 두 번째 값부터 마지막 값까지 순차적으로 비교합니다.

    - **첫 번째 반복 (`i = 1`, 값 = 5)**:
    - `arr[1] = 5`는 `maxValue = 3`보다 크므로 `maxValue = 5`로 갱신됩니다.
    - `arr[1] = 5`는 `minValue = 3`보다 크므로 `minValue`는 갱신되지 않습니다.

   - **두 번째 반복 (`i = 2`, 값 = 1)**:
    - `arr[2] = 1`은 `maxValue = 5`보다 작으므로 `maxValue`는 갱신되지 않습니다.
     - `arr[2] = 1`은 `minValue = 3`보다 작으므로 `minValue = 1`로 갱신됩니다.

    - **세 번째 반복 (`i = 3`, 값 = 9)**:
    - `arr[3] = 9`는 `maxValue = 5`보다 크므로 `maxValue = 9`로 갱신됩니다.
    - `arr[3] = 9`는 `minValue = 1`보다 크므로 `minValue`는 갱신되지 않습니다.

   - **네 번째 반복 (`i = 4`, 값 = 2)**:
    - `arr[4] = 2`는 `maxValue = 9`보다 작으므로 `maxValue`는 갱신되지 않습니다.
     - `arr[4] = 2`는 `minValue = 1`보다 크므로 `minValue`는 갱신되지 않습니다.

4. **결과 출력**:
    - 모든 배열 원소를 확인한 후, `maxValue = 9`와 `minValue = 1`이 최종적으로 출력됩니다.

### 출력:
    ```
최대값: 9
최소값: 1
    ```

    ### 결론
자바에서는 배열을 순차적으로 순회하며 최대값과 최소값을 찾아내기 위해 첫 번째 값을 기준으로 초기값을 설정하고,
그 이후에 배열을 하나씩 비교하며 값을 갱신합니다.
이를 통해 배열을 한 번 순회만으로 최대값과 최소값을 구할 수 있습니다.*/