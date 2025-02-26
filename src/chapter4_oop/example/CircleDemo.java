package chapter4_oop.example;

class CircleDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    System.out.println(c1.radius);
    System.out.println(c1.color);
    Circle c2 = new Circle(-5.0);
    System.out.println(c2.radius);
    System.out.println(c2.color);
    Circle c3 = new Circle("");
    System.out.println(c3.radius);
    System.out.println(c3.color);
    Circle c4 = new Circle(3.0, null);
    System.out.println(c4.radius);
    System.out.println(c4.color);
  }
}