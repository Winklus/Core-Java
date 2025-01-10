
import java.util.HashMap;
import java.util.Map;

public class Mmap {
  public static void main(String[] args) {
    
    Map<String, Integer> student = new HashMap<>();
    
    student.put("Alexander", 80);
    student.put("Herbert", 99);
    student.put("Alex", 80);
    student.put("Antelope", 97);
    student.put("Alexis", 34);
    student.put("Pepe", 87);

    // System.out.println(student.keySet());

    for (String key : student.keySet()) {
      System.out.println(key + " : " + student.get(key));
    }
  }
}
