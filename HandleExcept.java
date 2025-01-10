import java.util.Scanner;
class Random 
{
  int rand = (int) (Math.random() * 10 + 1);
  public int getRand() {
    return rand;
  }
  
}
public class HandleExcept {
  public static void main(String[] args) {

    System.out.println("Guess a number to win");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input == 0 || input > 10){
          System.out.println("Guess must be between 1 to 10");
        }
        Random r = new Random();
        int resp = r.getRand();
        boolean t = true;
        while(t){
          System.out.println("Guess a number");
          input = sc.nextInt();
          if(input == resp){
            System.out.println("Congratulation our $10 dollar winner");
            t = false;
          }
        } 
        System.out.println("Thanks for playing");
        sc.close();
      }
  };

