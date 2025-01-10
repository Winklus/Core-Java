class Calculator
{
  public int addNumbs(int a, int b){
    return a + b;
  }

  public int subNumbs(int a, int b){
    return a - b;
  }
  public int divNumbs(int a, int b){
    return a / b;
  }
  public int multiNumbs(int a, int b){
    return a * b;
  }
}

class ScientificCalculator extends Calculator
{
  public double modNumbs(int a, int b){
    return a % b;
  }

  public double areaOfCircle(double r) {
    return Math.PI * r * r;
  }
}

public class Inherite {
  public static void main(String[] args) {
    ScientificCalculator sc = new ScientificCalculator();
    int result1 = (int) sc.addNumbs(5, 7);
    System.out.println("Sum of two numbers: " + result1);

    int result2 = (int) sc.multiNumbs(5, 10);
    System.out.println("Product of two numbers: " + result2);

    int result3 = (int) sc.areaOfCircle(7);
    System.out.println("Area of a circle: " + result3);
  }
}


