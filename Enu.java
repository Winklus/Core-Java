  // * enum or enumeration are name constant
enum Status
{
  Running, Pending, Failed, Success;
}

public class Enu {
  public static void main(String[] args) {
    Status ss = Status.Running;
    System.out.println(ss.ordinal());
    System.out.println(ss);


    Status[] xx = Status.values();
    for (Status x : xx) {
      System.out.println(x + " " + x.ordinal());
    }
  }
}
