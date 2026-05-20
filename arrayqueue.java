import java.util.ArrayDeque;
public class arrayqueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> p = new ArrayDeque<>();
        p.offer(30);
        System.out.println(p);
        p.add(20);
        System.out.println(p);
        p.push(6);
        System.out.println(p);
        p.poll();
        System.out.println(p);
        p.offerFirst(20);
        System.out.println(p);
        p.offerLast(46);
        System.out.println(p);
        p.addFirst(12);
        System.out.println(p);
        p.addLast(23);
        System.out.println(p);
        p.isEmpty();
        System.out.println(p);
        p.element();
        System.out.println(p);
        p.clear();
        System.out.println(p);
        p.clone();
        System.out.println(p);
        p.size();
        System.out.println(p);
        p.spliterator();
        System.out.println(p);
        p.toArray();
        System.out.println(p);
    }
}

