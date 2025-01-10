class Developer
{
  public void writeCode(Computer c){
    c.code();
    c.debug();
  }
}
interface Computer
{
    void code();
    void debug();
}

class Desktop implements Computer
{
    public void code(){
      System.out.println("Desktop run code very fast");
    }

    public void debug(){
      System.out.println("Desktop debug code faster");
    }
}

class Laptop implements Computer
{
  public void code(){
    System.out.println("Laptop run code");
  }

  public void debug(){
    System.out.println("Laptop debug code");
  }
}


public class Interf {
  
  public static void main(String[] args) {
    Computer com = new Desktop();
    Computer lp = new Laptop();
    Developer dev = new Developer();
    dev.writeCode(com);
    // dev.writeCode(lp);
  }
}

//  * You can have one class implementing multiple interface
// * Interface can also extends another interface i.e the super class