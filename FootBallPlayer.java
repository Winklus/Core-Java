abstract class Ball
{
  abstract void dribble();

  abstract void shot();

  abstract void pass();

  abstract void head();

  public String spellBall() {
    return "B A L L";
  }
}

class CristianoRonaldo extends Ball
{
  void dribble() {
    System.out.println("uses level over to dribble pass opponent");
  }

  void shot(){
    System.out.println("99.9 percent shot on goal accuracy");
  }

  void pass(){
    System.out.println("make straight and short pass");
  }

  void head(){
    System.out.println("He has prove the law of gravity wrong");
  }
}

class LeoMessi extends Ball
{
  void dribble() {
    System.out.println("dribble fast with left leg");
  }

  void shot(){
    System.out.println("93 percent shot on goal accuracy");
  }

  void pass(){
    System.out.println("make curve passes");
  }

  void head(){
    System.out.println("A powerful head against Manchester United in champion league final");
  }
}

public class FootBallPlayer {
  public static void main(String[] args) {
    
    LeoMessi lm10 = new LeoMessi();
    lm10.dribble();
    lm10.shot();
    lm10.pass();
    lm10.head();

    Ball cr7 = new CristianoRonaldo();
    cr7.dribble();
    cr7.shot();
    cr7.pass();
    cr7.head();
  }

}
// * NB if u have a class that is extending the abstract class and it does not implement all the method of the abstract class thought that method too has been an abstract class

//  * An abstract class can have both abstract method and non abstract method 

// * but a non abstract class cannot have abstract method

// * you cannot create an object of an abstract class

// * but u can create a reference of an abstract class
