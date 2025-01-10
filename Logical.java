public class Logical {

  public static void main(String[] args) {
    BeerJoint bj = new BeerJoint();
              bj.setPrice(1000);
              bj.setBrand("Guinness");
              System.out.println(bj.getPrice());
              System.out.println(bj.getBrand());
              bj.toString();
              // Learn how the toString method work!!!
              bj.buyDrink(12, 3000);
              bj.buyDrink(20, 1000);
              bj.work(18, false);
              bj.work(12, false);
              bj.exist(false);
              bj.exist(true);
  }
}


class BeerJoint {

  private double price;
  private String brand;

  

  public double getPrice() {
    return price;
  }



  public void setPrice(double price) {
    this.price = price;
  }



  public String getBrand() {
    return brand;
  }



  public void setBrand(String brand) {
    this.brand = brand;
  }



  @Override
  public String toString() {
    return "BeerJoint [price=" + price + ", brand=" + brand + "]";
  }




  public void buyDrink(int age, double cash){
    if((age >= 18) && cash >= 1000)
      System.out.println("buy your beer");
    else
      System.out.println("we can't sale to minor");
  }



  public void work(int age, boolean educated)
  {
    if(age >= 18 || educated)
      System.out.println("you can apply for a job");
    else
      System.out.println("No job for you please");
  }
 

  
  public void exist(boolean pay){
    if(!pay)
      System.out.println("Can you kindly make your payment?");
    else
      System.out.println("Thanks for your patronage");
  }
}