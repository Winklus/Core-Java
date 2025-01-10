public class Mdimensional {
  
  public static void main(String[] args) {
    
    int[][] numbs = new int[3][5];
    numbs[0][0] = 41;
    numbs[0][1] = 14;
    numbs[0][2] = 78;
    numbs[0][3] = 34;
    numbs[0][4] = 39;

    numbs[1][0] = 40;
    numbs[1][1] = 11;
    numbs[1][2] = 88;
    numbs[1][3] = 33;
    numbs[1][4] = 19;

    numbs[2][0] = 14;
    numbs[2][1] = 12;
    numbs[2][2] = 18;
    numbs[2][3] = 13;
    numbs[2][4] = 29;

    for(int i = 0; i < 3; i++){

      for(int j = 0; j < 5; j++){

        System.out.print(numbs[i][j] + " ");
      }
      System.out.println();
    }


    int[][] abc = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
    for(int a = 0; a < 3; a++){

      for(int b = 0; b < 4; b++){
        abc[a][b] = (int) (Math.random() * 10 + 1);
        System.out.print(abc[a][b] + " ");
      }
      System.out.println();
    }
    for (int[] is : abc) {
      for (int i : is) {
        System.out.print(i + " ");
      }
      System.out.println();
    }

  }
}
