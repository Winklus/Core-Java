class Calculator
{
  public int add(int n1, int n2) {
    return n1 + n2;
  }
}

class AdvanceCalculator extends Calculator
{
//  the add method here is overriding the add method in Calculator class.
  public int add(int n1, int n2) {
    // return super.add(n1, n2 + 1); this is same as return in the next line.
    return n1 + n2 + 1;
  }
}

public class MethOr {
  public static void main(String[] args) {
    AdvanceCalculator ac = new AdvanceCalculator();
    int r = ac.add(5, 10);
    System.out.println(r);
  }
}
