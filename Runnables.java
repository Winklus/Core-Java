
class Alpha implements Runnable
{
  public void run() {
    char l = 'A';
    for(int i = 0; i < 26; i++){
      System.out.println(l);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      l++;
    }
  }
}

class Count implements Runnable
{
  public void run() {
    int count = 0;
    for(int i = 0; i < 26; i++){
      System.out.println(count);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      count++;
    }
  }
}

public class Runnables {
  
  public static void main(String[] args) throws InterruptedException {
    
    Runnable obj1 = new Alpha();
    Runnable obj2 = new Count();

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    t1.start();
    Thread.sleep(3);
    t2.start();

  }
}
