interface AddMachine {
  int add(int x, int y, int z);
}

public class LambdaReturn {
  public static void main(String[] args) {
    
    AddMachine am = new AddMachine() {
      public int add(int x, int y, int z) {
        return x + y + z;
      }
    };
     int result1 = am.add(5, 90, 21);
     System.out.println(result1);


     AddMachine obj = (x, y, z) -> x + y + z;
     int result2 = obj.add(4, 6, 10);
     System.out.println(result2);
  }
}
