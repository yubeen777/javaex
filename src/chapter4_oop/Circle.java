package chapter4_oop;

public class Circle {
  // 원의 반지름과 넓이를 구하고자 한다.
  // 원이 생성될 때 크기가 정해진다.
  public Circle(double radius) {
    this.radius = radius;
  }

  // 인스턴스 멤버
  // 필드
  double radius;

  // 메서드
  double findArea() {
    final double PI = 3.141592653589793;
    return PI * radius * radius;
  }
}