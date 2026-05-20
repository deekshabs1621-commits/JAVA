import java.util.Stack;

public class stack{
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        System.out.println(s);
        s.add(20);
        System.out.println(s);
        s.add(2,30);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.empty());
        System.out.println(s.search(20));
        s.addElement(30);
        System.out.println(s);
        s.addFirst(50);
        System.out.println(s);
        s.addLast(40);
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.clone());
        System.out.println(s.contains(3));
        System.out.println(s.elementAt(4));
        System.out.println(s.firstElement());
        System.out.println(s.reversed());
        System.out.println(s.get(0));
        System.out.println(s.getFirst());
        System.out.println(s.getLast());
    }
}
