import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class inter5 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(4, 7, 9, 3, 2);
        Stream<Integer> s1 = l.stream();
        s1.forEach(System.out::println);
    }
}
