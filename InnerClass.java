class MangoFruit
{
  double price = 80;

  public void eatMango() {
    System.out.println("wow this is so so sweet!");
  }

  public double getPrice() {
    return price;
  }

  class MangoSeed
  {
    public void germinate() {
      System.out.println("Germinate and grow fast...");
    }
  }
}

public class InnerClass {
  public static void main(String[] args) {
    MangoFruit mf = new MangoFruit();
    mf.eatMango();
    System.out.println(mf.getPrice());

    MangoFruit.MangoSeed ms = mf.new MangoSeed();
    ms.germinate();
  }
}

// * NB  when you make MangoSeed a static call you can create the object of the MangoSeed by directly using the MangoFruit class

// * i.e MangoFruit.MangoSeed ms = new MangoFruit.MangoSeed();