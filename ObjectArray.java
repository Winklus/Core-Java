class Student {
  int rollNumb;
  String name;
  double mark;
  
}
public class ObjectArray {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.rollNumb = 01;
    s1.name = "Albert";
    s1.mark = 99.9;

    Student s2 = new Student();
    s2.rollNumb = 02;
    s2.name = "Einstein";
    s2.mark = 99.89;

    Student s3 = new Student();
    s3.rollNumb = 03;
    s3.name = "Tesla";
    s3.mark = 99.87;

    Student[] sArray = new Student[3];
    sArray[0] = s1;
    sArray[1] = s2;
    sArray[2] = s3;

    for(int i = 0; i < sArray.length; i++){
      System.out.println(sArray[i].name + " : " + sArray[i].mark);
    }

    //  Enhance For Loop
    
    for (Student stu : sArray) {
      System.out.println(stu.name + " : " + stu.mark);
    }

  }
}
