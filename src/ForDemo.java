public class ForDemo {
  public static void main(String[] args) {
    for(int i = 0; i < 3; i++) {
      System.out.println("Hello, world !" + i);
    }

    for (int i = 0; i < 10; i++) {
      if(i % 2 == 1) {
        System.out.println(i + 1);
      }
    }

    for (int i = 10; i > 0; i--) {
      System.out.println(i);
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(10 - i);
    }
  }
}