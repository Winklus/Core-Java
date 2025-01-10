// * CUSTOMIZE EXCEPTION
class BallException extends Exception
{
  public BallException(String s){
    super(s);
  }
}
public class CustomizeEx {
  public static void main(String[] args) {
    BallException be = new BallException("What a terrible pass.");

    String firstPass = "Beautiful pass";
    String secondPas = "Beautiful pass";
    try {
      if(firstPass != secondPas){
        throw new BallException(secondPas);
      }
      System.out.println("What a fantastic pass from Luka Modric");
    } catch (BallException e) {
      System.out.println("An error from the pass. " + be);
    }
  }
}
