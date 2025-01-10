import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {

    System.out.println("enter the name of ur fruit");

    try (Scanner sc = new Scanner(System.in)) {
      String fruit = sc.nextLine();

      switch (fruit) {
        case "mango" -> System.out.println("I love mangoes");
        case "orange" -> System.out.println("I love Oranges");
        case "grape" -> System.out.println("I love grape");
        case "apple" -> System.out.println("I love apple");
        default -> System.out.println("i don't have ur choice");
      }
    }
  }
}
