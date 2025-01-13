import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApii {
  public static void main(String[] args) {
    List<Integer> li = Arrays.asList(2,8,4,3,6,1,7);

    Stream<Integer> s1 = li.stream();
    Stream<Integer> s2 = s1.filter(b -> b % 2 == 0);
    Stream<Integer> s3 = s2.map(c -> c * 2);
    int result = s3.reduce(0, (c, e) -> c + e);

    System.out.println(result);

    int result1 = li.stream()
                          .filter(k -> k % 2 == 0)
                          .map(l -> l * 2)
                          .reduce(0, (m, n) -> m + n);
  System.out.println(result1);
  }
}
