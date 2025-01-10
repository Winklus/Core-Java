interface Players
{
    String club = "Real Madrid";
    void dribble();
    void shot();
    void pass();
}

class Leo implements Players
{

  public void dribble() {
    System.out.println("fastest dribbler");
    
  }

  public void pass() {
    System.out.println("curve passer");
    
  }

  public void shot() {
    System.out.println("shot and score");
    
  }
}

public class Interfac {
  public static void main(String[] args) {
    Players le = new Leo();
    le.dribble();
    le.pass();
    le.shot();
    System.out.println(Players.club);
  }
}

// * by default all interface are public abstract so u don't have to mention it in the methods.
//  * all the variable in interface are final and static.
// * the static variable in interface is only access with the interface name not the object reference...
