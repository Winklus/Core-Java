import java.util.HashMap;
import java.util.Map;

public class Mapp {
  public static void main(String[] args) {
    
    Map<String, Integer> gradeBook = new HashMap<String, Integer>();

            gradeBook.put("Alice", 90);
            gradeBook.put("Herbert", 99);
            gradeBook.put("Joy", 67);
            gradeBook.put("Paulo G", 90);
            gradeBook.put("Chance", 89);
            gradeBook.put("Kehn", 97);
            
            for (String name : gradeBook.keySet()) {
                System.out.println(name + " : " + gradeBook.get(name));
            }

  }
}
