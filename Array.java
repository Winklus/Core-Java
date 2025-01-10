

public class Array {
  public static void main(String[] args) {
    
    int[] numbs = {1,2,3,4,5,6,7,8,9,12,45,67};
    for (int i : numbs) {
      if(i % 2 == 0)
        System.out.println(i * 2);
    }

    String[] students = new String[5];
    students[0] = "Paul";
    students[1] = "Jerry";
    students[2] = "Abraham";
    students[3] = "Social";
    students[4] = "Nigeria";

    for (String s : students) {
      System.out.println(s);
    }

    for(int i = 0; i < students.length; i++){
      System.out.println(students[i]);
    }

  }
}
