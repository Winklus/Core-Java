class CashDeposit
{
    int accountBalance;
    public synchronized void deposit(){
        accountBalance++;
    }
}

public class Threads {
  public static void main(String[] args) throws InterruptedException {
    
    CashDeposit m = new CashDeposit();
           Runnable p1 = () -> {
                for(int j = 1; j <= 10000; j++){
                    m.deposit();
                }
           };
           Runnable p2 = () -> {
                for(int j = 1; j <= 10000; j++){
                   m.deposit();
                }
           };
           Thread t1 = new Thread(p1);
           Thread t2 = new Thread(p2);
           t1.start();
           t2.start();
           t1.join();
           t2.join();
           System.out.println(m.accountBalance);

  }
  
}
