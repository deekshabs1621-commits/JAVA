 import java.util.LinkedList;
import java.util.List;

public class list3 {
    public static void main(String[] args) {
        List<String> l=new LinkedList<>();
        l.add("N");
        System.out.println(l);
        l.add(1,"O");
        System.out.println(l);
        l.add("L");
        System.out.println(l);
        l.add(3,"P");
        System.out.println(l);
        l.addLast("V");
        System.out.println(l);
        l.addFirst("O");
        System.out.println(l);
        System.out.println(l.equals("A"));
        System.out.println(l.reversed());
        l.set(3,"N");
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.indexOf(3));
        l.getLast();
        System.out.println(l);
        System.out.println(l.contains("j"));
        System.out.println(l.hashCode());
    }
}

