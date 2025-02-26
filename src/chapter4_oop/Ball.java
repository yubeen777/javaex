package chapter4_oop;

public class Ball {

  //생성자(Constructor)
  public Ball(){ }//기본 생성자

  public Ball(double radius) {
    this.radius = radius;//this는 앞으로 쓸 객체의 이름을 몰라 미리 여기다 객체를 넣을거야 라는 의미이다
  }  //radius에 어떤 값이 들어오든 초기화 시켜주는 생성자
  //필드(변수)
  double radius;
  //매서드 (동작)
  double getRadius(){
    return 4/3 * 3014 * radius * radius * radius ;
  }
  static void print(){
    System.out.println("공입니다.");
  }
}
