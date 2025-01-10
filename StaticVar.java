class Earth
{
  String name;
  String food;
  static String solarSystem;
  // * just like how the solar system does not belong to anybody but everybody has access to using it that implies when you want to call it u use the class name which is the earth...

  // * look at static variable or method are something that is global.....

  
  public void show(){
    System.out.println("The " + solarSystem + " make " + food + " for " + name);
  }
}

public class StaticVar {
  public static void main(String[] args) {
    Earth person1 = new Earth();
    person1.name = "Alex";
    person1.food = "Rice";
    Earth.solarSystem = "Sun";
    person1.show();

    Earth person2 = new Earth();
    person2.name = "Ronald";
    person2.food = "Yam";
    Earth.solarSystem = "Sun";
    person2.show();



    // FamilyMouthKit husband = new FamilyMouthKit();
    // husband.brush = "Unilever";
    // husband.brushingTime = 7;
    // FamilyMouthKit.paste = "Oral B";
    // husband.show();
    
    // FamilyMouthKit wife = new FamilyMouthKit();
    // wife.brush = "Johnson";
    // wife.brushingTime = 8;
    // FamilyMouthKit.paste = "Oral B";
    // wife.show();
    
  }
}

class FamilyMouthKit 
{
  String brush;
  static String paste;
  int brushingTime;

  public void show(){
    System.out.println("I brush " + brushingTime + " with " + brush + " brush and " + paste);
  }
}