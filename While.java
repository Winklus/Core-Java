public class While {

  static int accountBalance = 10_000;
  static int costOfChamp = 1_000;
  public static void main(String[] args) {

    while (accountBalance >= costOfChamp) {
      System.out.println("Bring me more Champagne");
      accountBalance -= costOfChamp;
      
    }
    System.out.println("oh friend no more cash");
    System.out.println(accountBalance);
  }

}
