import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sett {
  public static void main(String[] args) {
    
    Set<Integer> numbs = new HashSet<Integer>();
            numbs.add(4);
            numbs.add(3);
            numbs.add(9);
            numbs.add(48);
            numbs.add(4);
            
            Iterator<Integer> n = numbs.iterator();
            while (n.hasNext()) {
                System.out.println(n.next());
            }
            System.out.println(numbs);

            Collection<Integer> numbss = new TreeSet<Integer>();
            numbss.add(4);
            numbss.add(3);
            numbss.add(9);
            numbss.add(48);
            numbss.add(4);

            for (Integer v : numbss) {
                System.out.print(v + " ");
            }
            
            Iterator<Integer> n = numbss.iterator();
            while (n.hasNext()) {
                System.out.println(n.next());
            }
  }
}
