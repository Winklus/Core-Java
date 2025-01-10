public class Do {

  public static void main(String[] args) {

    int pocketMoney = 0;
    int priceOfSuya = 200;
    do {
      System.out.println("Eat some Suya Customer");

      
      pocketMoney -= priceOfSuya;
      //  pocketMoney -= priceOfSuya is same as saying pocketMoney = pocketMoney - priceOfSuya;
    } while (pocketMoney >= priceOfSuya);
    // System.out.println(pocketMoney);
  }
  
}