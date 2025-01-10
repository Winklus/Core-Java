class Phone
{
  private String name;
  private int price;
static String category = "Smartphone";


  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }

  public void phoneProperties(Phone x){
    System.out.println(name + " is price " + "$" + price + " type: " + category);
  }

  
}

public class GandS
{
  public static void main(String[] args) {
    
    Phone p1 = new Phone();
    p1.setName("Tecno Spark 7");
    p1.setPrice(120_000);
    p1.phoneProperties(p1);

  Phone p2 = new Phone();
  p2.setName("iPhone 18 Pro Max");
  p2.setPrice(1200_000);
  p2.phoneProperties(p2);
  }
}