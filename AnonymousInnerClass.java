class MF
{
  public void germinate() {
    System.out.println("germinate");
  }
}


public class AnonymousInnerClass {
  public static void main(String[] args) {
    
    MF m = new MF(){
      public void germinate() {
        System.out.println("germinate very fast famine is coming");
      }
    };
    m.germinate();
  }
}
