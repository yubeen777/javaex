package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo3 {
  public static void main(String[] args) {
    // 재활용성/유지보수가 편하게 작성해야 한다.
    // 1. 다섯 과목의 점수를 사용자로부터 입력받는다.
    // 2. 입력받은 점수를 배열에 저장한다.
    // 3. for 문을 사용한다.
    // 4. 입력받은 점수가 저장되어 있는 배열을 전부 읽어서 합계와 평균을 구한다.
    // 5. 입력받은 점수, 합계와 평균을 출력한다.

     // total += scores[1] 값 참조
     // scores[1] = 입력받은 값 변수

    Scanner in = new Scanner(System.in);
    int[] scores = new int[5];
    System.out.println("scores = " + Arrays.toString(scores));

    int total = 0;
    float avg = 0.0f;
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%d 번째 과목의 점수를 입력하세요 : ", i+1);
      scores[i] = in.nextInt();
    }

    for (int i = 0; i < scores.length; i++) {
      total += scores[i];
    }
    avg = total / (float)scores.length;
    System.out.println("scores = " + Arrays.toString(scores));
    System.out.println("total = " + total);
    System.out.println("avg = " + avg);
  }
}
