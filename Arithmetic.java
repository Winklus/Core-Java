public class Arithmetic {
  // **** Addition
  int num1 = 12;
  int num2 = 30;
  int result1 = num1 + num2;

  // *** subtraction 

  int num3 = 45;
  double num4 = 7.88;
  int result2 = (int) num4 + num3;

  // *** division 
  float f1 = 5.67f;
  float f2 = 6.43f;
  double result3 = f1 / f2;

  // *** multiplication

  int num5 = 3;
  int num6 = 7;
  short result4 = (short) (num5 * num6);


// ** Modulus

  int num7 = 24;
  int num8 = 9;
  int result5 = num7 % num8;


  public int getResult1() {
    return result1;
  }



  public int getResult5() {
    return result5;
  }



  public int getResult2() {
    return result2;
  }




  public double getResult3() {
    return result3;
  }




  public short getResult4() {
    return result4;
  }



  public static void main(String[] args) {
    Arithmetic a = new Arithmetic();

    System.out.println(a.result1);
    System.out.println(a.result2);
    System.out.println(a.result3);
    System.out.println(a.result4);
    System.out.println(a.result5);


    int num = 2;
    num += 5;
    System.out.println(num);

    // ** pre-increment and post-increment
    int n = 2;
    n++;
    System.out.println(n);

    int m = 2;
    ++m;
    System.out.println(m);

    int o = 2;
    System.out.println(o++);

  // * Here we are fetching the value of o and them increment it i.e two operation...

  int p = 2;
  System.out.println(++p);

  // * Here we are increment the value of p before sout it....

  // * let n = 7; ++n we give you 8 when fetching the data while n++ we give you 7 while fetching the data

  }
}
