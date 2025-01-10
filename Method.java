class Pen 
{
  public void write() {
    System.out.println("write a letter to Abraham Lincoln");
  }
  
  public String getPrice() {
    return "Price: $20";
  }
}

public class Method {
  public static void main(String[] args) {
    Pen p = new Pen();
    p.write();
    String st = p.getPrice();
    System.out.println(st);
  }
}

// when a method return a value u have to collect it and store it in a variable. just like if u ask someone to give you something u have to collect it.
