package chapter4_oop;

public class CircleDemo {
  public static void main(String[] args) {
    Circle circle = new Circle(10);
    System.out.println(circle.radius);
    System.out.println(circle.findArea());
  }
}