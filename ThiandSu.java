class A
 {

  public A() {
    super();
    System.out.println("in A constructor");
  }

  public A(int n) {
    super();
    System.out.println("in A constructor int");
  }
}

class B extends A
{
  public B() {
    super();
    System.out.println("in B constructor");
  }

  public B(int n) {
    super();
    System.out.println("in B constructor int");
  }
}

public class ThiandSu {
  public static void main(String[] args) {
    B obj = new B();
    B obj1 = new B(5);
  }
}
