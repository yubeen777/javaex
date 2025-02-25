package array;

public class ArrayLoop_기초정리2 {
  public static void main(String[] args) {
    //배열의 순회
    String[] coffees = {"아메리카노","라떼","카푸치노","아샷추"};


    //for 반복문 순회 (fori 쓰면 자동 생성 됨 밑에처럼)
    for (int i = 0; i < 4; i++) {
      System.out.println(coffees[i] + "하나");
    }

    System.out.println("-------------------------------------");

    //배열의 길이를 이용한 순회(실질적으로 배열의 길이를 정확히 알지 못할때 사용)
                          //배열이름.length
    for (int i = 0; i < coffees.length; i++) {
      System.out.println(coffees[i] + "하나");
    }//이거는 인덱스 값으로 뭔가를 처리하고 싶을때 사용

    System.out.println("-------------------------------------");


      //enhanced for (for-each) 반복문
      // for(배열의 자료형 지정하고싶은이름 : 순회할 배열이름) {}
      for (String coffee : coffees) {
        System.out.println(coffee + "하나");
      }

      /*
      foreach를 하면 자동으로 위에 문법이 만들어짐
      배열의 순회를 처음부터 끝까지 함

      */

  }
}
