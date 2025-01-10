import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class  Student
{
String name;
int age;
public Student(int age, String name) {
  this.name = name;
  this.age = age;
}
  
}

public class ArrayL {
  public static void main(String[] args) {

    Collection<Integer> numb = new ArrayList<Integer>();
    numb.add(7);
    numb.add(8);
    numb.add(25);
    numb.add(27);
    numb.add(21);
// * to print the ArrayList numbs
    System.out.println(numb);
// * to print each value from the ArrayList u use a for loop

for (Integer in : numb) {
  System.out.println(in);
}
System.out.println("");
// * if u just want to add and remove value u can use Collection but if u want to use index value u should use a List cos list support index value....

// * List of numbers

List<Integer> xx = new ArrayList<Integer>();
xx.add(4);
xx.add(12);
xx.add(3);
xx.add(45);
xx.add(12);

System.out.println(xx);
System.out.println("");
System.out.println(xx.get(3));
System.out.println("");
for(int i = 0; i < xx.size(); i++){
  System.out.println(xx.get(i));
}
System.out.println("");


// * Using List
    
    List<Student> studs = new ArrayList<Student>();
        studs.add(new Student(72, "Jerry"));
        studs.add(new Student(17, "Paul"));
        studs.add(new Student(27, "Alice"));
        studs.add(new Student(45, "Josh"));
        studs.add(new Student(12, "Karen"));
        studs.add(new Student(67, "Eric"));
        studs.add(new Student(71, "Ali"));
        studs.add(new Student(12, "Alexander The Great"));

        Comparator<Student> com = (i, j) -> i.age > j.age ?  1 :  -1;

        Collections.sort(studs, com);

        for (Student s : studs) {
            System.out.println(s);
        }
  }
}
