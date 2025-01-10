class A
{
  public void showMethodThatBelongsInClass() {
    System.out.println("in A show");
  }
}
class B extends A
{
  @Override
  public void showMethodThatBelongInClass() {
    System.out.println("in B show");
  }
}

public class Anno {

  public static void main(String[] args) {   
    B obj = new B();
    obj.showMethodThatBelongsInClass();
  }
}
// * Annotation simply means a supplement to the compiler or moderator. JUDGE ... LAWYER ... CLIENT