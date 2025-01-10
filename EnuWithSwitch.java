enum Status
{
  Running, Pending, Failed, Success
}

public class EnuWithSwitch 
{
  public static void main(String[] args) {

    Status y = Status.Success;
    switch (y) {
      case Running -> System.out.println("All good");
      case Pending -> System.out.println("try again");
      case Failed -> System.out.println("check your network and try again");
      case Success -> System.out.println("connection is successful");
      default -> System.out.println("status not available");
    }

    Status s = Status.Failed;

    if (s == Status.Running) {
      System.out.println("All good");
    }else if(s == Status.Pending) {
      System.out.println("try again");
    }else if(s == Status.Failed) {
      System.out.println("check your network and try again");
    }else if(s == Status.Success) {
      System.out.println("connection is successful");
    }else{
      System.out.println("status not available");
    }


    Status x = Status.Pending;
    switch (x) {
      case Running:
        System.out.println("All good");
        break;
      case Pending:
        System.out.println("try again");
        break;
      case Failed:
        System.out.println("check your network and try again");
        break;
      case Success:
        System.out.println("connection is successful");
        break;
      default:
        System.out.println("status not available");
        break;
    }

  }
}

// * enum is a class but you cannot extend enum with any other class