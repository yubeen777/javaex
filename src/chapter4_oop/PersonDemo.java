package chapter4_oop;

public class PersonDemo {
  public static void main(String[] args) {
    Person person = new Person();
    person.setName("민국").setAge(21).sayHello();

    Person person1 = new Person();
    person1.setAge(21).setName("대한").sayHello();
  }
}