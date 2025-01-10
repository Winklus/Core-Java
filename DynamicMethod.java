class Calculator
{
  public int add(int a , int b) {
    return a + b;
  }
}

class ScientificCalculator extends Calculator
{
  public int add(int a, int b) {
    return a + b + 10;
  }
}

class AdvanSciCalculator extends ScientificCalculator
{
  public int add(int a, int b) {
    return a + b + 20;
  }
}


public class DynamicMethod 
{
public static void main(String[] args) {

  Calculator obj = new Calculator();
  int r1 = obj.add(5,  9);
  System.out.println(r1);


obj = new ScientificCalculator();
int r2 = obj.add(10, 10);
System.out.println(r2);


obj = new AdvanSciCalculator();
int r3 = obj.add(10, 10);
System.out.println(r3);
}
}