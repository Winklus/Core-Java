class Babies
{
  String name;
  int age;
  String skinColor;
  String height;
  // parameterized constructor 
  public Babies(String n, int a) {
    skinColor = "light skin";
    height = "1.98 Feet";
    this.name = n;
    this.age = a;
  }
  // default constructor
  public Babies(){
    skinColor = "light skin";
    height = "1.98 Feet";
  }

  public void babeDetail() {
    System.out.println(name + ": " + age + " " + height + ", " + skinColor);
  }
}

public class Construct {
  public static void main(String[] args) {
    Babies b1 = new Babies("Herbert", 27);
    b1.babeDetail();

    // *** Question??? Can i call two different constructor on one object?????
    // * the answer is no, u just add ur default value in the parameterize constructor with creating local variable for it....

    Babies b2 = new Babies();
    b2.babeDetail();
  }
}
