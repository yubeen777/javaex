package chapter4_oop;

public class Person {
  private String name;
  private int age;
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
//  public void setName(String name){
    public Person setName(String name){
      this.name = name;
      return this;
    }
//    public void setAge(int age){
      public Person setAge(int age){
        this.age = age;
        return this;
      }
//      public void show() {
//        System.out.printf("제 이름은 %s 이고 나이는 %d 입니다.", name, age);
        public void sayHello() {
          System.out.printf("제 이름은 %s 이고 나이는 %d 입니다. \n", name, age);
        }
      }