import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sset {
  public static void main(String[] args) {
    
    Set<Integer> numbs = new HashSet<>();
    numbs.add(2);
    numbs.add(4);
    numbs.add(6);
    numbs.add(8);
    numbs.add(10);
    numbs.add(90);
    numbs.add(2);

    for (Integer n : numbs) {
      System.out.println(n);
    }

    System.out.println("");

    // * TreeSet sort out ur elements in descending order
    Set<Integer> num = new TreeSet<>();
    num.add(21);
    num.add(14);
    num.add(6);
    num.add(8);
    num.add(10);
    num.add(90);
    num.add(2);

    for (Integer n : numbs) {
      System.out.println(n);
    }


    List<Integer> x = new ArrayList<>();
    x.add(3);
    x.add(5);
    x.add(8);
    x.add(7);
    System.out.println(x);
  System.out.println(x.get(2));

  Collection<Integer> xx = new ArrayList<>();
  xx.add(31);
  xx.add(15);
  xx.add(81);
  xx.add(17);
  
  Iterator<Integer> values = xx.iterator();
  while (values.hasNext()) {
    System.out.println(values.next());
  }

  

  }
}
