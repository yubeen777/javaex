package chapter4_oop;

public class SingleTon {
  private static SingleTon singleTon = new SingleTon();
  private SingleTon() {

  }
  static SingleTon getInstance(){
    return singleTon;
  }
  public void method1(){}
}
