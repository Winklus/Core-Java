public class Conversion {
  // **** Casting is done when you have a value that is bigger and you want to put it inside a small container example putting the value of double which is 64 bit into a float container which is 32 bit.

  static double d = 4.18749874652;

  static float f = (float) d;

  static long lo = 9_7834_535_92L;

  static int in = (int) lo;

  // *** type casting result into possible lost of value as you see when you compiler the example above.


  // **** type conversion is done automatically since here you are just putting a small value into a bigger container 

  static int num = 78;
  static double numbs = num;


  


  public static void main(String[] args) {
    System.out.println(Conversion.d);
    System.out.println(f);

    System.out.println(Conversion.lo);
    System.out.println(in);

    System.out.println(num);
    System.out.println(numbs);
  }
}
