class X
{
  public X() {
    super();
    System.out.println("in X constructor");
  }

  public X(int n) {
    super();
    System.out.println("in X constructor int");
  }
}

class Z extends X
{
  public Z() {
    super();
    System.out.println("in Z constructor");
  }
  public Z(int n) {
    this();
    System.out.println("in Z constructor int");
  }
  
} 

public class D
{
  public static void main(String[] args) {
    Z ze = new Z();

    Z zee = new Z(7);

    Z zeee = new Z(8);
    
    Z zeeee = new Z(10);
  }
}