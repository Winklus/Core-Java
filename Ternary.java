public class Ternary {
  public static void main(String[] args) {

int n = 10;
int result = 0;

result = n % 2 == 0 ? 2 : 1;

System.out.println(result); 

boolean isSunday = true;
boolean y;

y = isSunday ? false : true;
System.out.println(y);
  
String day = "monday";
String action = null;

action = day != "sunday" ? "go to work" : "go to church";
System.out.println(action);

  }

}
