import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Students
{
  String name;
  int age;
  public Students(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String toString() {
    return "Students [name=" + name + ", age=" + age + "]";
  }
}
public class SortArrayList {
  
  public static void main(String[] args) {

    List<Students> students = new ArrayList<>();
    students.add(new Students("paul", 13));
    students.add(new Students("peace", 23));
    students.add(new Students("marvel", 2));
    students.add(new Students("chimamaka", 43));
    students.add(new Students("peter", 203));
    students.add(new Students("james", 237));


    Comparator<Students> cm = new Comparator<Students>() {

      public int compare(Students o1, Students o2) {
        if(o1.age > o2.age)
          return 1;
        else
          return -1;
      }
    };

    Collections.sort(students, cm);

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
