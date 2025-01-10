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

class AdvanceScientificCalculator extends ScientificCalculator
{
  public double generateRandomNumber(int n){
    return Math.random() * n;
  }
}


public class SingleMultiLevInheritance extends AdvanceScientificCalculator
{
  public static void main(String[] args) {
    
    SingleMultiLevInheritance smi = new SingleMultiLevInheritance();
    int r1 = (int)smi.addNumbs(3, 7);
    System.out.println(r1);

    int r2 = (int) smi.generateRandomNumber(7);
    System.out.println(r2);
  }
  
}