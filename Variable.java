
public class Variable {
  // Declaring variables.
  byte b;
  short s;
  int i;
  long l;
  boolean bo;
  double d;
  float f;
  char c = '$';
  char cc = '8';
  char ccc = 'a';


  // Accessing the value of variables using getters and setters.
  public byte getB() {
    return b;
  }

  public void setB(byte b) {
    this.b = b;
  }

  public short getS() {
    return s;
  }

  public void setS(short s) {
    this.s = s;
  }

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }

  public long getL() {
    return l;
  }

  public void setL(long l) {
    this.l = l;
  }

  public boolean isBo() {
    return bo;
  }

  public void setBo(boolean bo) {
    this.bo = bo;
  }

  public double getD() {
    return d;
  }

  public void setD(double d) {
    this.d = d;
  }

  public float getF() {
    return f;
  }

  public void setF(float f) {
    this.f = f;
  }

  // But you can still make your variable public for every class but marking them 
  // public static

    // Declaring Static variables.
    static byte by = 34;
    static short sh = 203;
    static int in = 777_896;
    static long lo = 123_897_999_678l;
    static boolean bol = false;
    public static double dou = 37.85738;
    static float fl = 37.1289348f;



    public static void main(String[] args) {
      Variable v = new Variable();
      v.b = 7;
      v.bo = true;
      v.d = 7.8;
      v.f = 6.6f;
      v.i = 267;
      v.l = 176_879_234_789L;
      v.s = 212;
      System.out.println(v.b);
      System.out.println(v.bo);
      System.out.println(v.d);
      System.out.println(v.f);
      System.out.println(v.i);
      System.out.println(v.l);
      System.out.println(v.s);
  
      // printing static variable here i don't need to create an object of the class
      // then using setter and getter to assign the value before printing it.
      System.out.println(Variable.by);
      System.out.println(Variable.sh);
      System.out.println(Variable.dou);
      System.out.println(Variable.fl);
      System.out.println(Variable.lo);
      System.out.println(Variable.bol);
      System.out.println(Variable.in);
  
  
      // Accessing static variable and method in different class.
  
      Milli mi = new Milli();
      System.out.println(mi.numbOfLegs);
  
      // **** The method move1() is access with the instance of the Milli class which in this case is the mi.
      mi.move1();
      // The static method move2() from the type Milli should be accessed in a static
      // ****************   mi.move2(); we give you compiler issue.
  
      // ********** to access the move2(), you use the name of the class instead
      Milli.move2();
  
      System.out.println(mi.na);
      // **** System.out.println(mi.nam); since it a static variable u use the class name to access it 
      System.out.println(Milli.nam);
    }
}




class Milli
{
  int numbOfLegs = 7;
  String na = "centip";
  static String nam = "centipedes";

  public void move1(){
    System.out.println("m1 moving");
  }

  static public void move2(){
    System.out.println("m2 moving");
  }

}
