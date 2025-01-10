class BikeKey
{
 public void startBike() throws ClassNotFoundException {
  Class.forName("BikeKey");
 }
}

class SpeedoMeter extends BikeKey
{
  public void showGreen() throws ClassNotFoundException{
    startBike();
  }
}
public class DuckingException {
  static{
    System.out.println("Class is Loaded");
  }
  public static void main(String[] args) {
    BikeKey obj = new SpeedoMeter();
    try {
      obj.startBike();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
