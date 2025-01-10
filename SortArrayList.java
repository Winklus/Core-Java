import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayList {
  
  public static void main(String[] args) {
    List<Integer> numbs = new ArrayList<>();
    numbs.add(730);
    numbs.add(568);
    numbs.add(101);
    numbs.add(777);
    numbs.add(424);
    numbs.add(802);
    numbs.add(372);
    numbs.add(109);
    numbs.add(128);

    Comparator<Integer> c = (i, j) -> {
        if(i % 10 > j % 10)
          return 1;
        else
          return -1;
    };

    Comparator<Integer> co = (i, j) -> {
      if(i   > j )
        return 1;
      else
        return -1;
  };

    Collections.sort(numbs, c);
    System.out.println(numbs);


    List<String> stud = new ArrayList<>();
    stud.add("paul");
    stud.add("peter");
    stud.add("paulina");
    stud.add("charles");
    stud.add("helen");
    stud.add("alex");
    stud.add("comfort");
    stud.add("Herbert");
    stud.add("Alexander");

    Comparator<String> cc = (a, b) -> {
      if(a.length() > b.length())
        return 1;
      else
        return -1;
    };

    Collections.sort(stud, cc);
    System.out.println(stud);
  }
}
