package tool;

import frontend.css.Css;
import frontend.css.Student;


// make sure u give a importing frontend , css and all the file like the import example above.
// this import every file inside the css folder
public class Pack {
  public static void main(String[] args) {
    Student a = new Student();
    System.out.println(a.getAge());
    a.intro();
     
    Css c = new Css();
    int r1 = c.addT(5, 18);
    System.out.println(r1);
    int r2 = c.addT(7, 90);
    System.out.println(r2);
  }
}
