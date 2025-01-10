class E
{
  public void show1() {
    System.out.println("in E");
  }
}

class F extends E
{
  public void show2() {
    System.out.println("in F");
  }
}

public class UpAndDownCasting {
  public static void main(String[] args) {
    // * this process is called up casting
    E obj = new F();
    obj.show1();
    //  * obj.show2();


    // * this process is called down casting 
    // * changing an object of parent or type E to subclass or Type F is call down casting.......
    F obj1 = (F) obj;
    obj1.show2();
  }
  
}