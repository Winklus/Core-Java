import java.util.Scanner;

public class TryWithRes {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int i = sc.nextInt();
      System.out.println(i);
    }
  }
}
