
class Car
{
  static
  {
    String engine = "V_18";
    System.out.println(engine + " in static block");
  }
  public Car(){
    int doorCount = 4;
    String tyre = "Michelin";
    System.out.println(doorCount + tyre + " tyres for all Car" +"." + " in car constructor");
  }
}

public class StaBlock {
  
  public static void main(String[] args) throws ClassNotFoundException {
    // Anytime u create a class two things happenes, first the class load and second the object is created but the static variable is call once when the class is load.

    // But the constructor is called many times depending on the number of objects created so u can see from the example here the constructor is called twice cos two instance of car object are created.

    // but if u want to call the static block without creating an instance of the class you use
    Class.forName("Car");
    

    Car c1 = new Car();
    Car c2 = new Car();
  }
}

