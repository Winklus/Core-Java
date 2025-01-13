import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEac {

  public static void main(String[] args) {
    

    List<Integer> numbs = Arrays.asList(3,7,2,8,4,12,5,9,10);

    Consumer<Integer> c = new Consumer<Integer>() {
      public void accept(Integer n){
        System.out.println(n);
      }
    };
    Consumer<Integer> con = n -> System.out.println(n + 1);

    numbs.forEach(con);
    System.out.println("");
    numbs.forEach(n -> System.out.println(n + 1));
    System.out.println("");
    numbs.forEach(c);
  }
}