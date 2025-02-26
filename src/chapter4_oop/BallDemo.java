package chapter4_oop;

public class BallDemo {
  public static void main(String[] args) {
    Ball ball = new Ball();
    Ball.print();//이친구는 static을 가지고 있는 매서드를 가져올 수 있음
    System.out.println(" 공의 반지름은 " + ball.radius);
    System.out.println(" 공의 부피는 " + ball.getRadius());

    Ball b =new Ball(5.0);
    System.out.println("공의 반지름은" + b.radius);

    Ball c =new Ball(7.0);
    System.out.println("공의 반지름은" + c.radius);//this는 c로 되는거다

  }
}