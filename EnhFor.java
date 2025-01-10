public class EnhFor {
  public static void main(String[] args) {
    String[] names = new String[4];

    names[0] = "Alex";
    names[1] = "Peter";
    names[2] = "Paul";
    names[3] = "Leo";

    for(String name : names){
      System.err.println(name);
    }
  }
}
