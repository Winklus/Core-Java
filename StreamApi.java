import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
  public static void main(String[] args) {
    
    List<Integer> numbs = Arrays.asList(4,7,4,9,12,4,7,4,2,8,5,9,6);
    
    int sum = 0;
    for(int i = 0; i < numbs.size(); i++){
      if(i % 2 == 0)
        sum += i;
      System.out.println(sum);
    }

    for (Integer in : numbs) {
      System.out.println(in);
    }

    numbs.forEach(a -> System.out.println(a * 2));

    
    Stream<Integer> st = numbs.stream();

    st.forEach(n -> System.out.println(n * 2));

  }
}
