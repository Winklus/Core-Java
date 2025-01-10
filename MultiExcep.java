public class MultiExcep {
  public static void main(String[] args) {
    int i = 0;

    try {
      
      double r = 18 / i;
      System.out.println(r);

    } catch (ArithmeticException e) {
      System.out.println("cannot divide by zero" + e);
    }

    int[] numbs = new int[5];
    try {
      int n = numbs[6];
      System.out.println(n);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index out of limit" + e);
    }

    try {
      int a = 18 / 0;
      System.out.println(a);
    } catch (Exception e) {
      System.out.println("can't divide by zero" + e);
    }
  }
}
