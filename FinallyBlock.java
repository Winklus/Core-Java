import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyBlock {
  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = null;
    try
    {
      System.out.println("enter a two digit number");
      InputStreamReader in = new InputStreamReader(System.in);
      br = new BufferedReader(in);
      int y = Integer.parseInt(br.readLine()); 
      System.out.println(y);
    }
    finally
    {
      br.close();
    }
  }
}
