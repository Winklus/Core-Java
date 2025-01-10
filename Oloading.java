class Calculator {

  public int add(int num1, int num2){
    return num1 + num2;
  }

  public int add(int num1, int num2, int num3){
    return num1 + num2 + num3;
  }
  
}
public class Oloading {
  public static void main(String[] args) {

    Calculator calc = new Calculator();
    int r1 = calc.add(3, 7);
    System.out.println(r1);
    int r2 = calc.add(3,7,5);
    System.out.println(r2);
  }
}
// Method overloading just work like a some motorist behave in Nigeria, a car that is meant to carry four passengers they will use to carry four passengers sometimes and the same car the we also use to carry 6 passengers another. so in method overloading is the passenger that are just changing every other thing remain the same. and the passengers in this concept are know as parameters