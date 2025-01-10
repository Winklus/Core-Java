enum Laptop
{
      Macbook(2000), XPS(2500), Surface(1500), Thinkpad(1800);

      int price;
      private Laptop(int price){
        this.price = price;
      }
      public int getPrice() {
        return price;
      }
}
public class EnuClass {
  
  public static void main(String[] args) {
    Laptop[] ll = Laptop.values();

    for (Laptop l : ll) {
      System.out.println(l + " :" + l.getPrice());
    }
  }
}
