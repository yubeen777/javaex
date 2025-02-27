package chapter4_oop;

public class Circle {
  // 원의 반지름과 넓이를 구하고자 한다.
  // 원의 넓이는 0보다 커야 한다.
  // 원이 생성될 때 크기가 정해진다. 크기는 생성 후에도 변경될 수 있다.
  // 원의 반지름과 넓이를 출력하는 기능이 있으면 좋겠다.
  public Circle(double radius) {
    if(radius <= 0) {
      this.radius = 1.0;
    } else {
      this.radius = radius;
    }
  }
  // 인스턴스 멤버
  // 필드
  private double radius;
  // 접근자(getter)와 설정자(setter)
  public double getRadius(){
    return radius;
  }
  public void setRadius(double radius){
    if(radius <= 0) {
      System.out.println("원의 반지름은 0 보다 커야 합니다.");
    } else {
      this.radius = radius;
    }
  }
  // 메서드
  double findArea() {
    final double PI = 3.141592653589793;
    return PI * radius * radius;
  }
  void show() {
    System.out.printf("원의 반지름은 %4.1f 이고 원의 넓이는 %.2f 입니다. \n", radius, findArea());
  }
}/*`%.2f`는 `printf`에서 `double` 또는 `float` 값을 출력할 때 사용하는 포맷 문자열입니다.

여기서 `.` 뒤의 숫자 `2`는 소수점 이하 자릿수를 지정합니다. 즉, `%.2f`는 "소수점 이하 두 자리를 출력하라"는 의미입니다. `f`는 부동소수점 값을 출력하라는 뜻이고, `.` 뒤의 숫자는 몇 자리를 표시할지 결정합니다.

예를 들어:

    - `%.2f`는 소수점 이하 두 자리를 출력합니다. (예: `3.141592653589793` -> `3.14`)
    - `%.3f`는 소수점 이하 세 자리를 출력합니다. (예: `3.141592653589793` -> `3.142`)

이렇게 `%.2f`를 사용하면, 반지름이나 넓이를 소수점 두 자리까지 깔끔하게 출력할 수 있습니다. 필요에 따라 소수점 자리수를 조정할 수 있습니다.*/