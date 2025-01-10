class Alphabets extends Thread
{
  public void run(){
    char x = 'A';
    for(int i = 0; i < 26; i++){
      System.out.println(x);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      x++;
    }
  }
}

class Numbs extends Thread
{
  public void run(){
    int y = 0;
    for(int i = 0; i < 26; i++){
      System.out.println(y);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      y++;
    }
  }
}

public class MakingObjectThreads {
  
  public static void main(String[] args) throws InterruptedException {
    Alphabets obj1 = new Alphabets();
    Numbs obj2 = new Numbs();

    Thread.sleep(1);
    obj1.start();
    Thread.sleep(1);
    obj2.start();
    Thread.sleep(2);
  }
}
