class Human
{
  private int age;
  private String name;
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
    // this.age is referring to the instance variable age while age is referring to the local variable
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
        // this.name is referring to the instance variable age while name is referring to the local variable
  }
  public void aboutSelf(Human hum){
    System.out.println("My name is " + name + " I am " + age + " old");
  }

  
}
public class Thiss 
{
  public static void main(String[] args) {
    Human h1 = new Human();
    h1.setAge(27);
    h1.setName("Alexander The Great");
    h1.aboutSelf(h1);

    Human h2 = new Human();
    h2.setAge(12);
    h2.setName("Johnson");
    h2.aboutSelf(h2);
  }
}
