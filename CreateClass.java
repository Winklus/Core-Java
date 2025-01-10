
class BasicCalc
 {
  private String name;
  private String brand;
  private double price;

  
  
  public String getName() {
    return "Calc type is " + name +".";
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return "Brand is " + brand +"!";
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getPrice() {
    return "Selling price " + "$"+price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int addTwo(int num1, int num2){
    return num1 + num2;
  }

  public int subTwo(int num1, int num2){
    return num1 - num2;
  }
  
  public int mulTwo(int num1, int num2){
    return num1 * num2;
  }

  public int divTwo(int num1, int num2){
    return num1 / num2;
  }
  
  public int modTwo(int num1, int num2){
    return num1 % num2;
  }
  
}


public class CreateClass 
{
  public static void main(String[] args) {
    BasicCalc bc = new BasicCalc();

    bc.setName("basic calc");
    bc.setBrand("Casino");
    bc.setPrice(78.8);

    System.out.println(bc.getName());
    System.out.println(bc.getBrand());
    System.out.println(bc.getPrice());

    int result1 = bc.addTwo(4, 2);
    System.out.println(result1);

    int result2 = bc.subTwo(4, 2);
    System.out.println(result2);

    int result3 = bc.divTwo(4, 2);
    System.out.println(result3);

    int result4 = bc.mulTwo(4, 2);
    System.out.println(result4);

    int result5 = bc.modTwo(4, 2);
    System.out.println(result5);

  }
}
