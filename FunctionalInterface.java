interface Opener {
  void opensDrinks();
  
}
public class FunctionalInterface {
  public static void main(String[] args) {
    
    Opener obj = new Opener() {
       public void opensDrinks() {
             System.out.println("can u open my drink");
             }
    };
      obj.opensDrinks();
      
    Opener obj1 = () -> System.out.println("can u open my drink");
            obj1.opensDrinks();
  }
}
