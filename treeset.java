import java.util.HashSet;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
       TreeSet<Integer> t=new TreeSet<>();
        t.add(10);
        t.add(51);
        t.add(2);
        t.add(20);
        System.out.println(t);
        t.remove(10);
        System.out.println(t);
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.lower(30));
        System.out.println(t.higher(18));
        System.out.println(t.floor(30));
        System.out.println(t.ceiling(18));
        System.out.println(t.isEmpty());
        System.out.println(t.contains(2));
        System.out.println(t.descendingSet());
        System.out.println(t.size());
        System.out.println(t);
    }
}