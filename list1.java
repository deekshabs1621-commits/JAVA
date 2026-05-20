import java.util.ArrayList;
import java.util.List;

public class list1 {
    public static void main(String[] args) {
        List<Integer> l =new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(2,30);
        System.out.println(l);
        l.addFirst(0);
        System.out.println(l);
        l.addLast(40);
        System.out.println(l);
        l.remove(0);
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.get(0);
        System.out.println(l);
        System.out.println(l.contains(9));
        System.out.println(l.equals(60));
        l.size();
        System.out.println(l);
        l.set(0,80);
        System.out.println(l);
        System.out.println(l.reversed());
        System.out.println(l.indexOf(3));
        System.out.println(l.isEmpty());
        System.out.println(l.hashCode());
        l.getLast();
        System.out.println(l);
    }
}
