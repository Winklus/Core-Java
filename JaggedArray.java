public class JaggedArray {
  
  public static void main(String[] args) {
    int[][] numbs = new int[3][];

    numbs[0] = new int[5];
    numbs[1] = new int[4];
    numbs[2] = new int[8];

for (int[] nn : numbs) {

  for (int n : nn) {
    n = (int) (Math.random() * 10);
    System.out.print(n + " ");
      }
      System.out.println();
    }
  }
}
