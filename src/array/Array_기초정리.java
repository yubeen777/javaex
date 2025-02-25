package array;

import java.util.Arrays;

public class Array_기초정리 {
  public static void main(String[] args) {
    //배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
    String coffeRoss = "아메리카노";
    String coffeMike = "라떼";
    String coffeChandler = "카푸치노";
    String coffeMonica = "아샷추";

    System.out.println(coffeRoss + "하나");
    System.out.println(coffeChandler + "하나");
    System.out.println(coffeMike + "하나");
    System.out.println(coffeMonica + "하나");
    System.out.println("주세요");
//이럴게 하면 나중에 코드를 많이 짜게 되면 변수 이름이 뭔지 헷갈리는 경우가 많아진다
//그래서 이용하는게 배열!



//     배열 선언 첫번째 방법
//    String[] coffees = new String[4];//여기다 몇개의 크기로 만들건지를 입력해줘야 한다
//
//    1.5 방법  방법
//     String coffees[] = new String[4] //[]를 앞에 하냐 뒤에 하냐 차이
//    coffees[0] = "아메리카노";//이렇게 어느 인덱스 위치에 값을 넣을 건지 지정해줘야함
//    coffees[1] = "라떼";
//    coffees[2] = "카푸치노";
//    coffees[3] = "아샷추";


//    세번째 방법
//    String[] coffees = new String[] {"아메리카노","라떼","카푸치노","아샷추"};

    //네번째 방법
    String[] coffees =  {"아메리카노","라떼","카푸치노","아샷추"};//스트링 형태로 coffees에 배열로 넣는거다


    System.out.println("-------------------------");
    //커피주문
    System.out.println(coffees[0] + " 하나" );
    System.out.println(coffees[1] + " 하나" );
    //만약 중간에 배열 값을 변경하고 싶다면
    coffees[2] = "에스프레소";//이렇게 하면 변경된다
    System.out.println(coffees[2] + " 하나" );
    System.out.println(coffees[3] + " 하나" );


    /*다른 자료형
    int[] i = {1,2,3,4};
    System.out.println(i);//[I@3b07d329 이렇게 값이 나온다
   Java에서 배열을 출력할 때 배열의 참조값(주소값)이 출력되는 이유는,
    배열이 Object 클래스의 기본 toString() 메서드를 상속받기 때문입니다.
   이 메서드는 배열의 실제 내용이 아니라 클래스명과 해시코드를 반환합니다.*/

    int[] i = {1,2,3,4};
    System.out.println(Arrays.toString(i));

  }
}
/*
위의 방법은 int 배열에 한정된 것이 아닙니다.
**Arrays.toString()** 메서드는 모든 기본형 배열(예: boolean, char, byte, short, long, float, double)과 객체 배열에도 적용할 수 있습니다. 다만, 2차원 이상의 다차원 배열을 출력하려면 **Arrays.deepToString()**을 사용해야 합니다.

    예시:

    ```java
// 1차원 배열 예시
int[] intArray = {1, 2, 3, 4};
System.out.println(Arrays.toString(intArray));  // 출력: [1, 2, 3, 4]

// 2차원 배열 예시
int[][] twoDArray = {{1, 2}, {3, 4}};
System.out.println(Arrays.deepToString(twoDArray));  // 출력: [[1, 2], [3, 4]]
    ```

또한, for-each문을 사용한 방법은 배열의 타입과 상관없이 사용할 수 있습니다.
예를 들어:

    ```java
String[] strArray = {"apple", "banana", "cherry"};
for (String s : strArray) {
    System.out.print(s + " ");  // 출력: apple banana cherry
}
    ```

따라서, 배열의 내용을 출력하는 방법은 int 배열에만 국한되지 않고 모든 배열 타입에 적용할 수 있습니다.*/