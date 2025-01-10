
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputBuffer {
  public static void main(String[] args) throws NumberFormatException, IOException {
    System.out.println("enter your age");

    InputStreamReader is = new InputStreamReader(System.in);

    BufferedReader br = new BufferedReader(is);
    Integer numbs = Integer.parseInt(br.readLine());
    System.out.println(numbs);

    // * you can also ge user input with scanner which is the newest method.

    System.out.println("enter your score");
    try (Scanner sc = new Scanner(System.in)) {
      int s = sc.nextInt();
      System.out.println(s);
    }
  }
}
