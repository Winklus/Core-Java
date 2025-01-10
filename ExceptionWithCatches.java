import java.util.Scanner;

public class ExceptionWithCatches {
  public static void main(String[] args) {
    // * any time u want to write a risky behaviour is advisable to use a try and catch block..

    System.out.println("enter a whole number");
    Scanner sc = new Scanner(System.in);
    int numb = sc.nextInt();
    try {
      if(numb < 0){
        System.out.println("enter a positive whole number");
      }
      
      double r1 = 18 / numb;
      System.out.println(r1);
      
    } catch (Exception e) {
      System.out.println(e.getStackTrace());
    }
    finally{
      sc.close();
    }
  }
}
