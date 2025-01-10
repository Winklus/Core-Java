import frontend.css.Css;
import frontend.css. Student;

// * IMPORTANT, make sure when structuring ur project into folder, u will have one file in the root folder that will hold ur main method just like when structuring mern stack project u always have a server.js or index.js the holds the basic information for ur application!!!!!!!!!!

public class Main {
  public static void main(String[] args) {
    Student s = new Student();
    s.intro();
    System.out.println(s.getAge());
    System.out.println(s.getName());

    Css c = new Css();
    int r4 = c.addT(56, 89);
    System.out.println(r4);

  }
}
