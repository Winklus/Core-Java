class Earth
{
  String name;
  String food;
  static String solarEnergy;
  public void show(){
    System.out.println("The " + solarEnergy + " make " + food + " for " + name);
  }

  public static void show1(Earth p){
    System.out.println("The " + solarEnergy + " make " + p.food + " for " + p.name);
  }

}

public class StaticMeth 
{

  public static void main(String[] args) {
    
    Earth person1 = new Earth();
    person1.name = "Alex";
    person1.food = "Rice";
    Earth.solarEnergy = "Sun";
    person1.show();

    Earth person2 = new Earth();
    person2.name = "Ronald";
    person2.food = "Yam";
    Earth.solarEnergy = "Sun";
    person2.show();

    Earth.show1(person1);
    Earth.show1(person2);

  }
}



