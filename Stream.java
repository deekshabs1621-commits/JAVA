import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream {

    public static void main(String[] args){
        List<String> name= Arrays.asList("jagan","deejan","deeksha","himu");
        Stream<String> s1=name.stream().filter(names -> names.startsWith("A")).map( names -> names.toUpperCase());
        s1.forEach(System.out::println);
    }
}
