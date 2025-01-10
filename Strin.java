public class Strin
{
  public static void main(String[] args) {
    
    String name = "Herbert";
    System.out.println(name.length());
    System.out.println(name.charAt(3));
    name = name.concat(" Macualay");
    System.out.println(name);
    System.out.println(name.contains("ert"));

    // Mutable and Immutable String!!!!


    // Mutable string
    StringBuffer sb = new StringBuffer("Alexander");
    System.out.println(sb.append(" Herbert"));
    System.out.println(sb.delete(0, 1));
    System.out.println(sb.capacity());
    String s = sb.toString();
    System.out.println(s.toUpperCase());
  }
}
