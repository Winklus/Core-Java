abstract class  Opener 
{
    public abstract void openingDrink();
  
}

public class CombineAbstractWithInnerClass 
{
    public static void main(String[] args) {
      
      Opener o = new Opener() {
        public void openingDrink() {
          System.out.println("keeping opening these drinks");
        }
      };
      o.openingDrink();
    }
}