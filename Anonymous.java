class Bike
{
  public void start(){
    System.out.println("bike is moving!");
  }
}

public class Anonymous {
  public static void main(String[] args) {
    
    new Bike().start();
    //  * the above object is created but it not assign to a reference type and hence it is called anonymous object

  // * Just like people who hide their identity are said to be anonymous
  }
}
