class Human 
{
  private String buttock;
  private String breast;
  public String hand; 

  public void setButtock(String s){
    buttock = s;
  }
  public void setBreast(String b){
    breast = b;
  }
  public String getButtock(){
    return buttock;
  }
  public String getBreast(){
    return breast;
  }
}


public class Encap {
  public static void main(String[] args) {
    Human p1 = new Human();
    p1.setBreast("what a wonderful breast");
    p1.setButtock("small bum bum is shaking!");
    System.out.println(p1.getButtock());
    System.out.println(p1.getBreast());
  }
}
