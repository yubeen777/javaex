public class ForDemo1 {
  public static void main(String[] args) {
    for (int dan = 2; dan <= 9; dan++) {
      System.out.println("----------------------");
      for (int i = 1; i <= 9; i++) {
        System.out.printf("%d X %d = %d \n", dan, i, dan * i);
      }
    }
  }
}